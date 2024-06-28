package model.modelConta;

import model.modelClient.Cliente;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente){
        super(cliente);
    }
    
    @Override
    public void consultarSaldo() {
        System.out.println("\n--- * Consultando saldo da Conta Corrente* ---");
        super.consultarSaldo();
    }
    
}
