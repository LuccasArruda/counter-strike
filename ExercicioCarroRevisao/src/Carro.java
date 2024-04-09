import java.util.List;

public class Carro {
    private String Modelo;
    private Motor Motor;
    private List<Pneu> pneus;

    public Carro(String Modelo, int Cavalos, String TipoDeCombustivel, List<Pneu> Pneus){
        setModelo(Modelo);
        this.Motor = new Motor(TipoDeCombustivel, Cavalos);
        setPneus(Pneus);
    }

    public void ligarMotor(){
        this.Motor.EstadoDoMotor = "Ligado";
    }

    public void desligarMotor(){
        this.Motor.EstadoDoMotor = "Ligado";
    }

    public void setPneus(List<Pneu> pneus) {
        if (pneus.size() <= 4){
            this.pneus = pneus;
        } else {
            System.out.println("Número máximo de pneus é 4!");
        }
    }

    public void substituirPneu(int indicePneu, Pneu novoPneu){
        this.pneus.remove(indicePneu);
        this.pneus.add(indicePneu, novoPneu);
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public String getModelo() {
        return Modelo;
    }

    public List<Pneu> getPneus() {
        return pneus;
    }

    public void exibeEstadosPneus(){
        int i;
        for (i = 0; i < getPneus().size(); i++){
            getPneus().get(i).informacoesPneu();
        }
    }

    public Motor getMotor() {
        return Motor;
    }

    public void informacoesCarro(){
        System.out.println("Informações do carro: ");
        System.out.println("Modelo: " + getModelo());
        getMotor().informacoesMotor();
        exibeEstadosPneus();
    }
}
