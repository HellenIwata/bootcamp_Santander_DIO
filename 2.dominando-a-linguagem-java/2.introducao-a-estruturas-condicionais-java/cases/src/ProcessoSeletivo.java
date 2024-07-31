//import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        System.out.println("***SISTEMA DE PROCESSO SELETIVO***\n");

        analisarSalario();

        System.out.println("\n");

        selecaoMaxCandidato();
    }

    static void analisarSalario(){
        System.out.println("***CASE 1: Seleção do candidato com base no salário***\n");
        double salariobase = 2000.0;
        double salarioPretendido = salarioPretendido();

        if (salariobase > salarioPretendido)
            System.out.println("LIGAR PARA O CANDIDATO");
        else if (salariobase == salarioPretendido)
            System.out.println("LIGAR PARA O CANDIDATO, COM CONTRA PROPOSTA");
        else
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");

        //System.out.println(salarioPretendido+"\n");
            
    }
    
    /**
     * 
     */
    static void selecaoMaxCandidato(){
        System.out.println("\n***CASE 2: Seleção do número máximo de candidatos***\n"); 
        // Array com a lista de candidatos
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
        List<String> candidatosSelecionados = new ArrayList<>();
        
        int totalSelecionado = 0;
        int proximoCandidato =0;
        double salariobase = 2000.0;
        double salarioPretendido = salarioPretendido();

        while (totalSelecionado < 5 && proximoCandidato <= candidatos.length) {
            String candidato = candidatos[proximoCandidato++];
            System.out.println(candidato + " esta pedindo o salário no valor de R$: " + salarioPretendido);

            if (salariobase >= salarioPretendido){
                System.out.println("LIGAR PARA O CANDIDATO: "+ candidato + "\n");
                candidatosSelecionados.add(candidato);
                totalSelecionado++;
            }
            else
                System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS\n");
        }
        System.out.println("Total de cadidatos selecionados: " + totalSelecionado);
        System.out.println("Total de candidatos consultados: " + proximoCandidato);

        System.out.println("\n***CASE 3: LISTA DOS CANDIDATOS SELECIONADOS***");
        for (String selecionado : candidatosSelecionados) {
            System.out.println(selecionado);
        }

        System.out.println("\n***CASE 4: TENTATIVAS DE CONTATO ***");
        int tentativasRealizadas = 1;
        boolean novaTentativa = true;
        boolean contatoSucesso = false;

        do{
            contatoSucesso = contatoSucesso();
            novaTentativa = !contatoSucesso;

            if (novaTentativa)
                tentativasRealizadas++;
            else
                System.out.println("CONTATO REALIZADO COM SUCESSO\n");
        } while(novaTentativa && tentativasRealizadas <3);
        for (String selecionado : candidatosSelecionados){
            if (contatoSucesso)
                System.out.println("CONTATO REALIZADO COM SUCESSO COM O CANDIDATO " + selecionado + " NA " + tentativasRealizadas + " TENTATIVA");
            else
                System.out.println("NÃO CONSEGUIMOS CONTATO COM " + selecionado +", NÚMERO MAXIMO TENTATIVAS " + tentativasRealizadas + " REALIZADA");
        }
    }    

    static boolean contatoSucesso() {
		return new Random().nextInt(3)==1;	
	}

    static double salarioPretendido() {
        //Simulação do salário pretendido
        return ThreadLocalRandom.current().nextDouble(1600, 2500);
    }
}
