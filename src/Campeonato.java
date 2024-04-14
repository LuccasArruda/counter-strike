import java.util.ArrayList;

public class Campeonato {
    private Time Ganhador;
    private ArrayList<Time> Times;
    private ArrayList<Partida> Partidas;
    private static final int FasesCampeonato = 20;
    private int FaseCampeonatoAtual;

    public Campeonato(ArrayList<Time> timesCampeonato){
        setTimes(timesCampeonato);
        this.Partidas = new ArrayList<Partida>();
        System.out.println("Eliminatórias");
        iniciaPartidas(getTimes());
        setFaseCampeonatoAtual(1);
    }

    public void setFaseCampeonatoAtual(int faseCampeonatoAtual) {
        this.FaseCampeonatoAtual = faseCampeonatoAtual;
    }

    private void adicionaPartida(Partida partida){
        this.Partidas.add(partida);
    }

    public void setTimes(ArrayList<Time> times) {
        if ((times.size() % 2) != 0){
            System.out.println("O número de times de um campeonato deve ser par!");
        } else if ((times.size() > 16) || (times.size() < 4)){
            System.out.println("Informe uma quantidade de times válida! [min: 2, max: 16]");
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

        quantidadeTimes = times.size();
        for (I = 0; I < quantidadeTimes; I += 2){
            contraTerroristas = times.get(I);
            terroristas = times.get(I+1);
            partida = new Partida(terroristas, contraTerroristas);
            adicionaPartida(partida);
        }
        informacoesCampeonato();
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
        if (getFaseCampeonatoAtual() == 2){
            finalizaCampeonato();
        } else if (todasPartidasFinalizaram){
            avancaFaseCampeonato();
            timesVencedores = retornaTimesVencedores();
            iniciaPartidas(timesVencedores);
        } else {
            System.out.println("\nAinda existem partidas em andamento!\n");
        }
    }

    private void finalizaCampeonato(){
        int ultimaPartida;
        ArrayList<Partida> partidas;

        partidas = getPartidas();
        System.out.println("\nCampeonato finalizado!");
        ultimaPartida = (partidas.size()-1);
        setGanhador(partidas.get(ultimaPartida).getGanhador());
        System.out.println("O time " + getGanhador().getNome() + " venceu!");
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
        for (I = 0; I < quantidadePartidas; I++){
            partidaFinalizada = partidas.get(I);
            timesVencedores.add(partidaFinalizada.getGanhador());
        }
        return timesVencedores;
    }

    private void avancaFaseCampeonato(){
        setFaseCampeonatoAtual(this.FaseCampeonatoAtual += 1);
    }

}

