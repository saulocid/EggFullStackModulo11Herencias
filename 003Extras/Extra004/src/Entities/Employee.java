package Entities;

import java.util.Calendar;

public class Employee extends Person {

    protected Calendar ingreso;
    protected Integer despacho;

    public Employee() {
    }

    public Employee(Calendar ingreso, Integer despacho, String nombre, String apellido, Long cuil, String eCivil) {
        super(nombre, apellido, cuil, eCivil);
        this.ingreso = ingreso;
        this.despacho = despacho;
    }

    public Calendar getIngreso() {
        return ingreso;
    }

    public void setIngreso(Calendar ingreso) {
        this.ingreso = ingreso;
    }

    public Integer getDespacho() {
        return despacho;
    }

    public void setDespacho(Integer despacho) {
        this.despacho = despacho;
    }

    @Override
    public String toString() {
        return super.toString() + ", ingreso=" + ingreso + ", despacho=" + despacho;
    }

}
