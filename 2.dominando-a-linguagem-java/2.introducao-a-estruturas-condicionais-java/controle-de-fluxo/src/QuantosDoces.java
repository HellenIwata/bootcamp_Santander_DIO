import java.util.concurrent.ThreadLocalRandom;

public class QuantosDoces {

    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2,8);
    }
     // Testando o looping com while
    public static void main(String[] args) {
        double valorMesadaJoao = 100.0;
        while (valorMesadaJoao > 10.5) {
            double valorDoce = valorAleatorio();
            if (valorDoce > valorMesadaJoao)
                valorMesadaJoao = valorDoce;
            System.out.println("Doce no valor: R$ " +valorDoce+ " Adicionado no carrinho");
            valorMesadaJoao -=valorDoce;
        }
        if(valorMesadaJoao >0)
            System.out.print("Valor da mesada é: "+ valorMesadaJoao);
        else
            System.out.print("Não restou valor da mesada");
    }
    
}
