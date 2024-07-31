package br.com.desafio.dominio;

public class Curso extends Conteudo{

    private int cargaHoraria;
    
    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    @Override
    public String toString() {
        return "Curso [TITULO: " + getTitulo() + "\nDESCRIÇÃO: " + getDescricao() + "\nCARGA HORARIA: " + cargaHoraria + "]";
    }

    
}
