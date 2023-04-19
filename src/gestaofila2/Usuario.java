
package gestaofila2;

public  class Usuario extends Pessoa{
    
    private String dataDesconhecid,bi,usuario,senha,senhaConf;
    
    public Usuario(){    
    }

    public Usuario(String dataDesconhecid, String bi, String usuario, String senha, String senhaConf) {
        this.dataDesconhecid = dataDesconhecid;
        this.bi = bi;
        this.usuario = usuario;
        this.senha = senha;
        this.senhaConf = senhaConf;
    }

    public Usuario(String nome, String apelido, String dataNascimento, String dataDesconhecid, 
            String bi, String sexos, String celular, String usuario, String senha, String senhaConf) {
        super(nome, apelido, dataNascimento, celular, sexos);
        this.dataDesconhecid = dataDesconhecid;
        this.bi = bi;
        this.usuario = usuario;
        this.senha = senha;
        this.senhaConf = senhaConf;
    }   

    public String getDataDesconhecid() {
        return dataDesconhecid;
    }

    public void setDataDesconhecid(String dataDesconhecid) {
        this.dataDesconhecid = dataDesconhecid;
    }

    public String getBi() {
        return bi;
    }

    public void setBi(String bi) {
        this.bi = bi;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSenhaConf() {
        return senhaConf;
    }

    public void setSenhaConf(String senhaConf) {
        this.senhaConf = senhaConf;
    }

    @Override
    public String toString() {
        return "Usuario{" + "dataDesconhecid=" + dataDesconhecid + ", bi=" + bi +
                ", usuario=" + usuario + ", senha=" + senha + ", senhaConf=" + senhaConf + '}';
    } 
}
