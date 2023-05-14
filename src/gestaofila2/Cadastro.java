package gestaofila2;

public class Cadastro {
    
    private String nom3, apelido, dataNascimento, dataDesconhecid, bi, sexos, celular,
            usuario, senha, senhaConf;

    public Cadastro(String nom3, String apelido, String dataNascimento, String dataDesconhecid, 
            String bi, String sexos, String celular, String usuario, String senha, String senhaConf) {
        this.nom3 = nom3;
        this.apelido = apelido;
        this.dataNascimento = dataNascimento;
        this.dataDesconhecid = dataDesconhecid;
        this.bi = bi;
        this.sexos = sexos;
        this.celular = celular;
        this.usuario = usuario;
        this.senha = senha;
        this.senhaConf = senhaConf;
    }

    public String getNom3() {
        return nom3;
    }

    public void setNom3(String nom3) {
        this.nom3 = nom3;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
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

    public String getSexos() {
        return sexos;
    }

    public void setSexos(String sexos) {
        this.sexos = sexos;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
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
    
    
    
}
