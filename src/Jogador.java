public class Jogador {
    private String Nome;

    public void setNome(String nome) {
        this.Nome = nome;
    }

    public String getNome() {
        return this.Nome;
    }

    public Jogador(String nome){
        setNome(nome);
    }
}
