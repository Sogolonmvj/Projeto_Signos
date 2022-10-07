package View;

import java.time.LocalDateTime;

import static Controller.OperacoesAstrais.mapaAstral;

public class SaidaDosDados {
    public void imprimirDados(String nome, LocalDateTime localDateTimeUser, String localNascimento) {
        System.out.println(mapaAstral(nome, localDateTimeUser, localNascimento));
    }
}
