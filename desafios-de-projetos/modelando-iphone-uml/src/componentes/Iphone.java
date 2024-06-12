package componentes;

import java.util.Scanner;
import componentes.apps.Ipod;
import componentes.apps.Phone;
import componentes.apps.Browser;

public class Iphone {
    public static void main(String[] args) throws Exception {
        Ipod ipod = new Ipod();
        Phone phone = new Phone();
        Browser browser = new Browser();


        System.out.println("Bem vindo ao IPhone\n");
        Scanner sc = new Scanner(System.in);
        
        System.out.println("1- iPod | 2- Telefone | 3- Navegador");
        int escolhaApps = sc.nextInt();
        if (escolhaApps == 1){
            ipod.iPod();
        } else if (escolhaApps == 2){
            phone.phone();
        } else {
            browser.browser();
        }
        sc.close();
        
    }
}
