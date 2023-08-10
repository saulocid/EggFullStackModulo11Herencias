
package Formas;

import Interfaces.calculosFormas;

public class Rectangulo implements calculosFormas{

    private Double base;
    private Double altura;

    public Rectangulo() {
    }

    public Rectangulo(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }
    
    @Override
    public Double calcularPerimetro() {
        return (base+altura)*2;
    }

    @Override
    public Double calcularArea() {
        return base*altura;
    }

}
