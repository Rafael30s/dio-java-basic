package set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContato {

    private Set<Contato> contatoSet;

    public AgendaContato() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato contato : contatoSet) {

            if (contato.getNome().startsWith(nome)) {
                contatosPorNome.add(contato);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;

        for (Contato contato : contatoSet) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                contato.setNumero(novoNumero);
                contatoAtualizado = contato;
                break;
            }
        }

        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContato agendaContato = new AgendaContato();

        agendaContato.exibirContatos();

        // Adicionando contatos à agenda
        agendaContato.adicionarContato("João", 123456789);
        agendaContato.adicionarContato("Maria", 987654321);
        agendaContato.adicionarContato("Maria Fernandes", 55555555);
        agendaContato.adicionarContato("Ana", 88889999);
        agendaContato.adicionarContato("Fernando", 77778888);
        agendaContato.adicionarContato("Carolina", 55555555);

        // Exibindo os contatos na agenda
        agendaContato.exibirContatos();

        // Pesquisando contatos pelo nome
        System.out.println(agendaContato.pesquisarPorNome("Maria"));

        // Atualizando o número de um contato
        Contato contatoAtualizado = agendaContato.atualizarNumeroContato("Carolina", 44443333);
        System.out.println("Contato atualizado: " + contatoAtualizado);

        // Exibindo os contatos atualizados na agenda
        System.out.println("Contatos na agenda após atualização:");
        agendaContato.exibirContatos();

    }
}
