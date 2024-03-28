public class Carro {
    private String Modelo;
    private String Cor;
    private Integer QuantidadeDePortas;
    private Boolean Tracao4x4;
    private Boolean BancoDeCouro;
    private Boolean ArCondicionado;

    public Carro(String cor, String modelo, Integer quantidadeDePortas){
        this.Modelo = modelo;
        this.Cor = cor;
        this.QuantidadeDePortas = quantidadeDePortas;
    }

    public Carro(String cor, String modelo, Integer quantidadeDePortas, Boolean tracao4x4){
        this.Modelo = modelo;
        this.Cor = cor;
        this.QuantidadeDePortas = quantidadeDePortas;
        this.Tracao4x4 = tracao4x4;
    }

    public Carro(String cor, String modelo, Integer quantidadeDePortas, Boolean tracao4x4, Boolean bancoDeCouro, Boolean arCondicionado){
        this.Modelo = modelo;
        this.Cor = cor;
        this.QuantidadeDePortas = quantidadeDePortas;
        this.Tracao4x4 = tracao4x4;
        this.BancoDeCouro = bancoDeCouro;
        this.ArCondicionado = arCondicionado;
    }

    public Boolean getArCondicionado() {
        return ArCondicionado;
    }

    public Boolean getTracao4x4() {
        return Tracao4x4;
    }

    public Integer getQuantidadeDePortas() {
        return QuantidadeDePortas;
    }

    public String getCor() {
        return Cor;
    }

    public String getModelo() {
        return Modelo;
    }

    public Boolean getBancoDeCouro() {
        return BancoDeCouro;
    }

    public void exibeInformacoesCarro(){
        System.out.println("========================================");
        System.out.println("Modelo: " + this.Modelo);
        System.out.println("Cor: " + this.Cor);
        System.out.println("Quantidade de Portas: " + this.QuantidadeDePortas);
        System.out.println("Tração 4x4: " + this.Tracao4x4);
        System.out.println("Ar Condicionado: " + this.ArCondicionado);
        System.out.println("Banco de Couro: " + this.BancoDeCouro);
        System.out.println("========================================");
    }
}
