import java.util.Scanner;

public class ExercicioFutebol {
    public static void main(String[] args) {
        Time time;
        Scanner ler;
        Jogador jogadores[];
        int i, quantidadeJogadores;

        ler = new Scanner(System.in);
        System.out.println("Quantos jogadores possui o time?");
        quantidadeJogadores = ler.nextInt();

        jogadores = new Jogador[quantidadeJogadores];
        for(i = 0; i < jogadores.length; i++){
            jogadores[i] = new Jogador();
        }

        time = new Time();
        if(time.setJogadores(jogadores) == 0){
            System.out.println("Informe um nome para o time: ");
            time.setNome(ler.next());
            time.setPresidente(new Presidente());
            time.setTecnico(new Tecnico());
            time.setEstadio(new Estadio());

            time.listaJogadores();
            time.getTecnico().exibeInformacoesTecnico();
            time.getPresidente().exibirInformacoesPresidente();
            time.getEstadio().exibeInformacoesEstadio();
        }
    }
}
