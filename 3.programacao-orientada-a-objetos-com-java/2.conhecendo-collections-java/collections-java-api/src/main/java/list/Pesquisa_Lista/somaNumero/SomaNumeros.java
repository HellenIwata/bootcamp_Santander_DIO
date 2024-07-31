package main.java.list.Pesquisa_Lista.somaNumero;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> numeros;

    public SomaNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        numeros.add(numero);
    }

    public int calcularSoma(){
        int soma = 0;
        if(!numeros.isEmpty()){
            for(Integer n : numeros){
                soma += n;
            }
        }
        return soma;
    }
    
    public int encontrarMaiorNum(){
        int maiorNumero = Integer.MIN_VALUE;
        if (!numeros.isEmpty()) {
            for(Integer n : numeros){
                if (n >= maiorNumero) {
                    maiorNumero = n;
                }
            }
        }
        return maiorNumero;
    }
    public int encontrarMenorNum(){
        int menorNumero = Integer.MAX_VALUE;
        if (!numeros.isEmpty()) {
            for(Integer n : numeros){
                if (n <= menorNumero) {
                    menorNumero = n;
                }
            }
        }
        return menorNumero;
    }

    public void exibirNumeros(){
        if(!numeros.isEmpty()){
            System.out.println(this.numeros);
        }else {
            System.out.println("Nenhum numero adicionado a lista");
        }
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();
        somaNumeros.adicionarNumero(10);
        somaNumeros.adicionarNumero(2);
        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(3);
        somaNumeros.adicionarNumero(102543);
        somaNumeros.adicionarNumero(-2543);
        
        somaNumeros.exibirNumeros();
        System.out.println("Resultado da soma dos números: "+somaNumeros.calcularSoma());
        System.out.println("Maior numero encontrado na lista: "+somaNumeros.encontrarMaiorNum());
        System.out.println("Menor numero encontrado na lista: "+somaNumeros.encontrarMenorNum());
    }
}
