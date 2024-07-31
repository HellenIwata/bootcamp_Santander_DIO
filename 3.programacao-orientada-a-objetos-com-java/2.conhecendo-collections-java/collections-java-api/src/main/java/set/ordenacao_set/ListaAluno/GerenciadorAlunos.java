package main.java.set.ordenacao_set.ListaAluno;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    //Atributo
    private Set<Aluno> alunoSet;
    
    //Construtor
    public GerenciadorAlunos() {
        this.alunoSet = new HashSet<>();
    }

    //Implementação dos métodos

    /*adicionarAluno() -> Adiciona um aluno ao cojunto */
    public void adicionarAluno(String nome, Long matricula, double media){
        alunoSet.add(new Aluno(nome, matricula, media));
    }

    /*removerAluno() -> Remove um aluno do cojunto a partir da matricula, se estiver presente*/
    public void removerAluno(long matricula){
        Aluno removerAlunoPorMatricula = null;
        if (!alunoSet.isEmpty()) {
            for (Aluno aluno : alunoSet) {
                if (aluno.getMatricula() == matricula) {
                    removerAlunoPorMatricula = aluno;
                    System.out.println("Aluno removido com sucesso\n");
                    break;
                }
            }
            alunoSet.remove(removerAlunoPorMatricula);
        } else {
            System.out.println("O Conjunto está vazio");
        }
        if (removerAlunoPorMatricula == null){
            System.out.println("Matricula não encontrada");
        }
    }

    /*exibirAlunosPorNome() -> Exibi todos os alunos do conjunto em ordem alfabética */
    public void exibirAlunosPorNome(){
        Set<Aluno> alunosOrdenados = new TreeSet<>(alunoSet);
        if (!alunoSet.isEmpty()) {
            System.out.println(alunosOrdenados);
        } else {
            System.out.println("O Conjunto está vazio");
        }
    }
    /*exibirAlunosPorNota() -> Exibi todos os alunos do conjunto em ordem crescente pela média */

    public void exibirAlunosPorMedia(){
        Set<Aluno> alunosOrdenadosMedia = new TreeSet<>(new comparatorPorMedia());
        if (!alunoSet.isEmpty()) {
            alunosOrdenadosMedia.addAll(alunoSet);
            System.out.println(alunosOrdenadosMedia);
        } else {
            System.out.println("O Conjunto está vazio");
        }
    }

    /*exibirAlunos() -> Exibi todos os alunos do conjunto */
    public void exibirAlunos(){
        if (!alunoSet.isEmpty()) {
            System.out.println(alunoSet);
        } else {
            System.out.println("Não existe aluno neste conjunto");
        }
    }

    //Testando a aplicação

    public static void main(String[] args) {
        GerenciadorAlunos alunos = new GerenciadorAlunos();

        alunos.adicionarAluno("Maria", 123456L, 7.5);
        alunos.adicionarAluno("Carlos", 002544L, 5.0);
        alunos.adicionarAluno("Antonio", 113568L, 3.5);
        alunos.adicionarAluno("Heitor", 254789L, 7.75);
        alunos.adicionarAluno("Daniel", 000147L, 8.9);

        System.out.println("Alunos cadastrados no gerenciador: \n");
        alunos.exibirAlunos();

        System.out.println("\n\nRemovendo aluno\n");
        alunos.removerAluno(000L);
        alunos.removerAluno(123456L);

        alunos.exibirAlunos();

        System.out.println("\nExibindo alunos por nome: \n");
        alunos.exibirAlunosPorNome();
        System.out.println("\nExibindo alunos por média: \n");
        alunos.exibirAlunosPorMedia();

    }
}
