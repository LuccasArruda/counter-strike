import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Jogador Jogador2;
        Jogador Jogador1;
        Jogador Jogador3;
        Jogador Jogador4;
        ArrayList<Jogador> JogadoresA;
        ArrayList<Jogador> JogadoresB;
        ArrayList<Time> Times;
        Partida Partida;
        Campeonato Campeonato;

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

        Times = new ArrayList<Time>();
        Times.add(new Time("Furia", JogadoresA));
        Times.add(new Time("Imperial", JogadoresB));
        Times.add(new Time("Gerino", JogadoresB));
        Times.add(new Time("Laner", JogadoresA));

        Campeonato = new Campeonato(Times);
        Campeonato.getPartidas().get(0).setRodadasGanhasTerroristas(30);
        Campeonato.getPartidas().get(1).setRodadasGanhasContraTerroristas(30);
        Campeonato.atualizaCampeonato();
        Campeonato.getPartidas().get(2).setRodadasGanhasContraTerroristas(30);
        Campeonato.atualizaCampeonato();
    }
}