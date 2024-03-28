public class Fogao {
    private Aquecedor aquecedor;
    private Painel painel;
    private Forno forno;
    private Tampa tampa;
    private String marca;

    public Fogao(String marca) {
        setAquecedor(new Aquecedor());
        setPainel(new Painel(7, 40));
        setTampa(new Tampa("Vidro", true, true));
        setForno(new Forno());
        setMarca(marca);
    }

    public void setAquecedor(Aquecedor aquecedor) {
        this.aquecedor = aquecedor;
    }

    public void setForno(Forno forno) {
        this.forno = forno;
    }

    public void setPainel(Painel painel) {
        this.painel = painel;
    }

    public void setTampa(Tampa tampa) {
        this.tampa = tampa;
    }

    public void setMarca(String marca) {
        if(!marca.isEmpty()){
            this.marca = marca;
        } else {
            System.out.println("Informe uma marca válida!");
        }
    }

    public Aquecedor getAquecedor() {
        return aquecedor;
    }

    public Painel getPainel() {
        return painel;
    }

    public String getMarca() {
        return marca;
    }

    public Forno getForno() {
        return forno;
    }

    public Tampa getTampa() {
        return tampa;
    }

    public void exibirDadosFogao(){
        System.out.println("Dados do Fogão: ");
        System.out.println("Marca:  " + getMarca());
        System.out.println("Material Tampa: " + getTampa().getMaterial());
        System.out.println("Temperatura Máxima Aquecedor: " + getAquecedor().getTemperaturaMaxima());
        System.out.println("Tempo de Aquecimento do Forno: " + getForno().getTempoAquecimento() + " Minuto(s)");
    }
}
