package main.java.set.pesquisa_set.ListaTarefas;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    //Atributo
    private Set<Tarefa> tarefasSet;

    //Construtor
    public ListaTarefas() {
        this.tarefasSet = new HashSet<>();
    }

    //Implementação dos métodos

    public void adicionarTarefa(String descricao){
        tarefasSet.add(new Tarefa(descricao, false));
    }
    
    public void removerTarefa(String descricao){
        Tarefa removerTarefa = null;
        if (!tarefasSet.isEmpty()) {
            for (Tarefa tarefa : tarefasSet) {
                if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                    removerTarefa = tarefa;
                    break;
                } else {
                    System.out.println("Tarefa não encontrada");
                }
            }
            tarefasSet.remove(removerTarefa);
        } else {
            System.out.println("O conjunto de tarefas esta vázio");
        }
    }

    public void exibirTarefa(){
        if (!tarefasSet.isEmpty()) {
            System.out.println(tarefasSet);
        } else{
            System.out.println("O conjunto de tarefas esta vázio");
        }
    }

    public void contarTarefas(){
        if (!tarefasSet.isEmpty()) {
            System.out.println("Este cojunto tem um total de: "+tarefasSet.size()+" tarefa(s)");
        } else{
            System.out.println("O conjunto de tarefas esta vázio");
        }
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa tarefa : tarefasSet) {
            if (tarefa.isConcluida()) {
                tarefasConcluidas.add(tarefa);
            } else{
                System.out.println("Não existe tarefas concluídas.");
            }
        }
        return tarefasConcluidas;
    }
    
    public Set<Tarefa> obterTarefasPendente(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for (Tarefa tarefa : tarefasSet) {
            if (!tarefa.isConcluida()) {
                tarefasPendentes.add(tarefa);
            } else{
                System.out.println("Não existe tarefas pendentes.");
            }
        }
        return tarefasPendentes;
            
    }

    public void marcarTarefaConcluida(String descricao){
        for (Tarefa tarefa : tarefasSet) {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefa.setConcluida(true);
                System.out.println("Tarefa concluída com sucesso");
            }
        }
    }

    public void marcarTarefaPendente(String descricao){
        Tarefa marcarPendente = null;
        for (Tarefa tarefa : tarefasSet) {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                marcarPendente = tarefa;
                break;
            }
        }
        if (marcarPendente != null) {
            if (marcarPendente.isConcluida()) {
                marcarPendente.setConcluida(false);
            }
        } else {
            System.out.println("Tarefa não encontrada");
        }
    }

    public void limparTarefas(){
        if (tarefasSet.isEmpty()) {
            System.out.println("Não existe tarefa");
        } else{
            tarefasSet.clear();
        }
    }

    public static void main(String[] args) {
        ListaTarefas tarefaController = new ListaTarefas();
        tarefaController.adicionarTarefa("Tarefa 1");
        tarefaController.adicionarTarefa("Tarefa 2");
        tarefaController.adicionarTarefa("Tarefa");
        tarefaController.adicionarTarefa("Tarefa 4");
        tarefaController.adicionarTarefa("Tarefa 5");
        tarefaController.adicionarTarefa("Tarefa 6");

        tarefaController.exibirTarefa();
        System.out.println("\n");

        tarefaController.removerTarefa("Tarefa");
        System.out.println("\n");
        tarefaController.exibirTarefa();

        System.out.println("\n");
        tarefaController.contarTarefas();
        System.out.println("\n");

        System.out.println("Tarefas Pendentes: " + tarefaController.obterTarefasPendente()+"\n");

        tarefaController.marcarTarefaConcluida("Tarefa 2");
        tarefaController.marcarTarefaConcluida("Tarefa 4");
        tarefaController.marcarTarefaConcluida("Tarefa 6");
        System.out.println("\n");
        System.out.println("Tarefas Concluídas: " + tarefaController.obterTarefasConcluidas()+"\n");
        System.out.println("\n");
        tarefaController.marcarTarefaPendente("Tarefa 4");
        System.out.println("Tarefas Pendentes: " + tarefaController.obterTarefasPendente()+"\n");
        System.out.println("\n");
        tarefaController.exibirTarefa();
        tarefaController.limparTarefas();
        System.out.println("\n");
        tarefaController.exibirTarefa();
    }
}
