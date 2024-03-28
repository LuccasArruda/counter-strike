public class Tampa {
    private String material;
    private Boolean adesivoDeProtecao;
    private Boolean vidroTemperado;

    protected Tampa(String material, Boolean adesivoDeProtecao, Boolean vidroTemperado){
        setMaterial(material);
        setVidroTemperado(vidroTemperado);
        setAdesivoDeProtecao(adesivoDeProtecao);
    }

    protected void setMaterial(String material) {
        if(!material.isEmpty()){
            this.material = material;
        } else {
            System.out.println("Informe um material para a tampa do fogão!");
        }
    }

    protected void setAdesivoDeProtecao(Boolean adesivoDeProtecao) {
        this.adesivoDeProtecao = adesivoDeProtecao;
    }

    protected void setVidroTemperado(Boolean vidroTemperado) {
        this.vidroTemperado = vidroTemperado;
    }

    protected String getMaterial() {
        return material;
    }

    protected Boolean getAdesivoDeProtecao() {
        return adesivoDeProtecao;
    }

    protected Boolean getVidroTemperado() {
        return vidroTemperado;
    }
}
