package main.java.set.ordenacao_set.CadastroProduto;

import java.util.Comparator;

public class Produto implements Comparable<Produto>{
    //Atributo
    private String nome;
    private long codigoProduto;
    private double preco;
    private int qtd;

    //Construtor
    public Produto(long codigoProduto, String nome, double preco, int qtd) {
        this.nome = nome;
        this.codigoProduto = codigoProduto;
        this.preco = preco;
        this.qtd = qtd;
    }
    
    //Comparando por nome do produto
    @Override
    public int compareTo(Produto p) {
        return nome.compareToIgnoreCase(p.getNome());
    }

    //Gets
    public String getNome() {
        return nome;
    }
    public long getCodigoProduto() {
        return codigoProduto;
    }
    public double getPreco() {
        return preco;
    }
    public int getQtd() {
        return qtd;
    }

    //HashAndEquals
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (codigoProduto ^ (codigoProduto >>> 32));
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Produto other = (Produto) obj;
        if (codigoProduto != other.codigoProduto)
            return false;
        return true;
    }

    //ToString
    @Override
    public String toString() {
        return "Produto {PRODUTO " + nome + ", CODIGO " + codigoProduto + ", PREÇO " + preco + ", QUANTIDADE " + qtd + "}";
    }
}

/**
 * ComparandoPorPreco implements Comparator<Produto>
 */
class ComparatorPorPreco implements Comparator<Produto> {
    @Override
    public int compare(Produto p1, Produto p2) {
        return Double.compare(p1.getPreco(), p2.getPreco());
    }
    
}
