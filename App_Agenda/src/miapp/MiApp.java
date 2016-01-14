package miapp;
//Yasmin

import javax.swing.JOptionPane;

public class MiApp {
    public static void main(String[] args) {
       Libreta miLibreta=new Libreta();
       Contacto contacto1,contacto2,contacto3,contacto4,contacto5,contacto6,contacto7,contacto8,contacto9,contacto10;
       String res=JOptionPane.showInputDialog("Elige una opcion");
       int opcion=Integer.parseInt(res);
       switch(opcion){
           case 1: JOptionPane.showMessageDialog(null,"Engadir");
           miLibreta.engadir();
                break;
           case 2:
       }
    }
    
}