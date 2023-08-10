package Entities;

public class Hotel extends Alojamiento {

    protected Integer habitaciones;
    protected Integer camas;
    protected Integer pisos;
    protected Double precio;

    public Hotel() {
    }

    public Hotel(Integer habitaciones, Integer camas, Integer pisos, Double precio, String nombre, String direccion, String localidad, String nombreGerente) {
        super(nombre, direccion, localidad, nombreGerente);
        this.habitaciones = habitaciones;
        this.camas = camas;
        this.pisos = pisos;
        this.precio = precio;
    }

    public Integer getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(Integer habitaciones) {
        this.habitaciones = habitaciones;
    }

    public Integer getCamas() {
        return camas;
    }

    public void setCamas(Integer camas) {
        this.camas = camas;
    }

    public Integer getPisos() {
        return pisos;
    }

    public void setPisos(Integer pisos) {
        this.pisos = pisos;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    
    public Double precioHabitacion(){
        Double capacidad = (double)habitaciones*camas*pisos;
        return capacidad*50d;
    }

    @Override
    public String toString() {
        return super.toString()+ ", habitaciones=" + habitaciones + ", camas=" + camas + ", pisos=" + pisos + ", precio=" + precio;
    }
        
}
