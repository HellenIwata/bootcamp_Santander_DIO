package componentes.apps;

import java.util.Scanner;

public class Ipod {
    public void iPod(){
        System.out.println("Iniciando o aplicativo de música");
        Scanner sc = new Scanner(System.in);
        
        System.out.println("1 - tocar | 2 - pausar | 3 - Selecionar música");
        int escolha = sc.nextInt();

        if (escolha == 1){
            tocar();
        } else if (escolha == 2){
            pausar();
        } else {
            selecionarMusica();
        }

        sc.close();
    }

    private void tocar(){
        System.out.println("Tocando música selecionada");
    }
    private void pausar(){
        System.out.println("Música pausada");
    }
    private void selecionarMusica(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a música, artista, banda ou album que deseja ouvir: ");
        String musica = sc.nextLine();
        System.out.println("Você esta ouvindo: "+ musica);
        sc.close();
    }
}
