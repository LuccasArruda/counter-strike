import java.util.ArrayList;

public class Time {
    private String Nome;
    private ArrayList<Jogador> Jogadores;

    public void setJogadores(ArrayList<Jogador> jogadores) {
        this.Jogadores = jogadores;
    }

    public void setNome(String nome) {
        this.Nome = nome;
    }

    public String getNome() {
        return this.Nome;
    }

    public ArrayList<Jogador> getJogadores() {
        return this.Jogadores;
    }

    public Time(String nome, ArrayList<Jogador> jogadores){
        setNome(nome);
        setJogadores(jogadores);
    }
}
