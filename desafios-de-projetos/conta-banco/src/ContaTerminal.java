import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        /*TODO: Conhecer e importar a classe Scanner; 
        Exibir as mensagens para o usuário; 
        Obter pela classe Scanneer os valor digitados no terminal; 
        Exibir a mensagem de conta criada */
        Integer accountNumber=1021;    
        String agency = "067-8";

        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o seu nome completo: ");
        String clientName = sc.nextLine();
        System.out.print("Por favor, informe o valor do primeiro depósito: ");
        Double balance = sc.nextDouble();

        System.out.println("\nOlá, "+clientName+", obrigada por criar uma conta em nosso banco, sua agência é "+agency+" conta "+accountNumber+" e seu saldo será de: R$"+balance+" que ficará disponível em até 3 dias úteis após o depósito.\n");

        sc.close();
    }

}