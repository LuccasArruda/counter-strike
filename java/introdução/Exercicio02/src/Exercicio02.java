import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float A1, A2, Media, PercentualPresenca;

        A1 = ler.nextFloat();
        A2 = ler.nextFloat();
        PercentualPresenca = ler.nextFloat();
        Media = (A1 + (2*A2)) / 3;

        if (PercentualPresenca > 75){
            if (Media >= 5) {
                System.out.println("APROVADO!");
            } else if (Media >= 3) {
                System.out.println("RE!");
            } else {
                System.out.println("REPROVADO!");
            }
        } else {
            System.out.println("REPROVADO!");
        }
        System.out.println("Média: " + Media);

        ler.close();
    }
}