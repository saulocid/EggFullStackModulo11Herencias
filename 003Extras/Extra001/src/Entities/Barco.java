
package Entities;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Barco<T> implements Interfaces.Interface{

    protected Long matricula;
    protected Double eslora;
    protected Date fabricacion;

    public Barco() {
    }

    public Barco(Long matricula, Double eslora, Date fabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.fabricacion = fabricacion;
    }

    public Long getMatricula() {
        return matricula;
    }

    public void setMatricula(Long matricula) {
        this.matricula = matricula;
    }

    public Double getEslora() {
        return eslora;
    }

    public void setEslora(Double eslora) {
        this.eslora = eslora;
    }

    public Date getFabricacion() {
        return fabricacion;
    }

    public void setFabricacion(Date fabricacion) {
        this.fabricacion = fabricacion;
    }

    @Override
    public Double calcularAlquiler(Date dev, Date alq) {
        Long aux = dev.getTime() - alq.getTime();
        Integer dif = (int)TimeUnit.DAYS.convert(aux, TimeUnit.MILLISECONDS);
        return (double)10*eslora*dif;
    }
    
}
