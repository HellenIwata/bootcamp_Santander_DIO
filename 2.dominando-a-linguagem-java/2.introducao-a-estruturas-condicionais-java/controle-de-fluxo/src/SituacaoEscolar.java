public class SituacaoEscolar {
    public static void main(String[] args) {
        double mediaAluno = 6.5;

        //Resolvendo através de condicionais encadeadas
        if (mediaAluno >= 8.0)
            System.out.println("Aprovado");
        else if (mediaAluno < 8 && mediaAluno >= 5.5)
            System.out.println("Recuperação");
        else
            System.out.println("Reprovado");
    }
}
