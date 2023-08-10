package Entities;

public class EdificioDeOficina extends Edificio{

    private Integer oficinas;
    private Integer personas;
    private Integer pisos;

    public EdificioDeOficina() {
    }

    public EdificioDeOficina(Integer oficinas, Integer personas, Integer pisos) {
        this.oficinas = oficinas;
        this.personas = personas;
        this.pisos = pisos;
    }

    public EdificioDeOficina(Integer oficinas, Integer personas, Integer pisos, Double ancho, Double alto, Double largo) {
        super(ancho, alto, largo);
        this.oficinas = oficinas;
        this.personas = personas;
        this.pisos = pisos;
    }

    public Integer getOficinas() {
        return oficinas;
    }

    public void setOficinas(Integer oficinas) {
        this.oficinas = oficinas;
    }

    public Integer getPersonas() {
        return personas;
    }

    public void setPersonas(Integer personas) {
        this.personas = personas;
    }

    public Integer getPisos() {
        return pisos;
    }

    public void setPisos(Integer pisos) {
        this.pisos = pisos;
    }

    @Override
    Double calcularVolumen() {
        return super.calcularVolumen();
    }

    @Override
    Double calcularSuperficie() {
        return super.calcularSuperficie();
    }
    
    public void cantPersonas(Integer c){
        System.out.println("Edificio "+c);
        System.out.println("La cantidad de personas de un piso es: "+(personas*oficinas));
        System.out.println("En el edificio entran "+(personas*oficinas*pisos)+" personas");
    }
    
}
