public class Aula02 {
    public static void main(String[] args) {
        int i;
        int j;
        int[] Idades = {12, 32, 76, 90};

        System.out.println("Idades desordenadas: ");
        for (i = 0; i < 3; i++){
            System.out.println(Idades[i]);
        }

        bubbleSort(Idades, 4);

    }

    public static void bubbleSort(int[] vetor, int tamanhoVetor) {
        boolean troca = true;
        int i;
        int valor1;
        int valor2;
        int aux;
        System.out.println("Entrou");
        while(troca){
            troca = false;
            for(i = 0; i < tamanhoVetor; i++) {
                valor1 = vetor[i];
                valor2 = vetor[i+1];
                System.out.println("entrou no loop");
                if (valor1 > valor2){
                    aux = valor1;
                    valor1 = valor2;
                    valor2 = aux;
                }
                troca = true;
            }
        }
        System.out.println("Saiu");
    }
}