package list.livraria;

public class Livro {
    private String titulo;
    private String autor;
    private Integer anoPublicacao;

    public Livro(String titulo, String auto, Integer anoPublicacao) {
        this.titulo = titulo;
        this.autor = auto;
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public Integer getAnoPublicacao() {
        return anoPublicacao;
    }

    @Override
    public String toString() {
        return "\nLivro [titulo=" + titulo + ", autor=" + autor + ", anoPublicacao=" + anoPublicacao + "]";
    }

}
