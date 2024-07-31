public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTV smartTV = new SmartTV();

        System.out.println("A televisão esta: "+ smartTV.ligada);
        System.out.println("Canal Atual: "+ smartTV.canalAtual);
        System.out.println("Volume Atual: "+ smartTV.volume);

        System.out.println("Consultas após mudanças");

        SmartTV.ligar ();
        System.out.println("A televisão esta: "+ smartTV.ligada);

        SmartTV.aumentarVolume();
        SmartTV.aumentarVolume();
        SmartTV.aumentarVolume();
        System.out.println("Volume Atual: "+ smartTV.volume);

        SmartTV.diminuirVolume();
        System.out.println("Volume Atual: "+ smartTV.volume);
        
    }
}
