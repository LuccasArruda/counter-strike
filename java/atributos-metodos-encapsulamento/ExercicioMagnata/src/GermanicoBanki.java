public class GermanicoBanki {
    public static void main(String[] args) {
        Conta ContaDoAntonello;
        ContaDoAntonello = new Conta("Sérgio Antonello", 213124);
        ContaDoAntonello.depositar(1239183901234192F);
        ContaDoAntonello.sacar(192928472F);
        ContaDoAntonello.imprimirSaldo();
        ContaDoAntonello.imprimirDadosConta();
    }
}
