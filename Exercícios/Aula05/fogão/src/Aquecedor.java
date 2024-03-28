public class Aquecedor {
    private int temperaturaMaxima;
    private int tamanhoAquecedor;

    public Aquecedor(int temperaturaMaxima, int tamanhoAquecedor){
        setTamanhoAquecedor(tamanhoAquecedor);
        setTemperaturaMaxima(temperaturaMaxima);
    }

    public Aquecedor(){
        setTemperaturaMaxima(400);
        setTamanhoAquecedor(40);
    }

    public void setTamanhoAquecedor(int tamanhoAquecedor) {
        if(tamanhoAquecedor > 0){
            this.tamanhoAquecedor = tamanhoAquecedor;
        } else {
            System.out.println("O Tamanho do aquecedor deve ser maior que 0!");
        }
    }

    public void setTemperaturaMaxima(int temperaturaMaxima) {
        if(temperaturaMaxima > 0){
            this.temperaturaMaxima = temperaturaMaxima;
        } else {
            System.out.println("A temperatura máxima deve ser maior que 0!");
        }
    }

    public int getTamanhoAquecedor() {
        return tamanhoAquecedor;
    }

    public int getTemperaturaMaxima() {
        return temperaturaMaxima;
    }
}
