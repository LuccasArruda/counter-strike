public class Produto {
    private String Nome;
    private double Preco;

    public Produto(String nome, double preco) {
        setNome(nome);
        setPreco(preco);
    }
    public void setNome(String nome) {
        Nome = nome;
    }

    public void setPreco(double preco) {
        Preco = preco;
    }

    public String getNome() {
        return Nome;
    }

    public double getPreco() {
        return Preco;
    }
}
