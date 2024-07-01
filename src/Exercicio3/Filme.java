package Exercicio3;

public class Filme {
    private String titulo;
    private String nomeDiretor;
    private String categoria;

    public Filme(String titulo, String nomeDiretor, String categoria) {
        this.titulo = titulo;
        this.nomeDiretor = nomeDiretor;
        this.categoria = categoria;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNomeDiretor() {
        return nomeDiretor;
    }

    public void setNomeDiretor(String nomeDiretor) {
        this.nomeDiretor = nomeDiretor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void mostrarDetalhes() {
        System.out.println("Titulo: " + getTitulo() + "\nAno Lançamento: " + getNomeDiretor() + "\nGênero: " + getCategoria());
    }
}
