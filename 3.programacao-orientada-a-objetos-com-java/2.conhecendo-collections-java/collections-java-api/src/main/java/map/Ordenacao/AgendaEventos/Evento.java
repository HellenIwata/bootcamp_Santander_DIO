package main.java.map.Ordenacao.AgendaEventos;

public class Evento {
    private String nomeAtracao;
    private String nomeEvento;

    
    public Evento(String nomeAtracao, String nomeEvento) {
        this.nomeAtracao = nomeAtracao;
        this.nomeEvento = nomeEvento;
    }


    public String getNomeAtracao() {
        return nomeAtracao;
    }


    public String getNomeEvento() {
        return nomeEvento;
    }


    @Override
    public String toString() {
        return "Evento [nomeAtracao=" + nomeAtracao + ", nomeEvento=" + nomeEvento + "]";
    }

    
}
