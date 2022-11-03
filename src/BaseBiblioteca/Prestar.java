package BaseBiblioteca;
import java.util.ArrayList;
import java.util.List;
public class Prestar {

    /** Private **/
    private String fechapres;

    private String fechadev;
    private List<Libro> book = new ArrayList<>();
    private List<Usuario> user = new ArrayList<>();

    /** Public **/

    public void setFechapres(String fechapres){
        this.fechapres = fechapres;
    }
    public String getFechapres(){
        return fechapres;
    }
    public void setFechadev(String fechadev){
        this.fechadev = fechadev;
    }
    public String getFechadev(){
        return fechapres;
    }

    public void addLibro(Libro book){
        this.book.add(book);
    }
    public List<Libro> getBook() {
        return book;
    }

    public void addUser(Usuario user){
        this.user.add(user);
    }
    public List<Usuario> getUser() {
        return user;
    }

}
