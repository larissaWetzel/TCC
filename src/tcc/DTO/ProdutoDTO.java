package tcc.DTO;

public class ProdutoDTO {

    public class produtoDTO {

        private String nomeProd, precoProd, qntProd, tamProd;

        public String getNomeProd() {
            return nomeProd;
        }

        public String getTamProd() {
            return tamProd;
        }

        public void setNomeProd(String nomeProd) {
            this.nomeProd = nomeProd;
        }

        public String getPrecoProd() {
            return precoProd;
        }

        public void setPrecoProd(String precoProd) {
            this.precoProd = precoProd;
        }

        public String getQntProd() {
            return qntProd;
        }

        public void setQntProd(String qntProd) {
            this.qntProd = qntProd;
        }

        public void setTamProd(String tamProd) {
            this.tamProd = tamProd;
        }

    }
}
