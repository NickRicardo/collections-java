package main.java.map.operacoesBasicas;

public class Contatos {

    private String nome;

    private Integer numeroDeTelefone;

    public Contatos(String nome, Integer numeroDeTelefone) {
        this.nome = nome;
        this.numeroDeTelefone = numeroDeTelefone;
    }

    public String getNome() {
        return nome;
    }

    public Integer getNumeroDeTelefone() {
        return numeroDeTelefone;
    }

    @Override
    public String toString() {
        return "Contatos{" +
                "nome='" + nome + '\'' +
                ", numeroDeTelefone=" + numeroDeTelefone +
                '}';
    }
}
