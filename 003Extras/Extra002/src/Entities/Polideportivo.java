package Entities;

public final class Polideportivo extends Edificio{

    private String nombre;
    private Boolean techado;

    public Polideportivo() {
    }

    public Polideportivo(String nombre, Boolean techado, Double ancho, Double alto, Double largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.techado = techado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getTechado() {
        return techado;
    }

    public void setTechado(Boolean techado) {
        this.techado = techado;
    }

    @Override
    Double calcularVolumen() {
        return super.calcularVolumen();
    }

    @Override
    Double calcularSuperficie() {
        return super.calcularSuperficie();
    }
    
}
