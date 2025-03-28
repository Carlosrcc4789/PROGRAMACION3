package ejemplo3;


public class Libro {
    private String titulo;
    private String autor;
    private int numeroPaginas;


    public Libro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }


    public String mostrarDetalles() {
        return "Título: " + titulo + ", Autor: " + autor + ", Páginas: " + numeroPaginas;
    }

    public static void main(String[] args) {
        Libro libro1 = new Libro("1984", "George Orwell", 328);
        System.out.println(libro1.mostrarDetalles());

        libro1.setNumeroPaginas(350);
        System.out.println("Páginas actualizadas: " + libro1.getNumeroPaginas());
    }
}
