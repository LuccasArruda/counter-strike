import java.util.ArrayList;
import java.util.Collections;

public class Campeonato {
    private Time Ganhador;
    private ArrayList<Partida> Partidas;
    private ArrayList<Time> TimesVencedores;
    private ArrayList<Partida> PartidasFinalizadas;
    private ArrayList<Time> TimesParticipantes;

    public Campeonato(ArrayList<Partida> partidas){
        setPartidas(partidas);
    }

    public void setPartidas(ArrayList<Partida> partidas) {
        this.Partidas = partidas;
    }

    public void setGanhador(Time ganhador) {
        int timesVencedores;
        int I;

        timesVencedores = getTimesVencedores().size();
        for (I = 0; I < timesVencedores; I++){

        }

        this.Ganhador = ganhador;
    }

    public Time getGanhador() {
        return this.Ganhador;
    }

    public ArrayList<Partida> getPartidas() {
        return this.Partidas;
    }

    private void atualizarTimesVencedores(){
        int I;
        ArrayList<Time> timesVencedoresPartidas;
        int partidasFinalizadas;
        Time campeaoPartida;

        timesVencedoresPartidas = new ArrayList<Time>();
        partidasFinalizadas = getPartidasFinalizadas().size();
        for (I = 0; I < partidasFinalizadas; I++){
            campeaoPartida = getPartidas().get(I).getGanhador();
            timesVencedoresPartidas.add(campeaoPartida);
        }
        this.TimesVencedores = timesVencedoresPartidas;
    }

    public void atualizaTimesParticipantes(){
        int I;
        int partidasCampeonato;
        Time timeParticipante;
        Time timeTerrorista;
        Time timeContraTerrorista;

        partidasCampeonato = getPartidas().size();
        for (I = 0; I < partidasCampeonato; I++){
            timeParticipante = this.TimesParticipantes.get(I);
            timeTerrorista = getPartidas().get(I).getTerroristas();
            timeContraTerrorista = getPartidas().get(I).getContraTerroristas();
            if (timeTerrorista.equals(timeParticipante)){
                this.TimesParticipantes.add(timeTerrorista);
            }

            if (timeContraTerrorista.equals(timeParticipante)){
                this.TimesParticipantes.add(timeTerrorista);
            }
        }
    }

    private void atualizarPartidasFinalizadas(){
        int I;
        int partidasCampeonato;
        String statusPartida;
        Partida partidaFinalizada;

        partidasCampeonato = getPartidas().size();
        for (I = 0; I < partidasCampeonato; I++){
            statusPartida = getPartidas().get(I).getStatusPartida();
            if (statusPartida.equals("Finalizada")){
                partidaFinalizada = getPartidas().get(I);
               this.PartidasFinalizadas.add(partidaFinalizada);
            }
        }
    }

    public ArrayList<Time> getTimesVencedores() {
        atualizarTimesVencedores();
        return this.TimesVencedores;
    }



    public ArrayList<Partida> getPartidasFinalizadas() {
        atualizarPartidasFinalizadas();
        return this.PartidasFinalizadas;
    }

    public void informacoesCampeonato(){
        System.out.println("Informações do Campeonato: ");
        System.out.println("Partidas Finalizadas: " + getPartidasFinalizadas().size() + " de 30");
        if (this.Ganhador != null){
            System.out.println("Time Ganhador do Campeonato: " + getGanhador().getNome());
        }
    }

}

