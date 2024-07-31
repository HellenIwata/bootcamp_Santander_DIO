package main.java.list.Odernacao_Lista.OrdenacaoNumeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    //Atributo
    private List<NumerosInteiros> listaNumero;
    
    public OrdenacaoNumeros() {
        this.listaNumero = new ArrayList();
    }

    public void adicionarNumero(int numero){
        listaNumero.add(new NumerosInteiros(numero));
    }

    public List<NumerosInteiros> ordenarAscendente(){
        // implementa ordenação por idade
        List<NumerosInteiros> numeroAscendente = new ArrayList<>(listaNumero);
        Collections.sort(numeroAscendente);
        return numeroAscendente;
    }
    public List<NumerosInteiros> ordenarDescendente(){
        // implementa ordenação por idade
        List<NumerosInteiros> numeroAscendente = new ArrayList<>(listaNumero);
        Collections.sort(numeroAscendente, Collections.reverseOrder());
        return numeroAscendente;
    }

    public static void main(String[] args) {
        OrdenacaoNumeros ordenacao = new OrdenacaoNumeros();
        ordenacao.adicionarNumero(5);
        ordenacao.adicionarNumero(2);
        ordenacao.adicionarNumero(8);
        ordenacao.adicionarNumero(1);
        ordenacao.adicionarNumero(15);

        System.out.println("Exibindo os números em ordem ascendente: " + ordenacao.ordenarAscendente());
        System.out.println("Exibindo os números em ordem descendente: " + ordenacao.ordenarDescendente());
    }
}
