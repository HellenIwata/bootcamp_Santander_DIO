package main.java.list.Operacoes_Basicas.listaTarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("Numero total de tarefas: " + listaTarefa.obterNumTotalTarefas());

        listaTarefa.adicionarTarefa("Limpar a casa");
        listaTarefa.adicionarTarefa("Arrumar a cama");
        listaTarefa.adicionarTarefa("Trabalhar");
        listaTarefa.adicionarTarefa("Passear com o cachorro");

        System.out.println("Numero total de tarefas: " + listaTarefa.obterNumTotalTarefas());

        listaTarefa.removerTarefa("Arrumar a cama");
        System.out.println("Numero total de tarefas: " + listaTarefa.obterNumTotalTarefas());

        listaTarefa.obterDescricoesTarefas();

    }

    private List<Tarefa> tarefaLista;

    public ListaTarefa() {
        this.tarefaLista = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        //Adiciona apenas uma tarefa por vez na lista
        tarefaLista.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        //Remove tarefa a partir da descrição informada
        List<Tarefa> tarefaParaRemover = new ArrayList<>(); //Esta lista representa todas as tarefas que é desejado a remoção
        for (Tarefa t : tarefaLista){
            //Passa por cada elemento da lista e verifica se a descrição é igual o informado
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                tarefaParaRemover.add(t);
            }
        }
        tarefaLista.removeAll(tarefaParaRemover);
    }

    public int obterNumTotalTarefas(){
        //Retorna o tamanho total da lista 
        return tarefaLista.size();
    }

    public void obterDescricoesTarefas(){
        //Imprime todas as descrições das tarefas
        System.out.println(tarefaLista);
    }
    
}
