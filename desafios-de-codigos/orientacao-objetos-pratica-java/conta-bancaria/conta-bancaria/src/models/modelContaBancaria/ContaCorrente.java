package models.modelContaBancaria;

public class ContaCorrente extends ContaBancaria{

    public ContaCorrente(int numeroConta, String nomeTitular, double saldo, double limiteEspecial,
            double taxaDeManutencao) {
        super(numeroConta, nomeTitular, saldo);
        
    }

    public void exibirInformacoes(){
        System.out.println("--- *Conta Corrente* ---");
        super.exibirInformacoes();
        
    }
    
}
