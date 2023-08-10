package Entities;

import java.util.Date;

public final class Yate extends BarcoMotor implements Interfaces.Interface {

    private Integer camarotes;

    public Yate() {
    }

    public Yate(Integer camarotes, Integer CV, Long matricula, Double eslora, Date fabricacion) {
        super(CV, matricula, eslora, fabricacion);
        this.camarotes = camarotes;
    }

    public Integer getCamarotes() {
        return camarotes;
    }

    public void setCamarotes(Integer camarotes) {
        this.camarotes = camarotes;
    }

    @Override
    public Double calcularAlquiler(Date dev, Date alq) {
        return (double) super.calcularAlquiler(dev, alq)+ camarotes;
    }

}
