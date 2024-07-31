public class SmartTV {
    static boolean ligada = false;
    int canalAtual = 1;
    int volume = 10;
    
    public static void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }

    public static void aumentarVolume(){
        volume ++;
    }
    public void diminuirVolume(){
        volume --;
    }


}
