public class Pneu {
    private String Marca;
    private String Estado;

    public Pneu(String Marca){
        setMarca(Marca);
        setEstado("Novo");
    }

    public Pneu(String Estado, String Marca){
        setMarca(Marca);
        setEstado(Estado);
    }

    public void setMarca(String marca) {
        this.Marca = marca;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }

    public String getMarca() {
        return Marca;
    }

    public String getEstado() {
        return Estado;
    }

    public void informacoesPneu(){
        System.out.println("\nInformações do Pneu:");
        System.out.println("Marca: " + getMarca());
        System.out.println("Estado do Pneu: " + getEstado());
    }
}
