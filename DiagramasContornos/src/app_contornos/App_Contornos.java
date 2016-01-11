package app_contornos;
public class App_Contornos {
//Yasmin
    public static void main(String[] args) {
        Coches citroen=new Coches("rojo","c1","citroen",5,5,65,"Diesel");
        System.out.println("Color: "+citroen.getColor());
        System.out.println("Modelo: "+citroen.getModelo());
        System.out.println("Marca: "+citroen.getMarca());
        System.out.println("Nº de puertas: "+citroen.getPuertas());
        System.out.println("Cilindrada: "+citroen.motor.getCilindrada());
        System.out.println("Cilindrada: "+citroen.motor.getCarburacion());
        System.out.println("Cilindrada: "+citroen.motor.getCombustible());
       
    }
    
}
