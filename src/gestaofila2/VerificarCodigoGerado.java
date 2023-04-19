package gestaofila2;

public class VerificarCodigoGerado {
    
        private String gerarCodigo;

        public VerificarCodigoGerado(){  
        }

        public VerificarCodigoGerado(String GerarCodigo) {
            this.setGerarCodigo(gerarCodigo);
        }
        public String getGerarCodigo() {
            return gerarCodigo;
        }

        public void setGerarCodigo(String GerarCodigo) {
            this.gerarCodigo = GerarCodigo;
        }

        @Override
        public String toString() {
            return "VerificarCodigoGerado{" + "GerarCodigo=" + gerarCodigo + '}';
        }    
   }
