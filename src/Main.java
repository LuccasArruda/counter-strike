import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Jogador Jogador2;
        Jogador Jogador1;
        Jogador Jogador3;
        Jogador Jogador4;
        ArrayList<Jogador> JogadoresA;
        ArrayList<Jogador> JogadoresB;
        Time TimeB;
        Time TimeA;
        Partida Partida;

        Jogador1 = new Jogador("FalleN");
        Jogador2 = new Jogador("HEN1");
        Jogador3 = new Jogador("Zakk");
        Jogador4 = new Jogador("KSCERATO");

        JogadoresA = new ArrayList<Jogador>();
        JogadoresA.add(Jogador1);
        JogadoresA.add(Jogador2);

        JogadoresB = new ArrayList<Jogador>();
        JogadoresB.add(Jogador3);
        JogadoresB.add(Jogador4);

        TimeA = new Time("Furia", JogadoresA);
        TimeB = new Time("Imperial", JogadoresB);

        Partida = new Partida(TimeA, TimeB);
        Partida.setRodadasGanhasContraTerroristas(29);
        Partida.informacoesPartida();
        Partida.setRodadasGanhasTerroristas(1);

    }
}