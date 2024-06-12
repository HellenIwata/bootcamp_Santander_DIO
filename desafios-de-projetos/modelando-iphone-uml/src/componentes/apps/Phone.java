package componentes.apps;
import java.util.Scanner;


public class Phone {
    public void phone(){
        System.out.println("Iniciando o telefone");
        Scanner sc = new Scanner(System.in);
        
        System.out.println("1 - Ligar | 2 - Atender | 3 - Ligar para correio de voz");
        int escolha = sc.nextInt();

        if (escolha == 1){
            ligar();
        } else if (escolha == 2){
            atender();
        } else {
            correioVoz();
        }

        sc.close();
    }

    private void ligar(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número no qual deseja ligar: ");
        String numero = sc.nextLine();
        System.out.println("Ligando para o número " + numero);
        sc.close();

    }

    private void atender(){
        System.out.println("Chamada atendida");
    }

    private void correioVoz(){
        System.out.println("Chamando o Correio de voz");
    }
}
