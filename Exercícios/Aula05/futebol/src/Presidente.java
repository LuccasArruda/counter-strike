public class Presidente {
    private String nome;
    private int idade;
    private int capital;

    public Presidente(String nome, int idade, int capital){
        setNome(nome);
        setIdade(idade);
        setCapital(capital);
    }

    public Presidente(){
        setNome("Craque Neto");
        setIdade(54);
        setCapital(5400000);
    }

    public void setNome(String nome) {
        if (!nome.isEmpty()){
            this.nome = nome;
        } else {
            System.out.println("Informe um nome válido!");
        }
    }

    public void setIdade(int idade) {
        if(idade > 18){
            this.idade = idade;
        } else {
            System.out.println("Informe uma idade válida!");
        }
    }

    public void setCapital(int capital) {
        if (capital > 100000){
            this.capital = capital;
        } else {
            System.out.println("Capital muito baixo!");
        }
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public float getCapital() {
        return capital;
    }

    public void exibirInformacoesPresidente(){
        System.out.println("\nInformações do presidente do clube: ");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Capital Monetário: " + this.capital);
    }
}
