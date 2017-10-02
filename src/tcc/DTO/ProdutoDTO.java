package tcc.DTO;

public class ProdutoDTO {

    private String nomeProd, tamProd;
    private float precoProd;
    private int qntProd, codProd;

    public int getCodProd() {
        return codProd;
    }

    public void setCodProd(int codProd) {
        this.codProd = codProd;
    }

    public String getNomeProd() {
        return nomeProd;
    }

    public String getTamProd() {
        return tamProd;
    }

    public void setNomeProd(String nomeProd) {
        this.nomeProd = nomeProd;
    }

    public float getPrecoProd() {
        return precoProd;
    }

    public void setPrecoProd(float precoProd) {
        this.precoProd = precoProd;
    }

    public int getQntProd() {
        return qntProd;
    }

    public void setQntProd(int qntProd) {
        this.qntProd = qntProd;
    }

    public void setTamProd(String tamProd) {
        this.tamProd = tamProd;
    }

}
