package BaseBiblioteca;

public class Autor {
    /**
     * Atributos, propiedades, Variables
     */
    private String nombre;
    private String apellido;
    private String localidad;
    private String fechanaci;
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

    public String getLocalidad(){
        return localidad;
    }
    public void setLocalidad(String localidad){
        this.localidad = localidad;
    }

    public String getFechanaci(){
        return fechanaci;
    }
    public void setFechanaci(String fechanaci){
        this.fechanaci = fechanaci;
    }
}
