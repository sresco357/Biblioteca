package BaseBiblioteca;

public class Usuario {
    /**
     * Atributos, propiedades, Variables
     */
    private String nombre;
    private String apellido;
    private String dni;
    private Integer telefono;
    private String direccion;
    /**
     * Metodos, secciones, comportamiento,
     */
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getApellido(){
        return apellido;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public String getDni(){
        return dni;
    }
    public void setDni(String dni){
        this.dni = dni;
    }

    public Integer getTelefono(){
        return telefono;
    }
    public void setTelefono(Integer telefono){
        this.telefono = telefono;
    }

    public String getDireccion(){
        return direccion;
    }
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
}
