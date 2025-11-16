package Práctica_8;

public class Libro2707 implements Comparable<Libro2707> {

    private String titulo;
    private String autor;
    private int id;
    private String categoria;

    public Libro2707(String titulo, String autor, int id, String categoria) {
        this.titulo = titulo;
        this.autor = autor;
        this.id = id;
        this.categoria = categoria;
    }

    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public int getId() { return id; }
    public String getCategoria() { return categoria; }
    public void setAutor(String autor) { this.autor = autor; }

    @Override
    public String toString() {
        return "ID " + id + ": '" + titulo + "' (" + autor + ") [" + categoria + "]";
    }

    @Override
    public int compareTo(Libro2707 otroLibro) {
        return Integer.compare(this.id, otroLibro.id);
    }
}