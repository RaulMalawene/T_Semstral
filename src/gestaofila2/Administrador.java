package gestaofila2;

public class Administrador{
    private String nome, idade, sexo, senha;
    
    public  Administrador(){
    }

    public Administrador(String nome, String idade, String sexo, String senha) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Administrador{" + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + ", senha=" + senha + '}';
    }
}
