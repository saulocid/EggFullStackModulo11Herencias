package Entities;

import java.util.Calendar;

public final class ServiceStaff extends Employee {

    private String seccion;

    public ServiceStaff() {
    }

    public ServiceStaff(String seccion, Calendar ingreso, Integer despacho, String nombre, String apellido, Long cuil, String eCivil) {
        super(ingreso, despacho, nombre, apellido, cuil, eCivil);
        this.seccion = seccion;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    @Override
    public String toString() {
        return super.toString() + "seccion=" + seccion;
    }

}
