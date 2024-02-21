import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float A1, A2, Media;

        A1 = ler.nextFloat();
        A2 = ler.nextFloat();
        Media = (A1 + (2*A2)) / 3;

        if (Media >= 5) {
            System.out.println("APROVADO!");
        }
        else if (Media >= 3){
            System.out.println("RE");
        }
        else {
            System.out.println("REPROVADO");
        }
        System.out.println("Média: " + Media);

        ler.close();
    }
}