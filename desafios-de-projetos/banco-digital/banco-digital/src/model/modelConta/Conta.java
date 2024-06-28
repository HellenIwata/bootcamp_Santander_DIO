package model.modelConta;

import model.modelClient.Cliente;
import model.modelConta.interfaces.iConta;

public abstract class Conta implements iConta{
      //Atributos
    protected static final int AGENCIA_PADRAO = 1;
    protected static int SEQUENCIAL = 1;
    protected Cliente cliente;

    protected int agencia;
    protected int numeroConta;
    protected double saldo;

    //Getters
    public int getAgencia() {
        return agencia;
    }
    public int getNumeroConta() {
        return numeroConta;
    }
    public double getSaldo() {
        return saldo;
    }

    //Construtor
    public Conta(Cliente cliente){
        this.agencia=Conta.AGENCIA_PADRAO;
        this.numeroConta = SEQUENCIAL++;
        this.cliente = cliente;
    }
    //Metodos implementados a partir da interface
    @Override
    public void sacarValor(double valor) {
        if (saldo > valor) {
            this.saldo -= valor;
            System.out.println("Saque de R$ "+valor+" efetuado com sucesso da conta");
        } else {
            throw new UnsupportedOperationException("Operação negada! Saldo insulficiente."); 
        }
    }
    @Override
    public void depositarValor(double valor) {
        if (valor > 0.0) {
            this.saldo += valor;
            System.out.println("Depósito de R$ "+valor+" efetuado com sucesso.");
        } else {
            throw new UnsupportedOperationException("Operação negada! Valor inválido.");
        }
    }
    @Override
    public void transferirValor(double valor, Conta contaDestino) {
        this.sacarValor(valor);
        contaDestino.depositarValor(valor);
    }
    @Override
    public void consultarSaldo() {
        System.out.println("Saldo atual: R$ "+saldo);
    }

    public void exibirInformacoesCliente(){
        System.out.println(String.format("Titular: %s", this.cliente.getNomeCliente()));
        System.out.println(String.format("CPF: %s", this.cliente.getCpf()));
        System.out.println(String.format("Agencia: %d", this.agencia, " Conta: %d", this.numeroConta));
        System.out.println(String.format("Conta: %d", this.numeroConta));
        System.out.println("\n");
    }

    protected void exibirInformacoesConta(){
        System.out.println(String.format("Saldo atual: %d", this.saldo));
    }
}
