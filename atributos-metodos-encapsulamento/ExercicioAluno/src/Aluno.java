import org.w3c.dom.Notation;

public class Aluno {
    private String Nome;
    private String RA;
    private Float NotaA1;
    private Float NotaA2;
    private Integer PercentualFrequencia;
    private Float MediaNota = 0F;

    public Aluno(String nome, String ra, Float notaA1, Float notaA2, Integer percentualFrequencia){
        Nome = nome;
        RA = ra;
        NotaA1 = notaA1;
        NotaA2 = notaA2;
        PercentualFrequencia = percentualFrequencia;
        MediaNota = calcularMedia();
    }

    public Float calcularMedia() {
        MediaNota = (NotaA1 + (2*NotaA2)) / 3;
        return MediaNota;
    }

    public void situacaoAluno(){
        System.out.println("Situação de " + Nome + ":");
        if (getPercentualFrequencia() > 75){
            if (MediaNota >= 5) {
                System.out.println("Aprovado!");
            } else if (MediaNota > 3) {
                System.out.println("RE!");
            } else {
                System.out.println("Reprovado!");
            }
        } else {
            System.out.println("Reprovado por Faltas!");
        }
    }

    public Float getNotaA1() {
        return NotaA1;
    }

    public Float getNotaA2() {
        return NotaA2;
    }

    public Integer getPercentualFrequencia() {
        return PercentualFrequencia;
    }

    public String getNome() {
        return Nome;
    }

    public String getRA() {
        return RA;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public void setNotaA1(Float notaA1) {
        NotaA1 = notaA1;
    }

    public void setNotaA2(Float notaA2) {
        NotaA2 = notaA2;
    }

    public void setRA(String RA) {
        this.RA = RA;
    }

    public void setPercentualFrequencia(Integer percentualFrequencia) {
        PercentualFrequencia = percentualFrequencia;
    }
}
