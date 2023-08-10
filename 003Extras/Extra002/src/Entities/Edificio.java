package Entities;

public abstract class Edificio<T> {

    protected Double ancho;
    protected Double alto;
    protected Double largo;

    public Edificio() {
    }

    public Edificio(Double ancho, Double alto, Double largo) {
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
    }

    public Double getAncho() {
        return ancho;
    }

    public void setAncho(Double ancho) {
        this.ancho = ancho;
    }

    public Double getAlto() {
        return alto;
    }

    public void setAlto(Double alto) {
        this.alto = alto;
    }

    public Double getLargo() {
        return largo;
    }

    public void setLargo(Double largo) {
        this.largo = largo;
    }
    
    Double calcularSuperficie(){
        return ancho*largo;
    }
    
    Double calcularVolumen(){
        return alto*ancho*largo;
    }
    
}
