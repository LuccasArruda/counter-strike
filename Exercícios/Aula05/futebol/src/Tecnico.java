public class Tecnico {
    private String nome;
    private int idade;
    private int salario = 0;
    private int anosDeExperiencia = 0;

    public Tecnico(String nome, int idade, int salario, int anosDeExperiencia){
        setNome(nome);
        setIdade(idade);
        setSalario(salario);
        setAnosDeExperiencia(anosDeExperiencia);
    }

    public Tecnico(){
        setNome("Pelé");
        setAnosDeExperiencia(40);
        setIdade(60);
        setSalario(1000000);
    }

    public void setNome(String nome) {
        if(!nome.trim().isEmpty()){
            this.nome = nome;
        } else {
            System.out.println("O Nome do Técnico não pode ser nulo!");
        }
    }

    public void setIdade(int idade) {
        if(idade > 18 && idade < 120){
            this.idade = idade;
        } else {
            System.out.println("Insira uma idade válida!");
        }
    }

    public void setSalario(int salario) {
        if(salario > 0){
            this.salario = salario;
        } else {
            System.out.println("Informe um valor acima de zero!");
        }
    }

    public void setAnosDeExperiencia(int anosDeExperiencia) {
        if(anosDeExperiencia >= 0) {
            this.anosDeExperiencia = anosDeExperiencia;
        } else {
            System.out.println("Informe uma quantidade de anos válida!");
        }
    }

    public int getAnosDeExperiencia() {
        return anosDeExperiencia;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public int getSalario() {
        return salario;
    }

    public void exibeInformacoesTecnico(){
        System.out.println("\nInformações do Técnico ");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Salário: R$ " + this.salario);
        System.out.println("Anos de Experiência: " + this.anosDeExperiencia);
    }
}
