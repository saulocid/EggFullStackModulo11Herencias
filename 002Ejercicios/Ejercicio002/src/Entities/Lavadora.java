package Entities;

public class Lavadora extends Electrodomestico {

    private Integer carga;

    public Lavadora() {
    }

    public Lavadora(Integer carga, Double precio, String color, char consumoEnergetico, Double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public Integer getCarga() {
        return carga;
    }

    public void setCarga(Integer carga) {
        this.carga = carga;
    }

    public void crearLavadora(Lavadora lavadora) {
        System.out.println("--------CREAR LAVADORA--------");
        Electrodomestico e = super.crearElectrodomestico();
        System.out.println("Ingrese la carga que puede soportar la lavadora");
        do {
            System.out.print("Ingrese de 5 a 50: ");
            carga = leer.nextInt();
            if (carga < 5 || carga > 50) {
                System.err.println("ERROR!");
                System.out.print("Ingrese de 5 a 50: ");
            }
        } while (carga < 5 || carga > 50);
        e.setPrecio(e.getPrecio() + precioFinal());

        lavadora.setCarga(carga);
        lavadora.setColor(e.getColor());
        lavadora.setConsumoEnergetico(e.getConsumoEnergetico());
        lavadora.setPeso(e.getPeso());
        lavadora.setPrecio(e.getPrecio());
    }

    @Override
    public Double precioFinal() {
        Double p = super.getPrecio();
        if (carga > 30) {
            return p+500.0;
        } else {
            return p;
        }
    }
}
