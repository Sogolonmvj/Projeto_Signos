package Controller;

import java.time.LocalTime;

import static Controller.Verificador.isWithinRange;

public class Ascendentes {
    public static String ascendente(String signo, LocalTime horarioNascimento) {

        if ("Aries".equalsIgnoreCase(signo)) {
            if (isWithinRange(horarioNascimento, LocalTime.of(6, 31), LocalTime.of(8,30))) {
                return "Touro";
            }

            if (isWithinRange(horarioNascimento, LocalTime.of(8, 31), LocalTime.of(10,30))) {
                return "Gêmeos";
            }

            if (isWithinRange(horarioNascimento, LocalTime.of(10, 31), LocalTime.of(12,30))) {
                return "Cancer";
            }

            if (isWithinRange(horarioNascimento, LocalTime.of(12, 31), LocalTime.of(14,30))) {
                return "Leão";
            }

            if (isWithinRange(horarioNascimento, LocalTime.of(14, 31), LocalTime.of(16,30))) {
                return "Virgem";
            }

            if (isWithinRange(horarioNascimento, LocalTime.of(16, 31), LocalTime.of(18,30))) {
                return "Libra";
            }

            if (isWithinRange(horarioNascimento, LocalTime.of(18, 31), LocalTime.of(20,30))) {
                return "Escorpião";
            }

            if (isWithinRange(horarioNascimento, LocalTime.of(20, 31), LocalTime.of(22,30))) {
                return "Sagitário";
            }

            if (isWithinRange(horarioNascimento, LocalTime.of(22, 31), LocalTime.of(0,30))) {
                return "Capricórnio";
            }

            if (isWithinRange(horarioNascimento, LocalTime.of(0, 31), LocalTime.of(2,30))) {
                return "Aquário";
            }

            if (isWithinRange(horarioNascimento, LocalTime.of(2, 31), LocalTime.of(4,30))) {
                return "Peixes";
            }

            if (isWithinRange(horarioNascimento, LocalTime.of(4, 31), LocalTime.of(6,30))) {
                return "Áries";
            }
        }

        else if ("Sagitário".equalsIgnoreCase(signo)) {
            if (isWithinRange(horarioNascimento, LocalTime.of(6, 31), LocalTime.of(8,30))) {
                return "Capricórnio";
            }

            if (isWithinRange(horarioNascimento, LocalTime.of(8, 31), LocalTime.of(10,30))) {
                return "Aquário";
            }

            if (isWithinRange(horarioNascimento, LocalTime.of(10, 31), LocalTime.of(12,30))) {
                return "Peixes";
            }

            if (isWithinRange(horarioNascimento, LocalTime.of(12, 31), LocalTime.of(14,30))) {
                return "Áries";
            }

            if (isWithinRange(horarioNascimento, LocalTime.of(14, 31), LocalTime.of(16,30))) {
                return "Touro";
            }

            if (isWithinRange(horarioNascimento, LocalTime.of(16, 31), LocalTime.of(18,30))) {
                return "Gêmeos";
            }

            if (isWithinRange(horarioNascimento, LocalTime.of(18, 31), LocalTime.of(20,30))) {
                return "Câncer";
            }

            if (isWithinRange(horarioNascimento, LocalTime.of(20, 31), LocalTime.of(22,30))) {
                return "Leão";
            }

            if (isWithinRange(horarioNascimento, LocalTime.of(22, 31), LocalTime.of(0,30))) {
                return "Virgem";
            }

            if (isWithinRange(horarioNascimento, LocalTime.of(0, 31), LocalTime.of(2,30))) {
                return "Libra";
            }

            if (isWithinRange(horarioNascimento, LocalTime.of(2, 31), LocalTime.of(4,30))) {
                return "Escorpião";
            }

            if (isWithinRange(horarioNascimento, LocalTime.of(4, 31), LocalTime.of(6,30))) {
                return "Sagitário";
            }
        }

        else if ("Leão".equalsIgnoreCase(signo)) {
            if (isWithinRange(horarioNascimento, LocalTime.of(6, 31), LocalTime.of(8,30))) {
                return "Virgem";
            }

            if (isWithinRange(horarioNascimento, LocalTime.of(8, 31), LocalTime.of(10,30))) {
                return "Libra";
            }

            if (isWithinRange(horarioNascimento, LocalTime.of(10, 31), LocalTime.of(12,30))) {
                return "Escorpião";
            }

            if (isWithinRange(horarioNascimento, LocalTime.of(12, 31), LocalTime.of(14,30))) {
                return "Sagitário";
            }

            if (isWithinRange(horarioNascimento, LocalTime.of(14, 31), LocalTime.of(16,30))) {
                return "Capricórnio";
            }

            if (isWithinRange(horarioNascimento, LocalTime.of(16, 31), LocalTime.of(18,30))) {
                return "Aquário";
            }

            if (isWithinRange(horarioNascimento, LocalTime.of(18, 31), LocalTime.of(20,30))) {
                return "Peixes";
            }

            if (isWithinRange(horarioNascimento, LocalTime.of(20, 31), LocalTime.of(22,30))) {
                return "Áries";
            }

            if (isWithinRange(horarioNascimento, LocalTime.of(22, 31), LocalTime.of(0,30))) {
                return "Touro";
            }

            if (isWithinRange(horarioNascimento, LocalTime.of(0, 31), LocalTime.of(2,30))) {
                return "Gêmeos";
            }

            if (isWithinRange(horarioNascimento, LocalTime.of(2, 31), LocalTime.of(4,30))) {
                return "Câncer";
            }

            if (isWithinRange(horarioNascimento, LocalTime.of(4, 31), LocalTime.of(6,30))) {
                return "Leão";
            }
        }

        return "Ascendente não disponível!";
    }
}
