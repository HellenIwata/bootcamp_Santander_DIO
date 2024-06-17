package main.java.list.Operacoes_Basicas.carrinhoCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras =  new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Arroz", 10.0, 3);
        carrinhoDeCompras.adicionarItem("Feijão", 5.0, 10);
        carrinhoDeCompras.adicionarItem("Carne", 20.0, 2);
        carrinhoDeCompras.adicionarItem("Luvas", 4.9, 1);
        carrinhoDeCompras.adicionarItem("Pneu", 230.0, 4);

        carrinhoDeCompras.exibirItens();
        System.out.println("Total: R$"+ carrinhoDeCompras.calcularValorTotal());

        carrinhoDeCompras.removerItem("Pneu");
    
        carrinhoDeCompras.exibirItens();
        System.out.println("Total: R$"+ carrinhoDeCompras.calcularValorTotal());
    }

    private List<Item> itemLista;

    public CarrinhoDeCompras() {
        this.itemLista = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        Item item = new Item(nome, preco, quantidade);
        this.itemLista.add(item);
    }

    public void removerItem(String nome){
        List<Item> itemParaRemover = new ArrayList<>();

        for (Item i : itemLista){
            if (i.getNome().equalsIgnoreCase(nome)){
                itemParaRemover.add(i);
            }
        }
        itemLista.removeAll(itemParaRemover);
    }

    public double calcularValorTotal(){
        double soma = 0.0;
        for (Item v : itemLista){
            double somaItem = v.getPreco() * v.getQuantidade();
            soma += somaItem;
        }
        return soma;
    }

    public void exibirItens(){
        System.out.println(this.itemLista);
    }
}
