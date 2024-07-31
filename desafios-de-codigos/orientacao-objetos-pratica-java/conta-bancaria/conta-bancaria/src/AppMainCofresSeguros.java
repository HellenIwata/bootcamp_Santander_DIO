import java.util.Scanner;

import models.modelCofreAcesso.CofreDigital;
import models.modelCofreAcesso.CofreFisico;

public class AppMainCofresSeguros {
    public static void main(String[] args) {
    // Lê o tipo de cofre (primeira linha da entrada)
        Scanner scanner = new Scanner(System.in);
        String tipoCofre = scanner.nextLine();
        
        // TODO: Implemente a condição necessário para a verificação dos cofres seguros:
        if (tipoCofre.equalsIgnoreCase("digital")) {
            int senha = scanner.nextInt();
            scanner.nextLine();
            CofreDigital cfDigital = new CofreDigital("Cofre Digital", "Senha", senha);

            int confirmacaoSenha = scanner.nextInt();
            boolean senhaValida = cfDigital.validarSenha(confirmacaoSenha);

            if (senhaValida){
                cfDigital.imprimirInformacoes();
                System.out.println("Cofre aberto!");
            } else {
                cfDigital.imprimirInformacoes();
                System.out.println("Senha incorreta!");
            }
            }else if (tipoCofre.equalsIgnoreCase("fisico")){
            CofreFisico cfFisico = new CofreFisico();
            cfFisico.imprimirInformacoes();
            } else{
            System.out.println("Tipo de cofre invalido");
            }
        scanner.close();
    }
    
}
