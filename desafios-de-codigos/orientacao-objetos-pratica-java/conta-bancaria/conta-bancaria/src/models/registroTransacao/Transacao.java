package models.registroTransacao;

public class Transacao {
    private char tipo;
    private double valor, saldo;

    public Transacao(char tipo, double valor, double saldo) {
        this.tipo = tipo;
        this.valor = valor;
        this.saldo = saldo;
    }

    public char getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }
    public double getSaldo(){
        return saldo;
    }

    public boolean depositar(double valor){
        if (valor > 0) {
            this.saldo += valor;
            return true;
        } else{ 
            System.out.println("Valor para depósito inválido.");
        }
        return false;
    }

    public boolean sacar(double valor){
        if (valor >0 && valor <= this.saldo) {
            this.saldo -= valor;
            return true;
        } else{
            System.out.println("Operação cancelada. Saldo insuficiente para saque ou valor inválido.");
        }
        return false;
    }

    public void exibirSaldo(){
        System.out.println("Saldo Atual: " + this.saldo);
    }
}
