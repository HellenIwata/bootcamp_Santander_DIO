package model.modelConta;

import model.modelClient.Cliente;

public class ContaPoupanca extends Conta {
    
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    
    public void consultarSaldo() {
        System.out.println("\n--- * Consultando saldo da Conta Poupança* ---");
        super.consultarSaldo();
    }
    
    
}
