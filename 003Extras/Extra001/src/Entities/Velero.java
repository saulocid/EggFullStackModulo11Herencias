package Entities;

import java.util.Date;

public final class Velero extends Barco implements Interfaces.Interface {

    private Integer mastiles;

    public Velero() {
    }

    public Velero(Integer mastiles, Long matricula, Double eslora, Date fabricacion) {
        super(matricula, eslora, fabricacion);
        this.mastiles = mastiles;
    }

    public Integer getMastiles() {
        return mastiles;
    }

    public void setMastiles(Integer mastiles) {
        this.mastiles = mastiles;
    }

    @Override
    public Double calcularAlquiler(Date dev, Date alq) {
        return (double) super.calcularAlquiler(dev, alq) + mastiles;
    }

}
