package Entities;

public class AlojamientoExtrahotelero extends Alojamiento{

    protected Boolean privado;
    protected Double m2;

    public AlojamientoExtrahotelero() {
    }

    public AlojamientoExtrahotelero(Boolean privado, Double m2, String nombre, String direccion, String localidad, String nombreGerente) {
        super(nombre, direccion, localidad, nombreGerente);
        this.privado = privado;
        this.m2 = m2;
    }

    public Boolean getPrivado() {
        return privado;
    }

    public void setPrivado(Boolean privado) {
        this.privado = privado;
    }

    public Double getM2() {
        return m2;
    }

    public void setM2(Double m2) {
        this.m2 = m2;
    }

    @Override
    public String toString() {
        return super.toString() + ", privado=" + privado + ", m2=" + m2;
    }
    
    
    
}
