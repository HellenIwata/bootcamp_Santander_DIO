package componentes.apps;

import java.util.Scanner;

public class Browser {
    public void browser(){
        System.out.println("Iniciando o navegador");
        Scanner sc = new Scanner(System.in);
        
        System.out.println("1 - Exibir página | 2 - Adicionar nova aba | 3 - Atualizar página");
        int escolha = sc.nextInt();

        if (escolha == 1){
            exibirPagina();
        } else if (escolha == 2){
            adicionarNovaAba();
        } else {
            atualizarPagina();
        }

        sc.close();
    }

    private void exibirPagina(){
        Scanner sc = new Scanner(System.in);
        System.out.println("O que esta procurando hoje? ");
        String url = sc.nextLine();
        System.out.println("Buscando... " + url);
        sc.close();

    }

    private void adicionarNovaAba(){
        System.out.println("Adicionando nova aba ao navegador");
    }

    private void atualizarPagina(){
        System.out.println("Atualizando a página");
    }
}
