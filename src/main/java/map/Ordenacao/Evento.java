package main.java.map.Ordenacao;

public class Evento {

    //atributo
    private String nomeDoEvento;

    private String nomeDaAtracao;

    public Evento(String nomeDoEvento, String nomeDaAtracao) {
        this.nomeDoEvento = nomeDoEvento;
        this.nomeDaAtracao = nomeDaAtracao;
    }

    public String getNomeDoEvento() {
        return nomeDoEvento;
    }

    public String getNomeDaAtracao() {
        return nomeDaAtracao;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "nomeDoEvento='" + nomeDoEvento + '\'' +
                ", nomeDaAtracao='" + nomeDaAtracao + '\'' +
                '}';
    }
}
