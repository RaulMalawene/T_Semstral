package PreMarcacao;

public class DadosPreMarcacao {
    private String usuario;
    private String nomeComp;
    private String telemovel;
    private String bi;
    private String objectivos;
    private String provincias;
    private String postos;
    private String tempo;
    private String horas;
    private String codigo;
    
    public DadosPreMarcacao(){
    }

    public DadosPreMarcacao(String usuario, String nomeComp, String telemovel, String bi, String objectivos, String provincias,
                            String postos, String tempo, String horas, String codigo) {
        this.usuario = usuario;
        this.nomeComp = nomeComp;
        this.telemovel = telemovel;
        this.bi = bi;
        this.objectivos = objectivos;
        this.provincias = provincias;
        this.postos = postos;
        this.tempo = tempo;
        this.horas = horas;
        this.codigo = codigo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
 
    public String getNomeComp() {
        return nomeComp;
    }

    public void setNomeComp(String nomeComp) {
        this.nomeComp = nomeComp;
    }

    public String getTelemovel() {
        return telemovel;
    }

    public void setTelemovel(String telemovel) {
        this.telemovel = telemovel;
    }

    public String getBi() {
        return bi;
    }

    public void setBi(String bi) {
        this.bi = bi;
    }

    public String getObjectivos() {
        return objectivos;
    }

    public void setObjectivos(String objectivos) {
        this.objectivos = objectivos;
    }

    public String getProvincias() {
        return provincias;
    }

    public void setProvincias(String provincias) {
        this.provincias = provincias;
    }

    public String getPostos() {
        return postos;
    }

    public void setPostos(String postos) {
        this.postos = postos;
    }

    public String getTempo() {
        return tempo;
    }

    public void setTempo(String tempo) {
        this.tempo = tempo;
    }

    public String getHoras() {
        return horas;
    }

    public void setHoras(String horas) {
        this.horas = horas;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "DadosPreMarcacao{" + "usuario=" + usuario + ", nomeComp=" + nomeComp + ", telemovel=" + telemovel + ", bi=" + bi + ", objectivos=" + objectivos + ", provincias=" + provincias + ", postos=" + postos + ", tempo=" + tempo + ", horas=" + horas + ", codigo=" + codigo + '}';
    }
}
