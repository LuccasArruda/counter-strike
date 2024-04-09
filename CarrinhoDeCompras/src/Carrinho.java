import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    List<Produto> Produtos = new ArrayList<>();
    int CapacidadeMaxima;
    int qtdProdutos;

    public Carrinho(int capacidadeMaxima){
        setCapacidadeMaxima(capacidadeMaxima);
        setQtdProdutos(0);
    }

    public void adicionarProduto(Produto produto){
        if(getQtdProdutos()+1 > getCapacidadeMaxima()){
            System.out.println("O carrinho já está cheio!");
        } else {
            this.Produtos.add(produto);
            setQtdProdutos(getQtdProdutos()+1);
        }
    }

    public void adicionarProdutos(List<Produto> Produtos){
        int i;
        for (i = 0; i < Produtos.size(); i++){
            adicionarProduto(Produtos.get(i));
        }
    }

    public double calcularTotal(){
        int i;
        double total = 0;
        for (i = 0; i < getQtdProdutos(); i++){
            total += getProdutos().get(i).getPreco();
        }
        return total;
    }

    public void setCapacidadeMaxima(int capacidadeMaxima) {
        this.CapacidadeMaxima = capacidadeMaxima;
    }

    public void setProdutos(List<Produto> produtos) {
        this.Produtos = produtos;
        this.qtdProdutos = produtos.size();
    }

    public void setQtdProdutos(int qtdProdutos) {
        this.qtdProdutos = qtdProdutos;
    }

    public int getCapacidadeMaxima() {
        return this.CapacidadeMaxima;
    }

    public List<Produto> getProdutos() {
        return this.Produtos;
    }

    public int getQtdProdutos() {
        return this.qtdProdutos;
    }
}
