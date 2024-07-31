package main.java.set.operacoes_basicas.conjunto_palavras;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    //Atributo
    private Set<String> palavrasUnicasSet;

    //Construtor
    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicasSet = new HashSet<>();
    }

    //Implementando os métodos
    public void adicionarPalavra(String palavra) {
        palavrasUnicasSet.add(palavra);
    }

    public void removerPalavra(String palavra){
        if (!palavrasUnicasSet.isEmpty()) {
            if (palavrasUnicasSet.contains(palavra)) {
                palavrasUnicasSet.remove(palavra);
            } else{
                System.out.println("Palavra não encontrada");
            }
        }else{
            System.out.println("Conjunto vazio");
        }
    }

    public boolean verificarPalavra(String palavra){
        return palavrasUnicasSet.contains(palavra);
    }

    public void exibirPalavrasUnicas(){
        if (!palavrasUnicasSet.isEmpty()) {
            System.out.println(palavrasUnicasSet);
        } else {
            System.out.println("O conjunto está vázio");
        }
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjunto = new ConjuntoPalavrasUnicas();
        
        conjunto.exibirPalavrasUnicas();

        conjunto.adicionarPalavra("Java");
        conjunto.adicionarPalavra("Python");
        conjunto.adicionarPalavra("SQL");
        conjunto.adicionarPalavra("C#");
        conjunto.adicionarPalavra("Matematica");

        System.out.println("A palavra 'SQL' faz parte do conjunto? "+ conjunto.verificarPalavra("SQL"));
        
        System.out.println("A palavra 'JavaScript' faz parte do conjunto? "+ conjunto.verificarPalavra("JavaScript"));

        conjunto.exibirPalavrasUnicas();

        conjunto.removerPalavra("Matematica");

        conjunto.exibirPalavrasUnicas();

    }
}
