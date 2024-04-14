import java.util.ArrayList;

public class Campeonato {
    private Time Ganhador;
    private ArrayList<Time> Times;
    private final ArrayList<Partida> Partidas;
    private static final int FasesCampeonato = 4;
    private int FaseCampeonatoAtual;
    private int PartidasFinalizadas;

    public Campeonato(ArrayList<Time> timesCampeonato){
        setTimes(timesCampeonato);
        this.Partidas = new ArrayList<Partida>();
        this.PartidasFinalizadas = 0;
        setFaseCampeonatoAtual(1);
        iniciaPartidas(getTimes());
    }

    public void setFaseCampeonatoAtual(int faseCampeonatoAtual) {
        this.FaseCampeonatoAtual = faseCampeonatoAtual;
    }

    private void setPartidasFinalizadas(int partidasFinalizadas) {
        PartidasFinalizadas = partidasFinalizadas;
    }

    private void adicionaPartida(Partida partida){
        this.Partidas.add(partida);
    }

    public void setTimes(ArrayList<Time> times) {
        if (times.size() != 16){
            System.out.println("Um campeonato deve ter 16 times!");
        } else {
            this.Times = times;
        }
    }

    private void setGanhador(Time ganhador) {
        this.Ganhador = ganhador;
    }

    public Time getGanhador() {
        return this.Ganhador;
    }

    public ArrayList<Time> getTimes() {
        return this.Times;
    }

    public ArrayList<Partida> getPartidas() {
        return this.Partidas;
    }

    public int getFaseCampeonatoAtual() {
        return FaseCampeonatoAtual;
    }

    private int getPartidasFinalizadas() {
        return PartidasFinalizadas;
    }

    public static int getFasesCampeonato() {
        return FasesCampeonato;
    }

    public void informacoesCampeonato(){
        int I;
        ArrayList<Partida> partidas;
        int quantidadePartidas;

        System.out.println("\nInformações do Campeonato: ");

        partidas = getPartidas();
        quantidadePartidas = partidas.size();
        for (I = 0; I < quantidadePartidas; I++){
            partidas.get(I).informacoesPartida();
        }

        if (this.Ganhador != null){
            System.out.println("Time Ganhador do Campeonato: " + getGanhador().getNome());
        }
    }

    private void iniciaPartidas(ArrayList<Time> times){
        int I;
        int quantidadeTimes;
        Time terroristas;
        Time contraTerroristas;
        Partida partida;

        System.out.println("\n===========================================");
        System.out.println("Fase atual do campeonato: " + retornaNomeFaseCampeonato(getFaseCampeonatoAtual()));
        System.out.println("===========================================");
        quantidadeTimes = times.size();
        for (I = 0; I < quantidadeTimes; I += 2){
            contraTerroristas = times.get(I);
            terroristas = times.get(I+1);
            partida = new Partida(terroristas, contraTerroristas);
            System.out.println("Uma nova partida entre " + terroristas.getNome() + " e " + contraTerroristas.getNome() + " começou!");
            adicionaPartida(partida);
        }
    }

    private int retornaQuantidadePartidasFinalizadas(){
        ArrayList<Partida> partidas;
        int I;
        int quantidadePartidas;
        String statusPartida;
        int partidasFinalizadas = 0;

        partidas = getPartidas();
        quantidadePartidas = partidas.size();
        for (I = 0; I < quantidadePartidas; I++){
            statusPartida = partidas.get(I).getStatusPartida();
            if (statusPartida.equals("Finalizada")){
                partidasFinalizadas++;
            } else {
                System.out.println("\nPartida não finalizada: " + partidas.get(I).getTerroristas().getNome() + " x " + partidas.get(I).getContraTerroristas().getNome());
            }
        }
        return partidasFinalizadas;
    }
    public void atualizaCampeonato(){
        int ultimaPartida;
        boolean todasPartidasFinalizaram;
        ArrayList<Partida> partidas;
        ArrayList<Time> timesVencedores;

        partidas = getPartidas();
        todasPartidasFinalizaram = (retornaQuantidadePartidasFinalizadas() == partidas.size());
        if (getFaseCampeonatoAtual() == getFasesCampeonato()){
            finalizaCampeonato();
        } else if (todasPartidasFinalizaram){
            avancaFaseCampeonato();
            timesVencedores = retornaTimesVencedores();
            System.out.println("\nQuantidade de Times Vencedores: " + timesVencedores.size());
            iniciaPartidas(timesVencedores);
        } else {
            System.out.println("\nAinda existem partidas em andamento!\n");
        }
    }

    private ArrayList<Time> retornaTimesVencedores(){
        ArrayList<Partida> partidas;
        int quantidadePartidas;
        int I;
        Partida partidaFinalizada;
        ArrayList<Time> timesVencedores;

        timesVencedores = new ArrayList<Time>();
        partidas = getPartidas();
        quantidadePartidas = partidas.size();

        for (I = getPartidasFinalizadas(); I < quantidadePartidas; I++){
            partidaFinalizada = partidas.get(I);
            timesVencedores.add(partidaFinalizada.getGanhador());
        }
        setPartidasFinalizadas(quantidadePartidas);
        return timesVencedores;
    }

    private void avancaFaseCampeonato(){
        setFaseCampeonatoAtual(this.FaseCampeonatoAtual += 1);
    }

    private void finalizaCampeonato(){
        int ultimaPartida;
        ArrayList<Partida> partidas;

        partidas = getPartidas();
        System.out.println("\n===========================================");
        System.out.println("Campeonato finalizado!");
        System.out.println("===========================================");
        ultimaPartida = (partidas.size()-1);
        setGanhador(partidas.get(ultimaPartida).getGanhador());
        System.out.println("O time " + getGanhador().getNome() + " venceu!");
    }

    private String retornaNomeFaseCampeonato(int faseCampeonato){
        if (faseCampeonato == 1){
            return "Eliminatórias";
        } else if (faseCampeonato == 2) {
            return "Quartas de Final";
        } else if (faseCampeonato == 3){
            return "Semi-final";
        } else {
            return "Final";
        }
    }
}

