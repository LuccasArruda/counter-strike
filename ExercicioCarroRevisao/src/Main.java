import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Carro carro;
        List<Pneu> pneus = new ArrayList<>();
        Pneu PneuNovo;

        pneus.add(new Pneu("BfGoodrich"));
        pneus.add(new Pneu("Pirelli"));
        pneus.add(new Pneu("Goodyear"));
        pneus.add(new Pneu("Goodyear"));

        carro = new Carro("Prisma", 289, "Flex", pneus);
        System.out.println(carro.getPneus().get(2).getMarca());
        PneuNovo = new Pneu("Continental");
        carro.substituirPneu(2, PneuNovo);
        System.out.println(carro.getPneus().get(2).getMarca());
        carro.informacoesCarro();
    }
}
