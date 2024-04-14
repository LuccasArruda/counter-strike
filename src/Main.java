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
        int I;
        int J;
        int Valor = 0;

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
        Times.add(new Time("Tylano", JogadoresB));
        Times.add(new Time("Buenas", JogadoresA));
        Times.add(new Time("Polinor", JogadoresB));
        Times.add(new Time("Trenal", JogadoresA));
        Times.add(new Time("Garen", JogadoresA));
        Times.add(new Time("Bulper", JogadoresB));
        Times.add(new Time("Mach", JogadoresB));
        Times.add(new Time("Nambor", JogadoresA));
        Times.add(new Time("Chars", JogadoresB));
        Times.add(new Time("Xenao", JogadoresA));
        Times.add(new Time("Zelper", JogadoresB));
        Times.add(new Time("Carix", JogadoresA));

        Campeonato = new Campeonato(Times);
        Campeonato.getPartidas().getFirst().setRodadasGanhasTerroristas(30);
        Campeonato.getPartidas().get(1).setRodadasGanhasTerroristas(30);
        Campeonato.getPartidas().get(2).setRodadasGanhasTerroristas(30);
        Campeonato.getPartidas().get(3).setRodadasGanhasTerroristas(30);
        Campeonato.getPartidas().get(4).setRodadasGanhasTerroristas(30);
        Campeonato.getPartidas().get(5).setRodadasGanhasTerroristas(30);
        Campeonato.getPartidas().get(6).setRodadasGanhasTerroristas(30);
        Campeonato.getPartidas().get(7).setRodadasGanhasTerroristas(30);
        Campeonato.atualizaCampeonato();
        Campeonato.getPartidas().get(8).setRodadasGanhasTerroristas(30);
        Campeonato.getPartidas().get(9).setRodadasGanhasTerroristas(30);
        Campeonato.getPartidas().get(10).setRodadasGanhasTerroristas(30);
        Campeonato.getPartidas().get(11).setRodadasGanhasTerroristas(30);
        Campeonato.atualizaCampeonato();
        Campeonato.getPartidas().get(12).setRodadasGanhasTerroristas(30);
        Campeonato.getPartidas().get(13).setRodadasGanhasTerroristas(30);
        Campeonato.atualizaCampeonato();
        Campeonato.getPartidas().get(14).setRodadasGanhasTerroristas(30);
        Campeonato.atualizaCampeonato();

    }
}