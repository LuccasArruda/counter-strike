public class Jogador {
    private String nome;
    private int idade;
    private int salario;
    private int numeroCamiseta;

    public Jogador(String nome, int idade, int salario, int numeroCamiseta){
        setNome(nome);
        setIdade(idade);
        setSalario(salario);
        setNumeroCamiseta(numeroCamiseta);
    }

    public Jogador(){
        setNome("Jefersson");
        setIdade(20);
        setSalario(400000);
        setNumeroCamiseta(10);
    }

    public void setNome(String nome) {
        if(!nome.isEmpty()){
            this.nome = nome;
        } else {
            System.out.println("Informe um nome válido!");
        }
    }

    public void setSalario(int salario) {
        if(salario > 0){
            this.salario = salario;
        } else {
            System.out.println("Informe um salário maior que zero!");
        }
    }

    public void setIdade(int idade) {
        if (idade > 5 && idade < 45) {
            this.idade = idade;
        } else {
            System.out.println("Idade inválida!");
        }
    }

    public void setNumeroCamiseta(int numeroCamiseta) {
        if (numeroCamiseta > 0){
            this.numeroCamiseta = numeroCamiseta;
        } else {
            System.out.println("Informe um número válido!");
        }
    }

    public String getNome() {
        return nome;
    }

    public int getSalario() {
        return salario;
    }

    public int getIdade() {
        return idade;
    }

    public int getNumeroCamiseta() {
        return numeroCamiseta;
    }

    public void exibeInformacoesJogador(){
        System.out.println("\nNome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Salário: R$" + this.salario);
        System.out.println("Número Camiseta: " + this.numeroCamiseta);
    }
}
