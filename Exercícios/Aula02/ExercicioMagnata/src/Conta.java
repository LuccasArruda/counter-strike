public class Conta {
    private Integer Numero;
    private Float Saldo;
    private String NomeTitular;

    public Conta(String nomeTitular, Integer numero){
        NomeTitular = nomeTitular;
        Numero = numero;
        Saldo = 0F;
    }

    public Integer getNumero() {
        return Numero;
    }

    public String getNomeTitular() {
        return NomeTitular;
    }

    public Integer depositar(Float valor){
        if(valor >0){
            Saldo += valor;
            return 0;
        }
        return 1;
    }

    public Integer sacar(Float valor){
        if (valor > 0 && valor <= Saldo){
            Saldo -= valor;
            return 0;
        }
        return 1;
    }

    public void imprimirSaldo(){
        System.out.println("Saldo de " + NomeTitular + ": R$" + Saldo);
    }

    public void imprimirDadosConta(){
        System.out.println("Dados da Conta: ");
        System.out.println("Numero da Conta: " + Numero);
        System.out.println("Nome do Titular: " + NomeTitular);
        System.out.println("Saldo: " + Saldo);
    }
}
