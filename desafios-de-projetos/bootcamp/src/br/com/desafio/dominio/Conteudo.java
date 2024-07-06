package br.com.desafio.dominio;

public abstract class Conteudo {
    /* 
     * Classe abstrata significa que não é possível instanciar um objeto
    */
    /*Modificadores de acesso: 
        * public -> Qualquer classe tem acesso
        * private -> Apenas a classe em que foi declarado acessa
        * protected -> Apenas classes da mesma hierarquias ou os filhos da classe tem acesso
    */
    protected static final double XP_PADRAO = 10d;
    private String titulo, descricao;

    public abstract double calcularXp();

    public static double getXpPadrao() {
        return XP_PADRAO;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
}
