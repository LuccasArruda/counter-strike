public class Carro {
    private String modelo;
    private String cor;
    private int ano;
    private Marca marca;
    private String chassi;
    private Proprietario proprietario;
    private int velocidadeMaxima = 200;
    private int velocidadeAtual = 0;
    private int quantidadeDePortas = 4;
    private Boolean tetoSolar = false;
    private int quantidadeDeMarchas = 5;
    private Boolean cambioAutomatico = false;
    private int quantidadeDeCombustivel = 50;
    private int marchaAtual = 0;

    public Carro(String modelo, String cor, int ano, Marca marca, Proprietario proprietario, String chassi){
        setModelo(modelo);
        setAno(ano);
        setCor(cor);
        setMarca(marca);
        setProprietario(proprietario);
        setChassi(chassi);
    }

    public void informacoesCarro(){
        System.out.println("\nInformações do Carro: ");
        System.out.println("Modelo: " + getModelo());
        System.out.println("Cor: " + getCor());
        System.out.println("Ano: " + getAno());
        System.out.println("Valocidade Atual: " + getVelocidadeAtual() + " Km/h");
        System.out.println("Chassi: " + getChassi());
        this.proprietario.informacoesProprietario();
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public int getAno() {
        return ano;
    }

    public Marca getMarca() {
        return marca;
    }

    public String getChassi() {
        return chassi;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public int getQuantidadeDePortas() {
        return quantidadeDePortas;
    }

    public Boolean getTetoSolar() {
        return tetoSolar;
    }

    public int getQuantidadeDeMarchas() {
        return quantidadeDeMarchas;
    }

    public Boolean getCambioAutomatico() {
        return cambioAutomatico;
    }

    public int getQuantidadeDeCombustivel() {
        return quantidadeDeCombustivel;
    }

    public int getMarchaAtual() {
        return marchaAtual;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setCambioAutomatico(Boolean cambioAutomatico) {
        this.cambioAutomatico = cambioAutomatico;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }

    public void setQuantidadeDeCombustivel(int quantidadeDeCombustivel) {
        this.quantidadeDeCombustivel = quantidadeDeCombustivel;
    }

    public void setQuantidadeDeMarchas(int quantidadeDeMarchas) {
        this.quantidadeDeMarchas = quantidadeDeMarchas;
    }

    public void setQuantidadeDePortas(int quantidadeDePortas) {
        this.quantidadeDePortas = quantidadeDePortas;
    }

    public void setTetoSolar(Boolean tetoSolar) {
        this.tetoSolar = tetoSolar;
    }

    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void setMarchaAtual(int marchaAtual) {
        this.marchaAtual = marchaAtual;
    }

    public void acelera(){
        this.velocidadeAtual++;
    }

    public void freia(){
        this.velocidadeAtual = 0;
    }

    public void trocaMarcha(int marchaSelecionada){
        this.marchaAtual = marchaSelecionada;
    }

    public void reduzMarcha(){
        if (this.marchaAtual > 0){
            setMarchaAtual(this.marchaAtual--);
        } else {
            System.out.println("O Carro já está no ponto neutro!");
        }
    }
}
