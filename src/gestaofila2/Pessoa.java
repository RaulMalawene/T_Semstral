
package gestaofila2;

public abstract class Pessoa {
    private String nome, apelido,dataNascimento, celular, sexos;
    
    public Pessoa(){
        
    }

    public Pessoa(String nome, String apelido, String dataNascimento, String celular, String sexos) {
        this.nome = nome;
        this.apelido = apelido;
        this.dataNascimento = dataNascimento;
        this.celular = celular;
        this.sexos =sexos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getSexos() {
        return sexos;
    }

    public void setSexos(String sexos) {
        this.sexos = sexos;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", apelido=" + apelido + ", dataNascimento=" + dataNascimento + ", celular=" + celular + ", sexos=" + sexos + '}';
    } 
}
