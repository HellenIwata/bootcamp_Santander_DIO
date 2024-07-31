package main.java.map.Ordenacao.LivrariaOnline;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

public class LivrariaOnline {
    private Map<String, Livro> livrariaOnMap;

    public LivrariaOnline() {
        this.livrariaOnMap = new HashMap<>();
    }
    
    public void adicionarLivro(String link, String titulo, String autor, double preco){
        Livro livro = new Livro(titulo, autor, preco);
        livrariaOnMap.put(link, livro);
    }

    public void removerLivro(String titulo){
        List<String> livroARemover = new ArrayList<>();
        if (!livrariaOnMap.isEmpty()) {
            for (Map.Entry<String, Livro> entry : livrariaOnMap.entrySet()){
                if (entry.getValue().getTitulo().equalsIgnoreCase(titulo)){
                    livroARemover.add(entry.getKey());
                }
            }
        } else {
            System.out.println("A Livraria esta vázia");
        }

        for(String livro : livroARemover){
            livrariaOnMap.remove(livro);
        }
    }
    
    public Map<String, Livro> exibirLivrosOrdenadosPorAutor(){
        List<Map.Entry<String, Livro>> livrosParaOrdenarPorAutor = new ArrayList<>(livrariaOnMap.entrySet());
        Collections.sort(livrosParaOrdenarPorAutor, new ComparatorPorAutor());
        Map<String, Livro> livrosOrdenadosPorAutor = new LinkedHashMap<>();

        for (Map.Entry<String, Livro> entry : livrosParaOrdenarPorAutor) {
            livrosOrdenadosPorAutor.put(entry.getKey(), entry.getValue());
        }
        return livrosOrdenadosPorAutor;
    }
    public Map<String, Livro> exibirLivrosOrdenadosPorPreco() {
        List<Map.Entry<String, Livro>> livrosParaOrdenarPorPreco = new ArrayList<>(livrariaOnMap.entrySet());
    
        Collections.sort(livrosParaOrdenarPorPreco, new ComparatorPorPreco());
    
        Map<String, Livro> livrosOrdenadosPorPreco = new LinkedHashMap<>();
    
        for (Map.Entry<String, Livro> entry : livrosParaOrdenarPorPreco) {
        livrosOrdenadosPorPreco.put(entry.getKey(), entry.getValue());
        }
    
        return livrosOrdenadosPorPreco;
    }

    public Map<String, Livro> pesquisarLivrosPorAutor(String autor) {
        Map<String, Livro> livrosPorAutor = new LinkedHashMap<>();
        for (Map.Entry<String, Livro> entry : livrariaOnMap.entrySet()) {
        Livro livro = entry.getValue();
        if (livro.getAutor().equals(autor)) {
            livrosPorAutor.put(entry.getKey(), livro);
        }
        }
        return livrosPorAutor;
    }
    public List<Livro> obterLivroMaisCaro() {
        List<Livro> livrosMaisCaros = new ArrayList<>();
        double precoMaisAlto = Double.MIN_VALUE;

        if (!livrariaOnMap.isEmpty()) {
        for (Livro livro : livrariaOnMap.values()) {
            if (livro.getPreco() > precoMaisAlto) {
            precoMaisAlto = livro.getPreco();
            }
        }
        } else {
            System.out.println("A livraria está vazia!");
        }

        for(Map.Entry<String, Livro> entry: livrariaOnMap.entrySet()) {
            if(entry.getValue().getPreco() == precoMaisAlto) {
                Livro livroComPrecoMaisAlto = livrariaOnMap.get(entry.getKey());
                livrosMaisCaros.add(livroComPrecoMaisAlto);
            }
        }
        return livrosMaisCaros;
    }
    public List<Livro> obterLivroMaisBarato() {
        List<Livro> livrosMaisBaratos = new ArrayList<>();
        double precoMaisBaixo = Double.MAX_VALUE;
    
        if (!livrariaOnMap.isEmpty()) {
        for (Livro livro : livrariaOnMap.values()) {
            if (livro.getPreco() < precoMaisBaixo) {
            precoMaisBaixo = livro.getPreco();
            }
        }
        } else { System.out.println("A livraria está vazia!");}
    
        for(Map.Entry<String, Livro> entry: livrariaOnMap.entrySet()) {
        if(entry.getValue().getPreco() == precoMaisBaixo) {
            Livro livroComPrecoMaisBaixo = livrariaOnMap.get(entry.getKey());
            livrosMaisBaratos.add(livroComPrecoMaisBaixo);
        }
        }
        return livrosMaisBaratos;
    }

    public static void main(String[] args) {
        LivrariaOnline livraria = new LivrariaOnline();
        
        livraria.adicionarLivro("https://amzn.to/3EclT8Z", "1984", "George Orwell", 50d);
        livraria.adicionarLivro("https://amzn.to/47Umiun", "A Revolução dos Bichos", "George Orwell", 7.05d);
        livraria.adicionarLivro("https://amzn.to/3L1FFI6", "Caixa de Pássaros - Bird Box: Não Abra os Olhos", "Josh Malerman", 19.99d);
        
    
        // Exibe todos os livros ordenados por preço
        System.out.println("Livros ordenados por preço: \n" + livraria.exibirLivrosOrdenadosPorPreco());
    
        //Exibe todos os livros ordenados por autor
        System.out.println("Livros ordenados por autor: \n" + livraria.exibirLivrosOrdenadosPorAutor());
    
        // Pesquisa livros por autor
        String autorPesquisa = "Josh Malerman";
        livraria.pesquisarLivrosPorAutor(autorPesquisa);
    
        // Obtém e exibe o livro mais caro
        System.out.println("Livro mais caro: " + livraria.obterLivroMaisCaro());
    
        // Obtém e exibe o livro mais barato
        System.out.println("Livro mais barato: " + livraria.obterLivroMaisBarato());
    
        // Remover um livro pelo título
        livraria.removerLivro("1984");
        System.out.println(livraria.livrariaOnMap);
    
    }
}
