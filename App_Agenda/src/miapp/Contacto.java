package miapp;
//Yasmin
public class Contacto {
     private String nome, apelidos, telefono, email;
     public Contacto() {
        nome=apelidos=telefono=email="";
    }

    public Contacto(String aux_nome, String aux_apelidos, String aux_telefono, String aux_email) {
        this.nome = aux_nome;
        this.apelidos = aux_apelidos;
        this.telefono = aux_telefono;
        this.email = aux_email;   
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelidos() {
        return apelidos;
    }

    public void setApelidos(String apelidos) {
        this.apelidos = apelidos;
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

    @Override
    public String toString() {
        String texto;
        return texto=("Contacto: \n" + "Nome: "+"\n"+ getNome()+"\n"+ "Apelidos: " + getApelidos()+"\n"+"Telefono: " + getTelefono() +"\n"+"Email: " + getEmail() +"\n"+'}');
    }
    
}

