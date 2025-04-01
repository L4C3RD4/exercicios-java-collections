package livros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> lista_livros;

    public CatalogoLivros() {
        this.lista_livros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        lista_livros.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livros_Autor = new ArrayList<Livro>();
        if (!lista_livros.isEmpty()) {

            for (Livro livro : lista_livros) {
                if (livro.getAutor().equalsIgnoreCase(autor)) {
                    livros_Autor.add(livro);
                }
            }
        }

        return livros_Autor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livro_Intervalo = new ArrayList<Livro>();
        if (!lista_livros.isEmpty()) {
            for (Livro livro : lista_livros) {
                if (livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal) {
                    livro_Intervalo.add(livro);
                }

            }
        }

        return livro_Intervalo;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livro_retorno = new Livro();
        if (!lista_livros.isEmpty()) {
            
                for (Livro livro : lista_livros) {
                    if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                        livro_retorno = livro;
                        break;
                    }

                }

           
        }

        return livro_retorno;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogo = new CatalogoLivros();
        catalogo.adicionarLivro("Teste", "autor", 2020);
        catalogo.adicionarLivro("Teste", "autor2", 2021);
        catalogo.adicionarLivro("Teste3", "autor3", 2023);
        catalogo.adicionarLivro("Teste4", "autor3", 2026);
        System.out.println(catalogo.lista_livros);
        System.out.println("------------------------------------------ \n");
        System.out.println(catalogo.pesquisarPorAutor("autor3"));
        System.out.println("------------------------------------------ \n");
        System.out.println(catalogo.pesquisarPorIntervaloAnos(2021, 2023));
        System.out.println("------------------------------------------ \n");
        System.out.println(catalogo.pesquisarPorTitulo("Teste"));
    }
}
