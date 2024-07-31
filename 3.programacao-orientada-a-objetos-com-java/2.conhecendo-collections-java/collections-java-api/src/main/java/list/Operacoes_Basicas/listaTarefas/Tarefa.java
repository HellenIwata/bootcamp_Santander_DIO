package main.java.list.Operacoes_Basicas.listaTarefas;

public class Tarefa {
    private String descricao; //Atributo

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "Tarefa = " + descricao;
    }

    
}
