package models.modelCofreAcesso;

public class CofreDigital extends Cofre{
    private int senha;

    public CofreDigital(String tipo, String metodoAbertura, int senha) {
        super("Cofre Digital", "Senha");
        this.senha = senha;
    }

    public boolean validarSenha(int confirmacaoSenha){
        return confirmacaoSenha == this.senha;
    }
    
}
