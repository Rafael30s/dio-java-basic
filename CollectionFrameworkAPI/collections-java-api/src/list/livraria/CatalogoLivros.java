package list.livraria;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, Integer ano) {
        livroList.add(new Livro(titulo, autor, ano));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro livro : livroList) {
                if (livro.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(livro);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorAnos(Integer anoInicial, Integer anoFinal) {
        List<Livro> livrosPorIntevaloAno = new ArrayList<>();

        if (!livroList.isEmpty()) {
            for (Livro livro : livroList) {
                if (livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal) {
                    livrosPorIntevaloAno.add(livro);
                }
            }
        }

        return livrosPorIntevaloAno;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;

        if (!livroList.isEmpty()) {
            for (Livro livro : livroList) {
                if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = livro;
                    break;
                }
            }
        }

        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Harry Potter", "J.K. Rolling", 2001);
        catalogoLivros.adicionarLivro("Harry Potter 2", "J.K. Rolling", 2003);
        catalogoLivros.adicionarLivro("Harry 3 Potter", "J.K. Rolling", 2004);

        catalogoLivros.adicionarLivro("O Hobbit", "Tolkien", 1890);
        catalogoLivros.adicionarLivro("O Hobbit", "Tolkien", 1990);

        System.out.println(catalogoLivros.pesquisarPorAutor("Tolkien"));

        System.out.println(catalogoLivros.pesquisarPorAnos(1900, 2001));

        System.out.println(catalogoLivros.pesquisarPorTitulo("O Hobbit"));
    }
}
