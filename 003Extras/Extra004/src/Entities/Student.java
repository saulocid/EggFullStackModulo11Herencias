package Entities;

public final class Student extends Person {

    private String curso;

    public Student() {
    }

    public Student(String curso, String nombre, String apellido, Long cuil, String eCivil) {
        super(nombre, apellido, cuil, eCivil);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return super.toString() + ", curso=" + curso;
    }

}
