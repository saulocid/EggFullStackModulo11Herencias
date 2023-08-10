package Entities;

public final class Hotel5estrellas extends Hotel4estrellas {

    private Integer salones;
    private Integer suites;
    private Integer limosinas;

    public Hotel5estrellas() {
    }

    public Hotel5estrellas(Integer salones, Integer suites, Integer limosinas, char gym, String nombreResto, Integer cantResto, Integer habitaciones, Integer camas, Integer pisos, Double precio, String nombre, String direccion, String localidad, String nombreGerente) {
        super(gym, nombreResto, cantResto, habitaciones, camas, pisos, precio, nombre, direccion, localidad, nombreGerente);
        this.salones = salones;
        this.suites = suites;
        this.limosinas = limosinas;
    }

    public Integer getSalones() {
        return salones;
    }

    public void setSalones(Integer salones) {
        this.salones = salones;
    }

    public Integer getSuites() {
        return suites;
    }

    public void setSuites(Integer suites) {
        this.suites = suites;
    }

    public Integer getLimosinas() {
        return limosinas;
    }

    public void setLimosinas(Integer limosinas) {
        this.limosinas = limosinas;
    }

    @Override
    public Double precioHabitacion() {
        return super.precioHabitacion() + (double) (limosinas * 15);
    }

    @Override
    public String toString() {
        return super.toString() + ", salones=" + salones + ", suites=" + suites + ", limosinas=" + limosinas;
    }

}
