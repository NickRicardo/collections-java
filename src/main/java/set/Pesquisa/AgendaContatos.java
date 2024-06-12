package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    //atributo
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContato() {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c : contatoSet) {
            if (c.getNome().startsWith(nome)) {
                contatosPorNome.add(c);

            }
        }
        return contatosPorNome;
    }


    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }


    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContato();

        agendaContatos.adicionarContato("Nicolas", 12345);
        agendaContatos.adicionarContato("Nicolas", 0);
        agendaContatos.adicionarContato("Nicolas Santos", 111111);
        agendaContatos.adicionarContato("Nicolas Javeiro", 65456);
        agendaContatos.adicionarContato("Ricardo Santos", 111111);

        agendaContatos.exibirContato();


        System.out.println(agendaContatos.pesquisarPorNome("Nicolas"));

        System.out.println("Contato atualizado: " + agendaContatos.atualizarNumeroContato("Ricardo Santos", 22222));

        agendaContatos.exibirContato();
    }
}
