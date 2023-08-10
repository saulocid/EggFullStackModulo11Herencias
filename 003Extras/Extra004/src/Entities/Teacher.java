package Entities;

import java.util.Calendar;

public final class Teacher extends Employee{

    //lenjuage, matematicas, arquitectura...
    private String departamento;

    public Teacher() {
    }

    public Teacher(String departamento, Calendar ingreso, Integer despacho, String nombre, String apellido, Long cuil, String eCivil) {
        super(ingreso, despacho, nombre, apellido, cuil, eCivil);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return super.toString() + ", departamento=" + departamento;
    }
    
}
