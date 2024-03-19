import java.time.LocalDateTime;

public class Datas
{
    private int Dia;
    private int Mes;
    private int Ano;

    public int getAno() {
        return Ano;
    }

    public int getDia() {
        return Dia;
    }

    public int getMes() {
        return Mes;
    }

    public void setAno(int ano) {
        this.Ano = ano;
    }

    public void setDia(int dia) {
        if (dia < 1 || dia > 30){
            this.Dia = 24;
            System.out.println("Dia inexistente!");
            System.out.println("Atribuindo dia 24 (padrão)");
        } else {
            this.Dia = dia;
        }
    }

    public void setMes(int mes) {
        if (mes < 1 || mes > 12){
            this.Mes = 6;
            System.out.println("Mês inexistente!");
            System.out.println("Atribuindo mês 6 (padrão)");
        } else {
            this.Mes = mes;
        }
    }

    public Datas(){
        this.Dia = LocalDateTime.now().getDayOfMonth();
        this.Mes = LocalDateTime.now().getMonthValue();
        this.Ano = LocalDateTime.now().getYear();
    }

    public Datas(int dia, int mes, int ano){
        setDia(dia);
        setMes(mes);
        setAno(ano);
    }

    public String retornaDataAtual(){
        return this.Dia + "/" + this.Mes + "/" + this.Ano;
    }

    private String retornaEstacaoAtual(){
        if(this.Mes >= 3 && this.Mes <= 5) {
            return "Outono";
        } else if (this.Mes >= 7) {
            return "Inverno";
        } else if (this.Mes >= 11) {
            return "Primavera";
        } else {
            return "Verão";
        }
    }

    public String retornaDataAtual(Boolean retornaEstacaoAno){
        if(retornaEstacaoAno) {
            return retornaDataAtual() + " - Estação: " + retornaEstacaoAtual();
        }
        return retornaDataAtual();
    }

    public void avancaUmDia(){
        if ((this.Dia + 1) > 30){
            setDia(1);
            avancaUmMes();
        } else {
            setDia(this.Dia += 1);
        }
    }

    public void avancaUmMes(){
        if((this.Mes + 1) > 12){
            setMes(1);
            avancaUmAno();
        } else {
            this.Mes += 1;
        }
    }

    public void avancaUmAno(){
        this.Ano += 1;
    }

    public void avancaDia(Integer qtdDias){
        Integer diasRestantes, diaReal;
        if((this.Dia + qtdDias) > 30){
            diasRestantes = 30 - this.Dia;
            diaReal = qtdDias - diasRestantes;
            setDia(diaReal);
            avancaUmMes();
        } else {
            this.Dia += qtdDias;
        }
    }

    public void avancaMes(Integer qtdMeses){
        Integer mesesRestantes, mesReal;
        if((this.Mes + qtdMeses) > 12){
            mesesRestantes = 12 - this.Mes;
            mesReal = qtdMeses - mesesRestantes;
            setMes(mesReal);
            avancaUmAno();
        } else {
            this.Mes += qtdMeses;
        }
    }

    public void avancaAno(Integer qtdAnos){
        this.Ano += qtdAnos;
    }
}
