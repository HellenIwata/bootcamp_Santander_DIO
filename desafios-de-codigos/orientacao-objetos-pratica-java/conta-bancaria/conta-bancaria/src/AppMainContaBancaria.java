import models.registroTransacao.RegistroTransacao;

public class AppMainContaBancaria {
    
    public static void main(String[] args) {
        RegistroTransacao registroTransacoes = new RegistroTransacao();
        registroTransacoes.registrarTransacao();
    }
}
