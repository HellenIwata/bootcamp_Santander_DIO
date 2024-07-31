package main.java.set.pesquisa_set.AgendaContatos;

import java.util.HashSet;
import java.util.Set;

public class AgendaContato {
    //Atributo
    private Set<Contato> contatoSet;

    //Construtor
    public AgendaContato() {
        this.contatoSet = new HashSet<>();
    }

    //Métodos
    public void adicionarContato(String nome, int telefone) {
        contatoSet.add(new Contato(nome, telefone));
    }

    public void exibirContatos(){
        if (!contatoSet.isEmpty()) {
            System.out.println(contatoSet);
        } else {
            System.out.println("Não existe contatos na agenda");
        }
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatoEncontrado = new HashSet<>();
        for (Contato c : contatoSet) {
            if (c.getNome().startsWith(nome)) {
                contatoEncontrado.add(c);
                
            } else {
                System.out.println("Contato não localizado");
            }
        }
        return contatoEncontrado;
    }

    public Contato  atualizarTelefoneContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setTelefone(novoNumero);
                contatoAtualizado = c;
                break;
            } else {
                System.out.println("Contato não localizado");
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContato agenda = new AgendaContato();

        agenda.exibirContatos();

        agenda.adicionarContato("Hellen Cristina", 930889923);
        agenda.adicionarContato("Camila Tavore", 930885566);
        agenda.adicionarContato("Maria", 911223344);
        agenda.adicionarContato("Maria Silva", 911223344);
        agenda.adicionarContato("Maria", 911223344);

        System.out.println("\nO contato "+agenda.pesquisarPorNome("Maria Silva")+" existe na agenda\n");

        agenda.exibirContatos();
        
        System.out.println("\nContato atualizado: "+agenda.atualizarTelefoneContato("Hellen Cristina", 1122554466)+"\n");
        
        agenda.exibirContatos();
    }
}
