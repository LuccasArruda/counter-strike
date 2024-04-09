import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Carrinho carrinho;
        Produto produto;
        List<Produto> produtos = new ArrayList<>();

        produto = new Produto("Coca-Cola", 8);
        carrinho = new Carrinho(3);
        carrinho.adicionarProduto(produto);
        System.out.println(carrinho.calcularTotal());
        System.out.println(carrinho.getQtdProdutos());
        produtos.add(new Produto("Sorvete Nova", 30));
        produtos.add(new Produto("Pão de Forma", 17));
        carrinho.adicionarProdutos(produtos);
        System.out.println(carrinho.calcularTotal());
        System.out.println(carrinho.getQtdProdutos());
        carrinho.adicionarProduto(new Produto("Pepsi Twist", 6));
        System.out.println(carrinho.getQtdProdutos());
    }
}