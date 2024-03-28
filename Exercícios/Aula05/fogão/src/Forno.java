public class Forno {
    private int tamanhoForno;
    private int quantidadeGrades;
    private int tempoAquecimento;

    public Forno(int tamanhoForno, int quantidadeGrades, int tempoAquecimento){
        setTamanhoForno(tamanhoForno);
        setQuantidadeGrades(quantidadeGrades);
        setTempoAquecimento(tempoAquecimento);
    }

    protected Forno(){
        setTempoAquecimento(30);
        setQuantidadeGrades(3);
        setTamanhoForno(40);
    }

    public void setQuantidadeGrades(int quantidadeGrades) {
        this.quantidadeGrades = quantidadeGrades;
    }

    public void setTamanhoForno(int tamanhoForno) {
        if(tamanhoForno > 0){
            this.tamanhoForno = tamanhoForno;
        } else {
            System.out.println("Informe um tamanho válido para o forno!");
        }
    }

    public void setTempoAquecimento(int tempoAquecimento) {
        if(tempoAquecimento > 0){
            this.tempoAquecimento = tempoAquecimento;
        } else {
            System.out.println("Informe o tempo de aquecimento do forno!");
        }
    }

    public int getQuantidadeGrades() {
        return quantidadeGrades;
    }

    public int getTamanhoForno() {
        return tamanhoForno;
    }

    public int getTempoAquecimento() {
        return tempoAquecimento;
    }
}
