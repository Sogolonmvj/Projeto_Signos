package View;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Scanner;

public class Inicio {

    Scanner scan = new Scanner(System.in);

    public String pegarNome() {
        System.out.print("Digite seu nome: ");
        return scan.nextLine();
    }

    public LocalDateTime pegarDadosNascimento() {
        System.out.print("Digite o dia do seu nascimento: ");
        int dia = scan.nextInt();

        System.out.print("Digite o mês do seu nascimento: ");
        Month mes = Month.of(scan.nextInt());

        System.out.print("Digite o ano do seu nascimento: ");
        int ano = scan.nextInt();

        System.out.print("Digite o horário de nascimento: ");
        LocalTime horario = LocalTime.parse(scan.next());

        return LocalDateTime.of(ano, mes, dia, horario.getHour(), horario.getMinute(), horario.getSecond());
    }

    public String pegarLocalNascimento() {
        System.out.print("Digite o local de nascimento: ");
        return scan.next();
    }

}
