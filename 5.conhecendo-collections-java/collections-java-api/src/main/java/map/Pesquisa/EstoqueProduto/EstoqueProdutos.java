package main.java.map.Pesquisa.EstoqueProduto;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    // Metodos
    public void adicionarProduto(long cod, String nome, int quantidade, double preco){
        estoqueProdutosMap.put(cod, new Produto(nome, quantidade, preco));
    }
    public void exibirProdutos(){
        if (!estoqueProdutosMap.isEmpty()) {
            System.out.println(estoqueProdutosMap);
        } else {
            System.out.println("O estoque está vázio");
        }
    }

    public double calcularValorTotalEstoque(){
        double estoqueTotal = 0d;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto produto : estoqueProdutosMap.values()) {
                estoqueTotal += produto.getPreco() * produto.getQuantidade();
            }
        } else {
            System.out.println("O estoque está vázio");
        }
        return estoqueTotal;
    }
    
    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p :estoqueProdutosMap.values()) {
                if (p.getPreco() > maiorPreco) {
                    produtoMaisCaro = p;
                    maiorPreco = p.getPreco();
                }
            }
        } else {
            System.out.println("O estoque está vázio");
        }
        return produtoMaisCaro;
    }
    
    public Produto obterProdutoMaisBarato(){
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p :estoqueProdutosMap.values()) {
                if (p.getPreco() < menorPreco) {
                    produtoMaisBarato = p;
                    menorPreco = p.getPreco();
                }
            }
        } else {
            System.out.println("O estoque está vázio");
        }
        return produtoMaisBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque(){
        Produto produtoMaiorQtdValorTotal = null;
        double maiorValorTotalProdEstoque = 0d;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Map.Entry<Long, Produto> e : estoqueProdutosMap.entrySet()){
                double valorProdutoEmEstoque = e.getValue().getPreco() * e.getValue().getQuantidade();
                if (valorProdutoEmEstoque > maiorValorTotalProdEstoque) {
                    maiorValorTotalProdEstoque = valorProdutoEmEstoque;
                    produtoMaiorQtdValorTotal = e.getValue();
                }
            }
        } else{
            System.out.println("O estoque está vázio");
        }
        return produtoMaiorQtdValorTotal;


    }

    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();
    
        // Exibe o estoque vazio
        estoque.exibirProdutos();
    
        // Adiciona produtos ao estoque
        estoque.adicionarProduto(1L, "Notebook", 1, 1500.0);
        estoque.adicionarProduto(2L, "Mouse", 5, 25.0);
        estoque.adicionarProduto(3L, "Monitor", 10, 400.0);
        estoque.adicionarProduto(4L, "Teclado", 2, 40.0);
    
        // Exibe os produtos no estoque
        estoque.exibirProdutos();
    
        // Calcula e exibe o valor total do estoque
        System.out.println("Valor total do estoque: R$" + estoque.calcularValorTotalEstoque());
    
        // Obtém e exibe o produto mais caro
        Produto produtoMaisCaro = estoque.obterProdutoMaisCaro();
        System.out.println("Produto mais caro: " + produtoMaisCaro);
    
        // Obtém e exibe o produto mais barato
        Produto produtoMaisBarato = estoque.obterProdutoMaisBarato();
        System.out.println("Produto mais barato: " + produtoMaisBarato);
    
        // Obtém e exibe o produto com a maior quantidade em valor no estoque
        Produto produtoMaiorQuantidadeValorTotal = estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque();
        System.out.println("Produto com maior quantidade em valor no estoque: " + produtoMaiorQuantidadeValorTotal);
    }
}
