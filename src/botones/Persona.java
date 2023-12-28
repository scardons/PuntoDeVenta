
package botones;


public class Persona {
    //CREAMOS SUS ATRIBUTOS
    String Id;
    String nombre;
    String apellido;
    String correo;
    int celular;
    
    
    //CONSTRUCTOR
    public Persona() {
        this.Id = "";
        this.nombre = "";
        this.apellido = "";
        this.correo = "";
        this.celular = 0;
    }
    
    
    
       //GETERS AND SETTERS
    public String getId() {
        return Id;
    }

    public void setId(String id) {
        this.Id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }
    
    
    
}
