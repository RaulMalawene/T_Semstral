package Senha;

public class SenhaConfirmAtualADM {
    
    private String senhaConfirm;
    
    public SenhaConfirmAtualADM(){    
    }

    public SenhaConfirmAtualADM(String senhaConfirm) {
        this.senhaConfirm = senhaConfirm;
    }

    public String getSenhaConfirm() {
        return senhaConfirm;
    }

    public void setSenhaConfirm(String senhaConfirm) {
        this.senhaConfirm = senhaConfirm;
    }

    @Override
    public String toString() {
        return "SenhaConfirmAtualADM{" + "senhaConfirm=" + senhaConfirm + '}';
    }
}
