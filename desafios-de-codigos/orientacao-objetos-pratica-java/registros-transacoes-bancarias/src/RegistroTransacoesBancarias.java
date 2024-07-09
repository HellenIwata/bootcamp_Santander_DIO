import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RegistroTransacoesBancarias {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in); //Iniciando o objeto Scanner
        System.out.println("Informe o seu saldo: ");
        double saldo = sc.nextDouble();
        System.out.println("Informe o seu limite transacoes: ");
        int qtdTransacoes = sc.nextInt();
        List<String> transacoesRealizadas = new ArrayList<>();


        for (int i = 1; i <= qtdTransacoes; i++) {
            char tipoTransacao;
            do{
                System.out.println("Escolha o tipo de transação que deseja realizar\nDigite 'D' paradepósito ou 'S' para Saque");
                tipoTransacao = sc.next().toUpperCase().charAt(0);
                if (tipoTransacao != 'D' && tipoTransacao != 'S') {
                    System.err.println("Opção inválida. Utilize D para depósito ou S para saque.");
                }
            } while(tipoTransacao != 'D' && tipoTransacao != 'S');

            System.out.println("Digite o valor da transação: ");
            double valorTransacao = sc.nextDouble();
            if (tipoTransacao == 'D') {
                saldo+=valorTransacao;
                transacoesRealizadas.add("D de " + valorTransacao);
            }else if (tipoTransacao == 'S'){
                saldo-=valorTransacao;
                transacoesRealizadas.add("S de " + valorTransacao);
            }
            
        }

        System.out.println("\nSaldo: "+saldo);
        System.out.println("\n------ Histórico de transações: ------");
        transacoesRealizadas.stream().forEach(System.out::println);


        sc.close();//Encerrando o objeto Scanner
    }
}
