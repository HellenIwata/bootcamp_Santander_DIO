package main.java.set.ordenacao_set.CadastroProduto;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProduto {
    //Atributo
    private Set<Produto> produtoSet;

    //Construtor
    public CadastroProduto() {
        this.produtoSet = new HashSet<>();
    }

    //Implentação dos métodos
    public void adicionarProduto(long codigoProduto, String nome, double preco, int qtd){
        produtoSet.add(new Produto(codigoProduto, nome, preco, qtd));
    }

    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }

    //Testando os métodos

    public static void main(String[] args) {
        CadastroProduto cadastro = new CadastroProduto();

        cadastro.adicionarProduto(123, "Camiseta Peruana", 100, 10);
        cadastro.adicionarProduto(456, "Calça Jeans", 200, 20);
        cadastro.adicionarProduto(789, "Tênis Adidas", 300, 30);
        cadastro.adicionarProduto(321, "Bolsa de Couro", 400,10);
        cadastro.adicionarProduto(654, "Blusa moletom", 150, 6);

        System.out.println("Exibindo os produtos por nome: \n"+ cadastro.exibirProdutosPorNome());
        System.out.println("\nExibindo os produtos por preço: \n"+ cadastro.exibirProdutosPorNome());
    }
}
