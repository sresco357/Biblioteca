package BaseBiblioteca;
import java.util.ArrayList;
import java.util.List;
public class Prestar {

    /** Private **/
    private String Fechapres;

    private String Fechadev;
    private List<Libro> book = new ArrayList<>();
    private List<Usuario> user = new ArrayList<>();

    /** Public **/

    public void setFechapres(String Fechapres){
        this.Fechapres = Fechapres;
    }
    public void setFechadev(String Fechadev){
        this.Fechadev = Fechadev;
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
