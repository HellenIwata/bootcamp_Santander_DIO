public class CaixaEletronico {
    
    public static void main(String[] args) {
        double saldo = 50.0;
        double valorSolicitado = 50.6;

        //Resolvendo através de uma condição tenária
        String resultadoRequisao = saldo >= valorSolicitado ? "Saque realizado com sucesso" : "Saldo insuficiente. Seu saldo é de R$ "+saldo;

        System.out.println(resultadoRequisao);
    }
}
