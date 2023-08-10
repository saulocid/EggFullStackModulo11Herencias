package Entities;

public final class Residencia extends AlojamientoExtrahotelero {

    private Integer habitaciones;
    private Boolean descuento;
    private Boolean campoDep;

    public Residencia() {
    }

    public Residencia(Integer habitaciones, Boolean descuento, Boolean campoDep, Boolean privado, Double m2, String nombre, String direccion, String localidad, String nombreGerente) {
        super(privado, m2, nombre, direccion, localidad, nombreGerente);
        this.habitaciones = habitaciones;
        this.descuento = descuento;
        this.campoDep = campoDep;
    }

    public Integer getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(Integer habitaciones) {
        this.habitaciones = habitaciones;
    }

    public Boolean getDescuento() {
        return descuento;
    }

    public void setDescuento(Boolean descuento) {
        this.descuento = descuento;
    }

    public Boolean getCampoDep() {
        return campoDep;
    }

    public void setCampoDep(Boolean campoDep) {
        this.campoDep = campoDep;
    }

    @Override
    public String toString() {
        return super.toString() + "habitaciones=" + habitaciones + ", descuento=" + descuento + ", campoDep=" + campoDep;
    }

}
