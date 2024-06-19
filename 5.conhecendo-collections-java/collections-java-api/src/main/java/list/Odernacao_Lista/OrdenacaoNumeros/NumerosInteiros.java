package main.java.list.Odernacao_Lista.OrdenacaoNumeros;

public class NumerosInteiros implements Comparable<NumerosInteiros>{
    //Atributo
    private int numero;
    
    //Construtor
    public NumerosInteiros(int numero) {
        this.numero = numero;
    }
    
    @Override
    public int compareTo(NumerosInteiros numInt) {
        return Integer.compare(numero, numInt.getNumero());
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "NumerosInteiros [numero=" + numero + "]";
    }   
}