package gestaofila2;

public class Funcionarios {
    
    private String nomeFuncionario;
    private String idade;
    private String sexo;
    private String UsuarioFuncionario;
    private String senha;
    
    public Funcionarios(){
    
}
    public Funcionarios(String nomeFuncionario, String idade, String sexo, String UsuarioFuncioario, String senha) {
        this.nomeFuncionario = nomeFuncionario;
        this.idade = idade;
        this.sexo = sexo;
        this.UsuarioFuncionario = UsuarioFuncioario;
        this.senha = senha;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getUsuarioFuncionario() {
        return UsuarioFuncionario;
    }

    public void setUsuarioFuncionario(String UsuarioFuncionario) {
        this.UsuarioFuncionario = UsuarioFuncionario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Funcionarios{" + "nomeFuncionario=" + nomeFuncionario + ", idade=" + idade + ", sexo=" + sexo 
                + ", UsuarioFuncioario=" + UsuarioFuncionario + ", senha=" + senha + '}';
    }
}
