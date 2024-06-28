package main.java.map.OperacoesBasicas.AgendaContato;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    //Atributo
    private Map<String, Integer> agendaContatoMap;

    //Construtor
    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer numero){
        agendaContatoMap.put(nome, numero);
    }
    
    public void removerContato(String nome){
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        } else {
            System.out.println("Agenda de contatos vazia");
        }
    }

    public void exibirContatos(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.get(nome);
            numeroPorNome = agendaContatoMap.get(nome);
            if(numeroPorNome == null){
                System.out.println("Contato não localizado na agenda!\n");
            }
            
        } else{
            System.out.println("Agenda de contatos vazia\n");
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();

        agenda.adicionarContato("Hellen", 930889923);
        agenda.adicionarContato("Alana", 988775566);
        agenda.adicionarContato("João", 999999999);
        agenda.adicionarContato("Maria", 777777777);

        agenda.pesquisarPorNome("Maria");

        agenda.exibirContatos();

        //Pesquisar pelo nome
        String nomePesquisa = "Hellen";
        Integer numeroPesquisa = agenda.pesquisarPorNome(nomePesquisa);
        System.out.println("O número do contato " + nomePesquisa + ": "+ numeroPesquisa+"\n");

        String novoNomePesquisa = "Dhara";
        Integer novoNumeroPesquisa = agenda.pesquisarPorNome(novoNomePesquisa);
        System.out.println("O número do contato " + novoNomePesquisa + ": "+ novoNumeroPesquisa+"\n");
    }
}
