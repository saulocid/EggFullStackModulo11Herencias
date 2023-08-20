package Entities;

public abstract class Person {

    protected String nombre;
    protected String apellido;
    protected Long cuil;
    protected String eCivil;

    public Person() {
    }

    public Person(String nombre, String apellido, Long cuil, String eCivil) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cuil = cuil;
        this.eCivil = eCivil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Long getCuil() {
        return cuil;
    }

    public void setCuil(Long cuil) {
        this.cuil = cuil;
    }

    public String geteCivil() {
        return eCivil;
    }

    public void seteCivil(String eCivil) {
        this.eCivil = eCivil;
    }

    @Override
    public String toString() {
        return "Nombre=" + nombre + ", apellido=" + apellido + ", cuil=" + cuil + ", eCivil=" + eCivil;
    }
    
    public void cambioEC(){
        System.out.println("Ingrese el nuevo estado civil");
    }
    
}
