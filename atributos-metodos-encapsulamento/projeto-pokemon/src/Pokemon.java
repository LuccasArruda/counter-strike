public class Pokemon {
    private String Nome;
    private String Tipo;
    private String Habilidade;
    private Integer Nivel;

    public Pokemon(String nome, String tipo, String habilidade, Integer nivel){
        Nome = nome;
        Tipo = tipo;
        Habilidade = habilidade;
        Nivel = nivel;
    }

    public void SetNome(String nome){
        Nome = nome;
    }

    public void SetTipo(String tipo){
        Tipo = tipo;
    }

    public void SetHabilidade(String habilidade){
        Habilidade = habilidade;
    }

    public void setNivel(Integer nivel){
        Nivel = nivel;
    }

    public String getNome() {
        return Nome;
    }

    public String getTipo() {
        return Tipo;
    }

    public String getHabilidade() {
        return Habilidade;
    }

    public Integer getNivel() {
        return Nivel;
    }

    public void atacar(){
        System.out.println(Nome + " está atacando!");
    }
}
