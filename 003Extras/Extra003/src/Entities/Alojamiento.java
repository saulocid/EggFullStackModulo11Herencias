package Entities;

public class Alojamiento {

    protected String nombre;
    protected String direccion;
    protected String localidad;
    protected String nombreGerente;

    public Alojamiento() {
    }

    public Alojamiento(String nombre, String direccion, String localidad, String nombreGerente) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.localidad = localidad;
        this.nombreGerente = nombreGerente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getNombreGerente() {
        return nombreGerente;
    }

    public void setNombreGerente(String nombreGerente) {
        this.nombreGerente = nombreGerente;
    }

    @Override
    public String toString() {
        return "Alojamiento " + nombre + ", direccion=" + direccion + ", localidad=" + localidad + ", nombreGerente=" + nombreGerente;
    }
    
}
