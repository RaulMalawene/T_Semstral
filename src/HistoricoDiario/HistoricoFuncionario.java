package HistoricoDiario;

public class HistoricoFuncionario {
    private String historico;

    public HistoricoFuncionario(){
    }
    
    public HistoricoFuncionario(String historico) {
        this.historico = historico;
    }

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }

    @Override
    public String toString() {
        return "HistoricoFuncionario{" + "historico=" + historico + '}';
    }  
}
