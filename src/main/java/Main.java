import View.Inicio;
import View.SaidaDosDados;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {
        Inicio inicio = new Inicio();
        String nome = inicio.pegarNome();
        LocalDateTime localDateTimeUser = inicio.pegarDadosNascimento();
        String localNascimento = inicio.pegarLocalNascimento();

        SaidaDosDados saidaDosDados = new SaidaDosDados();
        saidaDosDados.imprimirDados(nome, localDateTimeUser, localNascimento);
    }

}

