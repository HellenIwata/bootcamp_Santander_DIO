import java.util.concurrent.ThreadLocalRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        System.out.println("Olá, bem vindo ao Sistema de validação de processo seletivo\n");

        /*
         * Metódo utilizado para qunado quiser apenas analisar somente o salario sugerido pelo candidato
         *  analisarPretensaoSalarial(2500);
         */

         selecaoCandidatos();
    }
    static void selecaoCandidatos(){
        // Array com a lista de candidatos
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
        int totalSelecionado = 0;
        int proximoCandidato =0;
        double salariobase = 2000.0;
        double salarioPretendido = salarioPretendido();
        List<String> candidatosSelecionados = new ArrayList<>();

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
        System.out.println("Os candidatos selecionados são: " + candidatosSelecionados);

        System.out.println("\nIniciando a tentativa de contato");
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
                System.out.println("CONSEGUIMOS CONTATO COM " + selecionado + " APÓS " + tentativasRealizadas + " TENTATIVA(S)");
            else
                System.out.println("NÃO CONSEGUIMOS CONTATO COM " + selecionado);
        }
    }    

    static boolean contatoSucesso() {
		return new Random().nextInt(3)==1;	
	}
    static double salarioPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
    static void analisarPretensaoSalarial(double salarioPretendido){
        double salarioBase = 2000.0;

        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO, COM CONTRA PROPOSTA");
        }else{
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
        }

    }
}
