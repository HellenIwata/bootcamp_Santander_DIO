package main.java.list.Pesquisa_Lista.catalogoLivro;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livroLista;

    public CatalogoLivros() {
        this.livroLista = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livroLista.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        //Faz validação de lista nula (cria apenas se a lista não existir)
        if(!livroLista.isEmpty()){ 
            for (Livro l : livroLista){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;  
    }
    
    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorAno = new ArrayList<>();
        if(!livroLista.isEmpty()){
            for (Livro l : livroLista){
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livrosPorAno.add(l);
                }
            }
        }
        return livrosPorAno;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if(!livroLista.isEmpty()){
            for (Livro l : livroLista){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("Doutrina e teologia de umbanda sagrada", "Rubens Saraceni", 2007);
        catalogoLivros.adicionarLivro("Orixás na Umbanda", "Alexandre Cumino", 0);
        catalogoLivros.adicionarLivro("Guardião da Meia noite", "Rubens Saraceni", 2006);
        catalogoLivros.adicionarLivro("História da umbanda", "Rubens Saraceni", 0);

        System.out.println("Busca por autor: "+catalogoLivros.pesquisarPorAutor("Rubens Saraceni")+"\n");

        System.out.println("Busca por ano: " + catalogoLivros.pesquisarPorIntervaloAnos(2007, 2008)+"\n");

        System.out.println("Busca por titulo: " + catalogoLivros.pesquisarPorTitulo("Guardião da Meia noite")+"\n");

    }
}
