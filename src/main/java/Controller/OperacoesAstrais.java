package Controller;

import Model.MapaAstral;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Set;

import static Controller.Ascendentes.ascendente;
import static Controller.Signos.signo;
import static Controller.SignosLunares.signoLunar;
import static Controller.Verificador.verificar;

public class OperacoesAstrais {

    public static MapaAstral mapaAstral(String nome, LocalDateTime dataHoraNascimento, String localNascimento) {
        Period period = Period.between(dataHoraNascimento.toLocalDate(), LocalDate.now());

        String idade = String.valueOf(period.getYears());

        ZoneId zonaNascimento = encontrarZona(localNascimento);

        String lugarNascimento = zonaNascimento.toString();

        ZoneOffset currentOffsetForMyZone = zonaNascimento.getRules().getOffset(dataHoraNascimento);
        String fusoHorario = currentOffsetForMyZone.toString();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy, HH:mm:ss");
        String dataFormatada = formatter.format(dataHoraNascimento);

        String anoBissexto = verificar(dataHoraNascimento.toLocalDate());

        String signo = signo(dataHoraNascimento.toLocalDate());

        String ascendente;

        if (dataHoraNascimento.getYear() > 1976) {
            ascendente = ascendente(signo(dataHoraNascimento.toLocalDate()), dataHoraNascimento.toLocalTime().minusHours(2));
        } else if (dataHoraNascimento.getYear() > 1946 && dataHoraNascimento.getYear() < 1975) {
            ascendente = ascendente(signo(dataHoraNascimento.toLocalDate()), dataHoraNascimento.toLocalTime().minusHours(1));
        } else {
            ascendente = ascendente(signo(dataHoraNascimento.toLocalDate()), dataHoraNascimento.toLocalTime());
        }

        String signoLunar = signoLunar(dataHoraNascimento.toLocalTime(), localNascimento);

        return new MapaAstral(nome, idade, lugarNascimento, dataFormatada, anoBissexto, fusoHorario, signo, ascendente, signoLunar);
    }

    private static ZoneId encontrarZona(String localNascimento) {
        Set<String> zones = ZoneId.getAvailableZoneIds();
        for (String zone : zones) {
            if (zone.contains(localNascimento)) {
                return ZoneId.of(zone);
            }
        }
        return ZoneId.of("America/Recife");
    }
}
