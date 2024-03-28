import java.util.Arrays;
public class Time {
    private String nome;
    private Jogador[] jogadores;
    private int quantidadeDeJogadores = 0;
    private Tecnico tecnico;
    private Presidente presidente;
    private Estadio estadio;

    public Time(boolean inicializarTime){
        Jogador jogador1 = new Jogador(), jogadores[];

        jogadores = new Jogador[2];
        jogadores[0] = jogador1;
        jogadores[1] = new Jogador("Jean", 30, 30000, 10);

        setNome("Atlético Ararense");
        setJogadores(jogadores);
        setEstadio(new Estadio());
        setTecnico(new Tecnico());
        setPresidente(new Presidente());
    }

    public Time(){}

    public Time(String nome, Jogador[] jogadores, Estadio estadio, Tecnico tecnico, Presidente presidente){
        setNome(nome);
        setJogadores(jogadores);
        setEstadio(estadio);
        setTecnico(tecnico);
        setPresidente(presidente);
    }

    public void setNome(String nome) {
        if (!nome.isEmpty()){
            this.nome = nome;
        } else {
            System.out.println("Informe o nome do time!");
        }
    }

    public int setQuantidadeDeJogadores(int quantidadeDeJogadores) {
        if(quantidadeDeJogadores >= 11 && quantidadeDeJogadores <= 18){
            this.quantidadeDeJogadores += quantidadeDeJogadores;
            return 0;
        } else {
            System.out.println("O time deve ter no mínimo 11 e no máximo 18 jogadores!");
            return 1;
        }
    }

    public void setPresidente(Presidente presidente) {
        this.presidente = presidente;
    }

    public int setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
        return setQuantidadeDeJogadores(jogadores.length);
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }

    public void setEstadio(Estadio estadio) {
        this.estadio = estadio;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidadeDeJogadores() {
        return quantidadeDeJogadores;
    }

    public Presidente getPresidente() {
        return presidente;
    }

    public Jogador[] getJogadores() {
        return this.jogadores;
    }

    public Estadio getEstadio() {
        return estadio;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public void listaJogadores(){
        int i;
        System.out.println("\nJogadores do time " + this.nome + ":");
        System.out.println(getQuantidadeDeJogadores());
        for(i = 0; i < getQuantidadeDeJogadores(); i++){
            System.out.println("\nJogador " + (i+1) + ":");
            jogadores[i].exibeInformacoesJogador();
        }
    }
}
