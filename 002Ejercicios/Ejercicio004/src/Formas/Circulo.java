
package Formas;

import Interfaces.calculosFormas;

public class Circulo implements calculosFormas{

    private Double radio;

    public Circulo() {
    }

    public Circulo(Double radio) {
        this.radio = radio;
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }
    
    @Override
    public Double calcularPerimetro() {
        return PI * (radio+radio);
    }

    @Override
    public Double calcularArea() {
        return PI * Math.pow(radio, 2);
    }

}
