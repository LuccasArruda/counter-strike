import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Pokemon novoPokemon;
        Pokemon outroPokemon;

        novoPokemon = new Pokemon("Pikachu", "Elétrico", "Choque do Trovão", 31);
        novoPokemon.atacar();

        outroPokemon = new Pokemon("Squirtle", "Aquático", "Surfe", 34);
        outroPokemon.atacar();

        ler.next();
    }
}
