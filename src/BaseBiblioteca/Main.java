package BaseBiblioteca;

public class Main {
    public static void main(String[] args) {

        System.out.println("Iniciando...");

        /**
         * Código para ejecutar por un administrativo de la empresa.
         * Código para introducir información de procesadores.
         */

        Libro book = new Libro();

        book.setIsbn(1);
        book.setAutor("Diego Lopez");
        book.setTítulo("Dragones");
        book.setGenero("Fantasia");
        book.setFechapubli("1/2/2003");
        
        System.out.println(book.getIsbn());
        System.out.println(book.getAutor());
        System.out.println(book.getTitulo());
        System.out.println(book.getGenero());
        System.out.println(book.getFechapubli());

        Autor author = new Autor();
        author.setNombre("Diego");
        author.setApellido("Lopez");
        author.setLocalidad("Calle Arroz");
        author.setFechanaci("17/8/2000");

        System.out.println(author.getNombre());
        System.out.println(author.getApellido());
        System.out.println(author.getLocalidad());
        System.out.println(author.getFechanaci());


        Usuario user = new Usuario();

        user.setNombre("Pepe");
        user.setApellido("Garcia");
        user.setDni("70800900A");
        user.setDireccion("Calle Cocido");
        user.setTelefono(66444555);

        System.out.println(user.getNombre());
        System.out.println(user.getApellido());
        System.out.println(user.getDni());
        System.out.println(user.getDireccion());
        System.out.println(user.getTelefono());

        Prestar loan = new Prestar();

        loan.setFechapres("Pepe");
        loan.setFechadev("Garcia");

        System.out.println(loan.getFechapres());
        System.out.println(loan.getFechadev());

}