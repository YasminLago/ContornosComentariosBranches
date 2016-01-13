package app_agenda;
//Yasmin

import java.util.Scanner;

public class Libreta {
    private String propietario,dni;
    Contactos contacto1,contacto2,contacto3,contacto4,contacto5,contacto6,contacto7,contacto8,contacto9,contacto10;

    public Libreta() {
        propietario= dni="";
    }

    public Libreta(String propietario, String dni, String aux_nombre, String aux_apellidos, String aux_telefono, String aux_email) {
        this.propietario = propietario;
        this.dni = dni;
        for(int i=0;i<10;i++){
        this.contacto2=new Contactos();
        contacto2.setNombre(aux_nombre);
        contacto2.setApellidos(aux_apellidos);
        contacto2.setTelefono(aux_telefono);
        contacto2.setEmail(aux_email);
        this.contacto3=new Contactos();
        contacto3.setNombre(aux_nombre);
        contacto3.setApellidos(aux_apellidos);
        contacto3.setTelefono(aux_telefono);
        contacto3.setEmail(aux_email);
        this.contacto4=new Contactos();
        contacto4.setNombre(aux_nombre);
        contacto4.setApellidos(aux_apellidos);
        contacto4.setTelefono(aux_telefono);
        contacto4.setEmail(aux_email);
        this.contacto5=new Contactos();
        contacto5.setNombre(aux_nombre);
        contacto5.setApellidos(aux_apellidos);
        contacto5.setTelefono(aux_telefono);
        contacto5.setEmail(aux_email);
        }
    }

    public String getDatosPropietario() {
        String pertenece;
        Scanner propiedad=new Scanner(System.in);
        System.out.println("Introduce nombre y dni del propietario: ");
        return pertenece=propiedad.next();
        
    }

    public void setDatosPropietario(String propietario,String dni) {
        this.propietario = propietario;
        this.dni = dni;
    }
    public void añadirContactos(Contactos contacto){
      
    }

}