package miapp;
//Yasmin

public class Libreta {

     private String nome, dni;
 
    private int libre = cualLibre();
    Contacto[] arrayContactos = new Contacto[3];

    public Libreta() {
        nome = dni = "";
    }

    public Libreta(String aux_nome, String aux_dni) {
        this.nome = aux_nome;
        this.dni = aux_dni;
    }

    public String getNome() {
        return nome;
    }

    public String getDni() {
        return dni;
    }

    public void engadir() {
        libre = cualLibre();
        if (libre > 0) {
            System.out.println("Introduzca nombre");
            arrayContactos[libre].setNome(nome);
        }
    }

    public int cualLibre() {
        for (int libre = 0; libre < arrayContactos.length; libre++) {
            if (arrayContactos[libre].getNome().equals("")) {
                System.out.println("Hay hueco");
                return libre;
            } else if (libre == arrayContactos.length) {
            }
        }
        return -1;
    }

    public void listar() {

    }

    public void engadirGrupo() {

    }

    public void borrarGrupo() {

    }

    public void listarGrupo() {

    }
}
