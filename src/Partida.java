public class Partida {
    private int RodadaAtual;
    private Time ContraTerroristas;
    private Time Terroristas;
    private int RodadasGanhasContraTerroristas;
    private int RodadasGanhasTerroristas;
    private Time Ganhador;
    private String StatusPartida;

    public Partida(Time terroristas, Time contraTerroristas){
        setTerroristas(terroristas);
        setContraTerroristas(contraTerroristas);
        setRodadasGanhasTerroristas(0);
        setRodadasGanhasContraTerroristas(0);
        setRodadaAtual(0);

    }

    public void setStatusPartida(String statusPartida) {
        this.StatusPartida = statusPartida;
    }

    public void setRodadaAtual(int rodadaAtual) {
        if (rodadaAtual <= 30){
            this.RodadaAtual = rodadaAtual;
            if (rodadaAtual == 30){
                System.out.println("\nPartida Encerrada!");
                defineGanhador();
                informacoesPartida();
            }
        } else {
            System.out.println("Número informado excede ao número de rodadas de uma partida!");
        }
    }

    private void defineGanhador(){
        if (this.RodadasGanhasTerroristas > this.RodadasGanhasContraTerroristas){
            setGanhador(this.Terroristas);
        } else {
            setGanhador(this.ContraTerroristas);
        }
    }

    public void setContraTerroristas(Time contraTerroristas) {
        this.ContraTerroristas = contraTerroristas;
    }

    public void setGanhador(Time ganhador) {
        this.Ganhador = ganhador;
    }

    public void setRodadasGanhasContraTerroristas(int rodadasGanhasContraTerroristas) {
        this.RodadasGanhasContraTerroristas = rodadasGanhasContraTerroristas;
        setRodadaAtual(this.RodadaAtual += rodadasGanhasContraTerroristas);
    }

    public void setRodadasGanhasTerroristas(int rodadasGanhasTerroristas) {
        this.RodadasGanhasTerroristas = rodadasGanhasTerroristas;
        setRodadaAtual(this.RodadaAtual += rodadasGanhasTerroristas);
    }

    public void setTerroristas(Time terroristas) {
        this.Terroristas = terroristas;
    }

    public int getRodadasGanhasContraTerroristas() {
        return this.RodadasGanhasContraTerroristas;
    }

    public int getRodadasGanhasTerroristas() {
        return this.RodadasGanhasTerroristas;
    }

    public Time getContraTerroristas() {
        return this.ContraTerroristas;
    }

    public Time getGanhador() {
        return this.Ganhador;
    }

    public Time getTerroristas() {
        return this.Terroristas;
    }

    public int getRodadaAtual() {
        return this.RodadaAtual;
    }

    public String getStatusPartida() {
        return this.StatusPartida;
    }

    public void vitoriaContraTerrorista(){
        setRodadasGanhasContraTerroristas(this.RodadasGanhasContraTerroristas += 1);
    }

    public void vitoriaTerrorista(){
        setRodadasGanhasTerroristas(this.RodadasGanhasTerroristas += 1);
    }

    public void informacoesPartida(){
        System.out.println("Informações da Partida:");
        System.out.println("Contra-Terroristas: " + getRodadasGanhasContraTerroristas());
        System.out.println("Terroristas: " + getRodadasGanhasTerroristas());
        System.out.println("Rodada: " + getRodadaAtual());
        if (this.Ganhador != null){
            System.out.println("Ganhador: " + getGanhador().getNome());
        }
    }
}