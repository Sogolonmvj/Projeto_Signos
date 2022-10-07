package Model;

public class MapaAstral {

    private final String nome;
    private final String idade;
    private final String localNascimento;
    private final String dataNascimento;
    private final String anoBissexto;
    private final String timezone;
    private final String signo;
    private final String ascendente;
    private final String signoLunar;

    public MapaAstral(String nome, String idade, String localNascimento, String dataNascimento, String anoBissexto, String timezone, String signo, String ascendente, String signoLunar) {
        this.nome = nome;
        this.idade = idade;
        this.localNascimento = localNascimento;
        this.dataNascimento = dataNascimento;
        this.anoBissexto = anoBissexto;
        this.timezone = timezone;
        this.signo = signo;
        this.ascendente = ascendente;
        this.signoLunar = signoLunar;
    }

    @Override
    public String toString() {
        return "Mapa Quântico: " + '\n' +
                "\n" +
                "Nome: " + nome + '\n' +
                "Idade: " + idade + '\n' +
                "Local de Nascimento: " + localNascimento + '\n' +
                "Data de Nascimento: " + dataNascimento + '\n' +
                "Nasceu em um ano bissexto? " + anoBissexto + '\n' +
                "Fuso horário: " + timezone + '\n' +
                "Signo: " + signo + '\n' +
                "Ascendente: " + ascendente + '\n' +
                "Signo Lunar: " + signoLunar + '\n';
    }
}
