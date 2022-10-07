package Controller;

import java.time.LocalTime;

public class SignosLunares {

    public static String signoLunar(LocalTime time, String zona) {

        if (zona.contains("Recife")) {
            if (time.isAfter(LocalTime.NOON)) {
                return "Casimiro";
            }
        }

        if (zona.contains("Cuiabá") || zona.contains("Cuiaba")) {
            if (time.isBefore(LocalTime.NOON)) {
                return "Odin";
            }
        }

        if (zona.contains("São_Paulo") || zona.contains("Sao_Paulo")) {
            return "Gandalf";
        }

        return "Em construção!";
    }

}
