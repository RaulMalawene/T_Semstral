package gestaofila2;

public class PuxarLinha {
      private String textNom;
       
       public PuxarLinha(){     
       }

        public PuxarLinha(String textNom) {
            this.textNom = textNom;
        }

        public String getTextNom() {
            return textNom;
        }

        public void setTextNom(String textNom) {
            this.textNom = textNom;
        }

        @Override
        public String toString() {
            return "PuxarLinha{" + "textNom=" + textNom + '}';
        } 
    
}
