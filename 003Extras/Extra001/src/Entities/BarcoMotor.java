package Entities;

import java.util.Date;

public class BarcoMotor extends Barco implements Interfaces.Interface{

    protected Integer CV;

    public BarcoMotor() {
    }

    public BarcoMotor(Integer CV, Long matricula, Double eslora, Date fabricacion) {
        super(matricula, eslora, fabricacion);
        this.CV = CV;
    }

    public Integer getCV() {
        return CV;
    }

    public void setCV(Integer CV) {
        this.CV = CV;
    }
    
    @Override
    public Double calcularAlquiler(Date dev, Date alq) {
        return (double)super.calcularAlquiler(dev, alq)+CV;
    }
    
}
