package models.modelContaBancaria;

public class ContaPoupanca extends ContaBancaria{
    private double taxaJuros = 0.03;
    public ContaPoupanca(int numeroConta, String nomeTitular, double saldo, double taxaJuros) {
        super(numeroConta, nomeTitular, saldo);
        this.taxaJuros = taxaJuros;
        
    }

    public void exibirInformacoes(){
        System.out.println("--- *Conta Poupança* ---");
        super.exibirInformacoes();
        System.out.println("Taxa de juros: " + taxaJuros);
    }

    

    

}
