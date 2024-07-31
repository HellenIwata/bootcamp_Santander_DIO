package main.java.set.pesquisa_set.ListaTarefas;

public class Tarefa {
    //Atributo
    private String descricao;
    private boolean concluida;

    //Construtor
    public Tarefa(String descricao, boolean statusTarefa) {
        this.descricao = descricao;
        this.concluida = false;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    } 

    @Override
    public String toString() {
        return "Tarefa {" + descricao + ", " + concluida + "}";
    }
}
