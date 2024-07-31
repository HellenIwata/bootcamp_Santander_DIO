package main.java.list.Odernacao_Lista.OrdenacaoPessoas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    //Atributo
    private List<Pessoa> listaPessoa;
    
    public OrdenacaoPessoas() {
        this.listaPessoa = new ArrayList();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        listaPessoa.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        // implementa ordenação por idade
        List<Pessoa> pessoasPorIdade = new ArrayList<>(listaPessoa);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;

    }

    public List<Pessoa> ordenarPorAltura(){
        // implementa ordenação por altura
        List<Pessoa> pessoasPorAltura = new ArrayList<>(listaPessoa);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

        ordenacaoPessoas.adicionarPessoa("Hellen Iwata", 23, 1.65);
        ordenacaoPessoas.adicionarPessoa("Andreia Iwata", 43, 1.58);
        ordenacaoPessoas.adicionarPessoa("Dhara Victoria", 22, 1.68);
        ordenacaoPessoas.adicionarPessoa("Leticia Oliveira", 32, 1.67);
        ordenacaoPessoas.adicionarPessoa("Bruno Willians", 26, 1.90);

        System.out.println("Ordenando a lista por altura\n"+ordenacaoPessoas.ordenarPorAltura());
        System.out.println("Ordenando a lista por idade\n"+ordenacaoPessoas.ordenarPorIdade());
    }
}
