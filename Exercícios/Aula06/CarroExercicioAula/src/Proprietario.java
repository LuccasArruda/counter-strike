import java.util.Date;
import java.util.Objects;

public class Proprietario {
    private String nome;
    private String cpf;
    private String rg;
    private Date dataNascimento;
    private Endereco endereco;

    public Proprietario(String nome, String cpf, String rg, Date dataNascimento, Endereco endereco){
        setNome(nome);
        setCpf(cpf);
        setRg(rg);
        setDataNascimento(dataNascimento);
        setEndereco(endereco);
    }

    public Proprietario(String nome, String cpf, String rg, Endereco endereco){
        setNome(nome);
        setCpf(cpf);
        setRg(rg);
        setEndereco(endereco);
    }

    public String getNome() {
        return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public String getRg() {
        return this.rg;
    }

    public String getDataNascimento() {
        if (this.dataNascimento != null){
            return this.dataNascimento.toString();
        } else {
            return "Sem data de nascimento!";
        }
    }

    public Endereco getEndereco() {
        return this.endereco;
    }

    public void setNome(String nome) {
        if (!nome.isEmpty()){
            this.nome = nome;
        } else {
            System.out.println("Informe um nome!");
        }
    }

    public void setCpf(String cpf) {
        if (!cpf.isEmpty()){
            this.cpf = cpf;
        } else {
            System.out.println("Informe um CPF válido!");
        }
    }

    public void setRg(String rg) {
        if (!rg.isEmpty()) {
            this.rg = rg;
        } else {
            System.out.println("Informe um RG válido!");
        }
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void informacoesProprietario(){
        System.out.println("Informações do Proprietário: ");
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("RG: " + getRg());
        System.out.println("Data de Nascimento: " + getDataNascimento());
        getEndereco().informacoesEndereco();
    }
}
