package Entities;

import java.util.Date;

public class Alquiler {

    protected String nombre;
    protected Long DNI;
    protected Date alquiler;
    protected Date devolucion;
    protected Integer amarre;
    protected Barco barco;

    public Alquiler() {
    }

    public Alquiler(String nombre, Long DNI, Date alquiler, Date devolucion, Integer amarre, Barco barco) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.alquiler = alquiler;
        this.devolucion = devolucion;
        this.amarre = amarre;
        this.barco = barco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getDNI() {
        return DNI;
    }

    public void setDNI(Long DNI) {
        this.DNI = DNI;
    }

    public Date getAlquiler() {
        return alquiler;
    }

    public void setAlquiler(Date alquiler) {
        this.alquiler = alquiler;
    }

    public Date getDevolucion() {
        return devolucion;
    }

    public void setDevolucion(Date devolucion) {
        this.devolucion = devolucion;
    }

    public Integer getAmarre() {
        return amarre;
    }

    public void setAmarre(Integer amarre) {
        this.amarre = amarre;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }
    
}
