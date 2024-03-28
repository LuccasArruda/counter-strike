public class Painel {
    private Botao[] botoes;

    private int tamanhoPainel;

    public Painel(int quantidadeBotoes, int tamanhoPainel){
        int i;
        Botao[] botoesAux;
        botoesAux = new Botao[quantidadeBotoes];
        for(i = 0; i < quantidadeBotoes; i++){
            botoesAux[i] = new Botao();
        }
        setBotoes(botoesAux);
        setTamanhoPainel(tamanhoPainel);
    }

    public void setTamanhoPainel(int tamanhoPainel) {
        if(tamanhoPainel > 0){
            this.tamanhoPainel = tamanhoPainel;
        } else {
            System.out.println("Informe um tamanho válido!");
        }
    }

    public void setBotoes(Botao[] botoes) {
        this.botoes = botoes;
    }

    public Botao[] getBotoes() {
        return botoes;
    }

    public int getTamanhoPainel() {
        return tamanhoPainel;
    }

    public void exibirBotoesPainel(){
        int i;
        System.out.println("Exibindo botões: ");
        for(i = 0; i < this.botoes.length; i++){
            this.botoes[i].exibirInformacoesBotao();
        }
    }
}
