import model.modelClient.Cliente;
import model.modelConta.ContaCorrente;
import model.modelConta.ContaPoupanca;

public class App {
    public static void main(String[] args) throws Exception {
        Cliente cliente = new Cliente("João Pedro Silva", "45675985211");
        
        ContaCorrente cc = new ContaCorrente(cliente);
        ContaPoupanca cp = new ContaPoupanca(cliente);

        System.out.println("-- *Banco Digital Nova Geração* --");
        cc.exibirInformacoesCliente();
        System.out.println("Realizando as operações\n");
        cc.depositarValor(1000);
        cc.transferirValor(500, cp); 
        cc.consultarSaldo();

        cp.consultarSaldo();

    }
}
