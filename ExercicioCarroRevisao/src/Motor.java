public class Motor {
    private int Cavalos;
    protected String EstadoDoMotor;
    private String TipoDeCombustivel;

    public Motor(String TipoDeCombustivel, int Cavalos){
        setCavalos(Cavalos);
        setTipoDeCombustivel(TipoDeCombustivel);
    }

    public void setTipoDeCombustivel(String tipoDeCombustivel) {
        this.TipoDeCombustivel = tipoDeCombustivel;
    }

    public void setCavalos(int cavalos) {
        this.Cavalos = cavalos;
    }

    public String getTipoDeCombustivel() {
        return this.TipoDeCombustivel;
    }

    public int getCavalos() {
        return this.Cavalos;
    }

    public String getEstadoDoMotor() {
        return EstadoDoMotor;
    }

    public void informacoesMotor(){
        System.out.println("\nInformações motor: ");
        System.out.println("Cavalos: " + getCavalos());
        System.out.println("Tipo de Combustível: " + getTipoDeCombustivel());
    }
}
