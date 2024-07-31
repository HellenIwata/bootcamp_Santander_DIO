package models.modelRegistroTransacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RegistroTransacao {
    public void registrarTransacao(){
        Scanner sc  = new Scanner(System.in);

        //Solicitando as entradas do saldo e quantidades de transacoes a serem realizadas;
        System.out.println("Digite o saldo inicial: ");
        double saldo = sc.nextDouble();

        System.out.println("Digite a quantidade de transacoes a serem realizadas: ");
        int qtdTransacoes = sc.nextInt();

        List<Transacao> transacoesRealizadas = new ArrayList<>();
        

        for (int i = 1; i<=qtdTransacoes; i++) {
            System.out.println("O que você deseja fazer? \nD - Depósito\nS - Saque");
            char tipoTransacao = sc.next().toUpperCase().charAt(0);

            while (tipoTransacao != 'D' && tipoTransacao != 'S') {
                System.out.println("Tipo de operação inválida. Digite a operação correta!");
                System.out.println("Operações disponíveis:\nD - Depósito\nS - Saque");
                tipoTransacao = sc.next().toUpperCase().charAt(0);
            }

            System.out.print("Digite o valor da transação: ");
            double valorTransacao = sc.nextDouble();

            Transacao transacao = new Transacao(tipoTransacao, valorTransacao, saldo);

            boolean validarOperacao = false;

            if (transacao.getTipo() == 'D') {
                validarOperacao = transacao.depositar(valorTransacao);
            } else if (transacao.getTipo() == 'S') {
                validarOperacao = transacao.sacar(valorTransacao);
            }
            
            if (validarOperacao){
                transacoesRealizadas.add(transacao);
                saldo = transacao.getSaldo();
            } else{
                saldo = transacao.getSaldo();
                System.out.println("Operação não realizada!");
            }
        }
        //Imprimindo o saldo
        if (!transacoesRealizadas.isEmpty()) {
            transacoesRealizadas.get(transacoesRealizadas.size() - 1).exibirSaldo();
            //mprimindo as transacoes realizadas
            System.out.println("\n--- *Extrato* ---");
            transacoesRealizadas.forEach(t ->  System.out.println((t.getTipo() == 'D' ? "Depósito de " : "Saque de ") + t.getValor()));
        } else{
            System.out.println("Não há histórico de transações");
        }
        
        sc.close();
    }
}
