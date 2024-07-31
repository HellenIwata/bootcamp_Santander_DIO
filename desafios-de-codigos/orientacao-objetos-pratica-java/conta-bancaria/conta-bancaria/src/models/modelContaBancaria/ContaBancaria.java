package models.modelContaBancaria;

import java.text.DecimalFormat;
import java.util.Random;

public class ContaBancaria {
    protected int numeroAgencia;
    protected int numeroConta;
    protected String nomeTitular;
    protected double saldo;

    public ContaBancaria(int numeroConta, String nomeTitular, double saldo) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }

    private void criandoConta(){
        Random rand = new Random();
        this.numeroAgencia = rand.nextInt(9000)+1000;
        this.numeroConta = rand.nextInt(90000)+10000;
    }
    
    public void exibirInformacoes(){
        DecimalFormat decimalFormat = new DecimalFormat("#.0");
        System.out.println("Nome do titular: " + this.nomeTitular);
        System.out.println("Número da agencia: " + this.numeroAgencia);
        System.out.println("Numero da conta: " + this.numeroConta);
        System.out.println("Saldo: R$ " + decimalFormat.format(this.saldo, null, null));
    }
    
}
