public class Botao {
    private String funcaoBotao;
    private String tipoBotao;

    private int posicaoBotao;

    public Botao(){
        int i;
        setTipoBotao("Switch");
        setFuncaoBotao("Controlar Temperatura");
        this.posicaoBotao++;
    }

    public void setFuncaoBotao(String funcaoBotao) {
        if(!funcaoBotao.isEmpty()){
            this.funcaoBotao = funcaoBotao;
        } else {
            System.out.println("Informe uma função ao botão!");
        }
    }

    public void setTipoBotao(String tipoBotao) {
        if(!tipoBotao.isEmpty()){
            this.tipoBotao = tipoBotao;
        } else {
            System.out.println("Informe um tipo de botão!");
        }

    }

    public void setPosicaoBotao(int posicaoBotao) {
        this.posicaoBotao = posicaoBotao;
    }

    public String getFuncaoBotao() {
        return funcaoBotao;
    }

    public String getTipoBotao() {
        return tipoBotao;
    }

    public int getPosicaoBotao() {
        return posicaoBotao;
    }

    public void exibirInformacoesBotao(){
        System.out.println("Função: " + getFuncaoBotao());
        System.out.println("Tipo: " + getTipoBotao());
        System.out.println("Posição: " + getPosicaoBotao());
    }
}
