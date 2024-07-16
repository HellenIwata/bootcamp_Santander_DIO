package main.java.set.operacoes_basicas.conjunto_convidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    //Atributo
    private Set<Convidado> convidadoSet;

    //Construtor
    public ConjuntoConvidados(){
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado removerConvidadoPorCodigo = null;
        if(!convidadoSet.isEmpty()){
            for(Convidado c : convidadoSet){
                if (c.getCodigoConvite() == codigoConvite) {
                    removerConvidadoPorCodigo = c;
                    break;
                } else{
                    System.out.println("Convidado não encontrado");
                }
            }
            convidadoSet.remove(removerConvidadoPorCodigo);
        }else {
            System.out.println("A coleção esta vazia");
        }
    }
    public int contarConvidados(){
        return convidadoSet.size();
    }
    
    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s), dentro da coleção de Convidados");

        conjuntoConvidados.adicionarConvidado("Rosa", 1397);
        conjuntoConvidados.adicionarConvidado("Maria", 3487); 
        conjuntoConvidados.adicionarConvidado("João", 2548);
        conjuntoConvidados.adicionarConvidado("Aline", 2548);
        conjuntoConvidados.adicionarConvidado("Maria", 3487); 
        conjuntoConvidados.adicionarConvidado("Rosa", 1397);
        

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s), dentro da coleção de Convidados");
        
        conjuntoConvidados.removerConvidadoPorCodigoConvite(2548);

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s), dentro da coleção de Convidados");
    }
}
