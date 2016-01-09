package app_contornos;
//Yasmin
public class Motor {
    private float cilindrada;
    private String combustible;
    private int carburacion;

    public Motor() {
    }

    public Motor(float aux_cilindrada, String aux_combustible, int aux_carburacion) {
        this.cilindrada = aux_cilindrada;
        this.combustible = aux_combustible;
        this.carburacion = aux_carburacion;
    }

    public float getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(float aux_cilindrada) {
        this.cilindrada = aux_cilindrada;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String aux_combustible) {
        this.combustible = aux_combustible;
    }

    public int getCarburacion() {
        return carburacion;
    }

    public void setCarburacion(int aux_carburacion) {
        this.carburacion = aux_carburacion;
    }
    
    
}