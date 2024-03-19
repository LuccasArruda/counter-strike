import java.util.Scanner;

public class exibindoDatas {
    public static void main(String[] args) {
        Datas Data, Data2;

        System.out.println("====================================");
        System.out.println("              DataValdo             ");
        System.out.println("====================================");
        System.out.println("Coletando data atual do sistema");

        Data = new Datas();

        System.out.println("Exibindo data atual: ");
        System.out.println(Data.retornaDataAtual());

        System.out.println("Exibindo data atual e estação do ano: ");
        System.out.println(Data.retornaDataAtual(true));

        System.out.println("Atribuindo um dia em específico: ");
        Data.setDia(4);
        System.out.println(Data.getDia());

        System.out.println("Atribuindo dia inexistente: ");
        Data.setDia(34);

        System.out.println("Atribuindo mês específico: ");
        Data.setMes(3);
        System.out.println(Data.getMes());

        System.out.println("Atribuindo mês inexistente: ");
        Data.setMes(23);

        System.out.println("Atribuindo ano específico: ");
        Data.setAno(2000);
        System.out.println(Data.getAno());

        System.out.println("Instanciando novo objeto com data definida: ");
        Data2 = new Datas(26, 11, 2004);
        System.out.println(Data2.retornaDataAtual(true));

        System.out.println("Avançando um dia da nova data definida: ");
        Data2.avancaUmDia();
        System.out.println(Data2.retornaDataAtual());

        System.out.println("Avançando um mês da nova data definida: ");
        Data2.avancaUmMes();
        System.out.println(Data.retornaDataAtual());

        System.out.println("Avançando um ano da nova data definida: ");
        Data2.avancaUmAno();
        System.out.println(Data2.retornaDataAtual());

        System.out.println("Avança uma quantidade de dias definida (nova data): ");
        Data2.avancaDia(4);
        System.out.println(Data2.retornaDataAtual());

        System.out.println("Avança uma quantidade de meses definida (nova data): ");
        Data2.avancaMes(1);
        System.out.println(Data2.retornaDataAtual());

        System.out.println("Avança uma quantidade de anos definidos (nova data): ");
        Data2.avancaAno(324);
        System.out.println(Data2.retornaDataAtual());

    }
}
