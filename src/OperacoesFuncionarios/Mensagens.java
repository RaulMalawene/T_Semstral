
package OperacoesFuncionarios;

public class Mensagens {
    private String emissor;
    private String mensagem;
    
    public Mensagens(){
    }
    
    public Mensagens(String mensagem){
        this.emissor = emissor;
        this.mensagem = mensagem;
    }

    public String getEmissor() {
        return emissor;
    }

    public void setEmissor(String emissor) {
        this.emissor = emissor;
    }
    
    public String getMensagem(){
        return mensagem;
    }
    
    public void setMensagem(String mensagem){
        this.mensagem = mensagem;
    }
    
    public String toString(){
      return emissor + mensagem;
    }
}
