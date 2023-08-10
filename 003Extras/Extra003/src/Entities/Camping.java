package Entities;

public final class Camping extends AlojamientoExtrahotelero {

    private Integer carpas;
    private Integer toilets;
    private Boolean resto;

    public Camping() {
    }

    public Camping(Integer carpas, Integer toilets, Boolean resto, Boolean privado, Double m2, String nombre, String direccion, String localidad, String nombreGerente) {
        super(privado, m2, nombre, direccion, localidad, nombreGerente);
        this.carpas = carpas;
        this.toilets = toilets;
        this.resto = resto;
    }

    public Integer getCarpas() {
        return carpas;
    }

    public void setCarpas(Integer carpas) {
        this.carpas = carpas;
    }

    public Integer getToilets() {
        return toilets;
    }

    public void setToilets(Integer toilets) {
        this.toilets = toilets;
    }

    public Boolean getResto() {
        return resto;
    }

    public void setResto(Boolean resto) {
        this.resto = resto;
    }

    @Override
    public String toString() {
        return super.toString() + ", carpas=" + carpas + ", toilets=" + toilets + ", resto=" + resto;
    }

}
