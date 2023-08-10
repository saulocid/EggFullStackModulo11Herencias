package Entities;

public class Hotel4estrellas extends Hotel{

    protected char gym;
    protected String nombreResto;
    protected Integer cantResto;

    public Hotel4estrellas() {
    }

    public Hotel4estrellas(char gym, String nombreResto, Integer cantResto, Integer habitaciones, Integer camas, Integer pisos, Double precio, String nombre, String direccion, String localidad, String nombreGerente) {
        super(habitaciones, camas, pisos, precio, nombre, direccion, localidad, nombreGerente);
        this.gym = gym;
        this.nombreResto = nombreResto;
        this.cantResto = cantResto;
    }

    public char getGym() {
        return gym;
    }

    public void setGym(char gym) {
        this.gym = gym;
    }

    public String getNombreResto() {
        return nombreResto;
    }

    public void setNombreResto(String nombreResto) {
        this.nombreResto = nombreResto;
    }

    public Integer getCantResto() {
        return cantResto;
    }

    public void setCantResto(Integer cantResto) {
        this.cantResto = cantResto;
    }
    
    @Override
    public Double precioHabitacion(){
        Double auxGym;
        if (gym=='A'){
            auxGym=50d;
        }else{
            auxGym=30d;
        }
        Double auxResto;
        if(cantResto<30){
            auxResto=10d;
        } else if(cantResto<=50){
            auxResto=30d;
        }else{
            auxResto=50d;
        }
        return super.precioHabitacion()+auxGym+auxResto;
    }

    @Override
    public String toString() {
        return super.toString() + ", gym=" + gym + ", nombreResto=" + nombreResto + ", cantResto=" + cantResto;
    }
    
    
    
}
