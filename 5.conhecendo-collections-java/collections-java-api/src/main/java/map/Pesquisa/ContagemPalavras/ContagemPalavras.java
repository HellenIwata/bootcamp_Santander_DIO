package main.java.map.Pesquisa.ContagemPalavras;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    //Atributo
    private Map<String, Integer> contagemPalavrasMap;

    //Construtor
    public ContagemPalavras() {
        this.contagemPalavrasMap = new HashMap<>();
    }
    
    //Implementando os métodos
    public void adicionarPalavra(String palavra, Integer contagem){
        contagemPalavrasMap.put(palavra, contagem);
    }

    public void removerPalavra(String palavra){
        if (!contagemPalavrasMap.isEmpty()) {
            contagemPalavrasMap.remove(palavra);
        } else {
            System.out.println("'Contagem Palavras' está vázio");
        }
    }

    public int exibirContagemPalavras(){
        int contagemTotal = 0;
        if (!contagemPalavrasMap.isEmpty()) {
            for (int cont : contagemPalavrasMap.values()){
                contagemTotal += cont;
            }
        } else {
            System.out.println("'Contagem Palavras' está vázio");
        }
        return contagemTotal;
    }

    public String encontrarPalavraMaisFrequente(){
        String palavraMaisFrequente = null;
        int maiorContagem = 0;

        if (!contagemPalavrasMap.isEmpty()) {
            for (Map.Entry<String, Integer> e : contagemPalavrasMap.entrySet()){
                if(e.getValue() > maiorContagem){
                    maiorContagem = e.getValue();
                    palavraMaisFrequente = e.getKey();
                }
            }
        } else {
            System.out.println("'Contagem Palavras' está vázio");
        }
        return palavraMaisFrequente;
    }

    //Testes
    public static void main(String[] args) {
        ContagemPalavras contagemLinguagens = new ContagemPalavras();
    
        // Adiciona linguagens e suas contagens
        contagemLinguagens.adicionarPalavra("Java", 2);
        contagemLinguagens.adicionarPalavra("Python", 8);
        contagemLinguagens.adicionarPalavra("JavaScript", 1);
        contagemLinguagens.adicionarPalavra("C#", 6);
    
        // Exibe a contagem total de linguagens
        System.out.println("Existem " + contagemLinguagens.exibirContagemPalavras() + " palavras.");
    
        // Encontra e exibe a linguagem mais frequente
        String linguagemMaisFrequente = contagemLinguagens.encontrarPalavraMaisFrequente();
        System.out.println("A linguagem mais frequente é: " + linguagemMaisFrequente);
    }

}
