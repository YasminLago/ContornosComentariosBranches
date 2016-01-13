package app_agenda;
//Yasmin
public class Contactos {
    private String nombre, apellidos, telefono, email;
    int length;

    public Contactos() {
        nombre=apellidos=telefono=email="";
    }

    public Contactos(String aux_nombre, String aux_apellidos, String aux_telefono, String aux_email) {
        this.nombre = aux_nombre;
        this.apellidos = aux_apellidos;
        this.telefono = aux_telefono;
        this.email = aux_email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
