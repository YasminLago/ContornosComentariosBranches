package app_contornos;

public class Coches {

    private String color, modelo;
    String marca;
    private int puertas;
    private Motor motor;

    public Coches() {
    }

    public Coches(String aux_color, String aux_modelo, String aux_marca, int aux_puertas, float aux_cilindrada) {
        this.color = aux_color;
        this.marca = aux_marca;
        this.modelo = aux_modelo;
        this.puertas = aux_puertas;
        this.motor = new Motor(65,"diesel",5);
       
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String aux_modelo) {
        this.modelo = aux_modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String aux_marca) {
        this.marca = aux_marca;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int aux_puertas) {
        this.puertas = aux_puertas;
    }

}
