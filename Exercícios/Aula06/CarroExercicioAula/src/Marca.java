import org.jetbrains.annotations.NotNull;

public class Marca {
    private String nome;
    private int quantidadeDeModelos;
    private int anoDeLancamento;
    private int codigoIdentificador;

    public Marca(String nome, int quantidadeDeModelos, int anoDeLancamento, int codigoIdentificador){
        setNome(nome);
        setQuantidadeDeModelos(quantidadeDeModelos);
        setAnoDeLancamento(anoDeLancamento);
        setCodigoIdentificador(codigoIdentificador);
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidadeDeModelos() {
        return quantidadeDeModelos;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public int getCodigoIdentificador() {
        return codigoIdentificador;
    }

    public void setNome(@NotNull String nome) {
        if (!nome.isEmpty()){
            this.nome = nome;
        } else {
            System.out.println("Informe um nome válido!");
        }
    }

    public void setQuantidadeDeModelos(int quantidadeDeModelos) {
        if (quantidadeDeModelos >= 0){
            this.quantidadeDeModelos = quantidadeDeModelos;
        } else {
            System.out.println("Informe uma quantidade de modelos válida!");
        }
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        if (anoDeLancamento >= 1886){
            this.anoDeLancamento = anoDeLancamento;
        } else {
            System.out.println("informe um ano de lançamento válido!");
        }
    }

    public void setCodigoIdentificador(int codigoIdentificador) {
        if (codigoIdentificador >= 0){
            this.codigoIdentificador = codigoIdentificador;
        } else {
            System.out.println("Informe um código de marca válido!");
        }
    }

    public void informacoesMarca(){
        System.out.println("\nInformações da Marca: ");
        System.out.println("Nome: " + getNome());
        System.out.println("Quantidade de Modelos: " + getQuantidadeDeModelos());
        System.out.println("Ano de Lançamento: " +  getAnoDeLancamento());
        System.out.println("Código Identificador: " + getCodigoIdentificador());
    }
}
