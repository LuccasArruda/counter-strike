import java.util.Date;

public class CarroExercicio {
    public static void main(String[] args) {
        Proprietario proprietario;
        Endereco enderecoProprietario;
        Marca marcaDoCarro;
        Carro carro;

        enderecoProprietario = new Endereco("Josias Machado", "Parque das Laranjeiras", "Araras", "São Paulo", "13609390", "431-B");
        proprietario = new Proprietario("Luccas", "82389402839", "0049283490", new Date("26/01/2000"), enderecoProprietario);
        proprietario.informacoesProprietario();

        marcaDoCarro = new Marca("Lancia", 24, 1906, 23);
        carro = new Carro("037", "Vermelho", 1987, marcaDoCarro, proprietario, "ASD933DA8374H4Q2");
        carro.informacoesCarro();
    }
}
