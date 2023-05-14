package Limitador;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class Principal extends PlainDocument{

    public Principal(Principal principal) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
     public enum TipoEntrada{
         NUMERO,SENHA,EMAIL,NOME,DATA,BI,USUARIO;
     }
    private int qcaracteres;
    private TipoEntrada tpEntrada;

    public Principal(int qcaracteres, TipoEntrada tpEntrada) {
        this.qcaracteres = qcaracteres;
        this.tpEntrada = tpEntrada;
    }

    @Override
    public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
        if(str == null || getLength() == qcaracteres){
            return;
        }
        int totalCarac=getLength() + str.length();
        //filtro de caracteres
        String regex="";
        switch(tpEntrada){
            case NUMERO: regex= "[^0-9 ]";break;
            case SENHA: regex= "[^\\{IsLatin}@\\-0-9]";break;
            case EMAIL: regex="[^\\p{IsLatin}@.\\-[0-9]]";break;
            case DATA: regex="[^0-9/]";break;
            case NOME: regex="[^\\p{IsLatin} `~]";break;
            case BI: regex="[^\\p{IsLatin} [0-9]]";break;
            case USUARIO: regex="[^\\p{IsLatin}@.\\-[0-9]]";break;
        }
        //fazendo a substituicao
        str = str.replaceAll(regex, "");
        if(totalCarac <= qcaracteres){
           super.insertString(offs, str, a); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody 
        }else{
             String nova = str.substring(0, qcaracteres);
             super.insertString(offs, nova, a);
        }
        
    }
    
}
