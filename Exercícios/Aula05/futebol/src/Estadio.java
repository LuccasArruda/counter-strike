public class Estadio {
    private int capacidadeDePessoas;
    private String nomeEstadio;

    public Estadio(String nomeEstadio, int capacidadeDePessoas){
        setNomeEstadio(nomeEstadio);
        setCapacidadeDePessoas(capacidadeDePessoas);
    }

    public Estadio(){
        setNomeEstadio("Galeão");
        setCapacidadeDePessoas(330000);
    }

    public void setNomeEstadio(String nomeEstadio) {
        if(!nomeEstadio.isEmpty()){
            this.nomeEstadio = nomeEstadio;
        } else {
            System.out.println("Não é possível nomear um estádio com este nome!");
        }
    }

    public void setCapacidadeDePessoas(int capacidadeDePessoas) {
        if(capacidadeDePessoas > 0) {
            this.capacidadeDePessoas = capacidadeDePessoas;
        } else {
            System.out.println("Quantidade de pessoas inválida!");
        }
    }

    public int getCapacidadeDePessoas() {
        return capacidadeDePessoas;
    }

    public String getNomeEstadio() {
        return nomeEstadio;
    }

    public void exibeInformacoesEstadio(){
        System.out.println("\nInformações do Estadio");
        System.out.println("Nome do Estádio: " + getNomeEstadio());
        System.out.println("Capacidade de Pessoas: " + getCapacidadeDePessoas());
    }
}
