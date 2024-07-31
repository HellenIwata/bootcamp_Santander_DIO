package main.java.map.OperacoesBasicas.Dicionario;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    //Declarando o atributo
    private Map<String, String> dicionarioMap;
    
    //declarando o construtor
    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }

    //Declarando os métodos:
    /*adicionarPalavra(String palavra, String definicao) ->  Adiciona uma palavra e sua definição ao dicionário, associando a palavra à sua definição correspondente.*/
    public void adicionarPalavra(String palavra, String definicao) {
        dicionarioMap.put(palavra, definicao);
    }
    
    /*removerPalavra(String palavra): Remove uma palavra do dicionário, dado o termo a ser removido. */
    public void removerPalavra(String palavra){
        if (!dicionarioMap.isEmpty()) {
            dicionarioMap.remove(palavra);
        } else {
            System.out.println("Dicionario está vázio");
        }
    }

    /*exibirPalavras(): Exibe todas as palavras e suas definições do dicionário, mostrando cada palavra seguida de sua respectiva definição. */
    public void exibirPalavras(){
        if (!dicionarioMap.isEmpty()) {
            System.out.println(dicionarioMap);
        } else {
            System.out.println("Dicionario está vázio");
        }
    }

    /*pesquisarPorPalavra(String palavra): Pesquisa uma palavra no dicionário e retorna sua definição correspondente. */

    public String pesquisarPorPalavra(String palavra){
        
        String buscarPalavra = dicionarioMap.get(palavra);
        if (buscarPalavra == null) {
            System.out.println("\nPalavra não encontrada");
        }
        return buscarPalavra;
    }

    //Testando
    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        System.out.println("Adicionando as palavras e suas definições. \n");
        dicionario.adicionarPalavra("java", "Linguagem de programação orientada a objetos.");
        dicionario.adicionarPalavra("typescript", "Superset da linguagem JavaScript que adiciona tipagem estática.");
        dicionario.adicionarPalavra("kotlin", "Linguagem moderna de programação para a JVM.");

        //Pesquisar
        String pesquisaPalavra = "typescript";        
        String definicaoPalavra = dicionario.pesquisarPorPalavra(pesquisaPalavra);
        System.out.println("Definição de "+pesquisaPalavra+": "+ definicaoPalavra);

        String novaPesquisaPalavra = "Python";        
        String novaDefinicaoPalavra = dicionario.pesquisarPorPalavra(novaPesquisaPalavra);
        System.out.println("Definição de "+novaPesquisaPalavra+": "+ novaDefinicaoPalavra);

    }
}
