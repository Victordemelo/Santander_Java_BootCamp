import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    // Atributos
    private final List<Livro> livrolist;

    // Constructor
    public CatalogoLivros() {
        this.livrolist = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livrolist.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livrolist.isEmpty()) {
            for (Livro l : livrolist) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if (!livrolist.isEmpty()) {
            for (Livro l : livrolist) {
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if (!livrolist.isEmpty()) {
            for (Livro l : livrolist) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        // Criando uma instância do catálogo de livros
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        // Adicionando livros ao catálogo
        catalogoLivros.adicionarLivro("Livro 01", "Autor 1", 2020);
        catalogoLivros.adicionarLivro("Livro 01", "Autor 2", 2021);
        catalogoLivros.adicionarLivro("Livro 02", "Autor 2", 2022);
        catalogoLivros.adicionarLivro("Livro 03", "Autor 3", 2023);
        catalogoLivros.adicionarLivro("Livro 04", "Autor 4", 1994);

        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 4"));

    }
}