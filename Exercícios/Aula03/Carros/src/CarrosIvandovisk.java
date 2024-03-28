public class CarrosIvandovisk {
    public static void main(String[] args) {
        Carro carroPadrao, carroSport, carroLuxo;

        carroPadrao = new Carro("Preto", "Vectra", 4);
        carroSport = new Carro("Cinza", "RS6", 4, true);
        carroLuxo = new Carro("Azul Meia Noite", "Phantom Series II", 4, true, true, true);

        carroPadrao.exibeInformacoesCarro();
        carroSport.exibeInformacoesCarro();
        carroLuxo.exibeInformacoesCarro();
    }
}
