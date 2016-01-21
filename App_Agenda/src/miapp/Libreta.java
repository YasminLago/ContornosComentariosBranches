package miapp;
//Yasmin
public class Libreta {
   // private String dni;
    int libre=cualLibre();
    Contacto[]arrayContactos=new Contacto[3];
    public Libreta(){   
    }
    /*public Libreta(String aux_nome, String aux_dni) {
        /*this.nome = aux_nome;
        this.dni = aux_dni;
        
    }
   /* public String getNome() {
        return nome;
    }

    public String getDni() {
        return dni;*/
      public int cualLibre(){
        for(libre=0;libre<arrayContactos.length;libre++){
            if(arrayContactos[libre].getNome().equals("")){
            System.out.println("Hay hueco");
        return libre;
            }else if(libre==arrayContactos.length){  
            }      
        }return -1;  
    }  
    public void engadir(){
        libre=cualLibre();
       if (libre>0){
           System.out.println("Introduce los datos del contacto: ");
           arrayContactos[libre-1].toString();
       }
    }
    public void listar(){
        for(int i=0;i<arrayContactos.length;i++){
            if(arrayContactos[i].toString().equals("")){
                
                
            }
           }
       }
}
