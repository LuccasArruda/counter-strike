import org.jetbrains.annotations.NotNull;

public class Endereco {
    private String rua;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;
    private String complemento;

    public Endereco(String rua, String bairro, String cidade, String estado, String cep, String complemento){
        setRua(rua);
        setBairro(bairro);
        setCidade(cidade);
        setEstado(estado);
        setCep(cep);
        setComplemento(complemento);
    }

    public String getRua() {
        return rua;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public String getCep() {
        return cep;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setRua(@NotNull String rua) {
        if (!rua.isEmpty()){
            this.rua = rua;
        } else {
            System.out.println("Informe uma rua válida!");
        }
    }

    public void setBairro(@NotNull String bairro) {
        if (!bairro.isEmpty()){
            this.bairro = bairro;
        } else {
            System.out.println("Informe um bairro válido!");
        }
    }

    public void setCidade(@NotNull String cidade) {
        if (!cidade.isEmpty()){
            this.cidade = cidade;
        } else {
            System.out.println("Informe uma cidade válida!");
        }
    }

    public void setEstado(@NotNull String estado) {
        if (!estado.isEmpty()){
            this.estado = estado;
        } else {
            System.out.println("Informe um estadi válido!");
        }
    }

    public void setCep(@NotNull String cep) {
        if (!cep.isEmpty()){
            this.cep = cep;
        } else {
            System.out.println("Informe um cep válido!");
        }
    }

    public void setComplemento(@NotNull String complemento) {
        if (!complemento.isEmpty()){
            this.complemento = complemento;
        } else {
            System.out.println("Informe um complemento válido!");
        }
    }

    public void informacoesEndereco(){
        System.out.println("\nInformações de endereço: ");
        System.out.println("Rua: " + getRua());
        System.out.println("Bairro: " + getBairro());
        System.out.println("Cidade: " + getCidade());
        System.out.println("Estado: " + getEstado());
        System.out.println("CEP: " + getCep());
        System.out.println("Complemento: " + getComplemento());
    }
}
