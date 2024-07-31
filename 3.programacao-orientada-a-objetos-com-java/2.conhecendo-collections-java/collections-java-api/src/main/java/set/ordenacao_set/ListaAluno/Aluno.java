package main.java.set.ordenacao_set.ListaAluno;

import java.util.Comparator;
import java.util.Objects;

public class Aluno implements Comparable<Aluno>{
    // Atributos
    private String nome;
    private Long matricula;
    private Double media;

    //Construtor
    public Aluno(String nome, Long matricula, Double media) {
        this.nome = nome;
        this.matricula = matricula;
        this.media = media;
    }

    //Metodos getters
    public String getNome() {
        return nome;
    }

    public Long getMatricula() {
        return matricula;
    }

    public Double getMedia() {
        return media;
    }    

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Aluno aluno)) return false;
        return Objects.equals(getMatricula(), aluno.getMatricula());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMatricula());
    }

    //Comparando por nome do Aluno
    @Override
    public int compareTo(Aluno a) {
        return nome.compareTo(a.getNome());
    }

    //ToString - Formata a saída para não exibir o código da memória
    @Override
    public String toString() {
        return "Aluno {NOME: " + nome + ", MATRICULA: " + matricula + ", MÉDIA: " + media + "}";
    }

}

//Criando a comparação pela média do aluno
class comparatorPorMedia implements Comparator<Aluno>{

    @Override
    public int compare(Aluno a1, Aluno a2) {
        
        return Double.compare(a1.getMedia(), a2.getMedia());
    }
    
}
