package BaseBiblioteca;

public class Libro {
    /**
     * Atributos, propiedades, Variables
     */
    private Integer isbn;
    private String autor;
    private String genero;
    private String titulo;
    private String fechapubli;
    /**
     * Metodos, secciones, comportamiento,
     */
    public Integer getIsbn(){
        return isbn;
    }
    public void setIsbn(Integer isbn){
        this.isbn = isbn;
    }

    public String getAutor(){
        return autor;
    }
    public void  setAutor(String autor){
        this.autor = autor;
    }

    public String getGenero(){
        return genero;
    }
    public void  setGenero(String genero){
        this.genero = genero;
    }

    public String getTitulo(){
        return titulo;
    }
    public void  setTítulo(String genero){
        this.titulo = titulo;
    }

    public String getFechapubli(){
        return fechapubli;
    }
    public void  setFechapubli(String fechapubli){
        this.fechapubli = fechapubli;
    }
}
