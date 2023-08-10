package Entities;

public class Televisor extends Electrodomestico {

    private Integer pulgadas;
    private boolean SintTDT;

    public Televisor() {
    }

    public Televisor(Integer pulgadas, boolean SintTDT, Double precio, String color, char consumoEnergetico, Double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.pulgadas = pulgadas;
        this.SintTDT = SintTDT;
    }

    public Integer getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(Integer pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isSintTDT() {
        return SintTDT;
    }

    public void setSintTDT(boolean SintTDT) {
        this.SintTDT = SintTDT;
    }

    public void crearTelevisor(Televisor tv) {
        System.out.println("--------TELEVISOR--------");
        Electrodomestico e = super.crearElectrodomestico();
        System.out.print("Ingrese la cantidad de pulgadas, minimo 14\": ");
        do {
            pulgadas = leer.nextInt();
            if (pulgadas < 14) {
                System.err.println("ERROR!");
                System.out.print("Mínimo 14\": ");
            }
        } while (pulgadas < 14);

        System.out.print("Tiene sintetizador TDT? Ingrese S o N: ");
        String opc;
        do {
            opc = leer.next().toUpperCase();
            if (!opc.equals("S") && !opc.equals("N")) {
                System.out.println("ERROR! Ingrese S o N");
            }
        } while (!opc.equals("S") && !opc.equals("N"));
        if (opc.equals("S")) {
            SintTDT = true;
        } else {
            SintTDT = false;
        }

        e.setPrecio(precioFinal());

        tv.setColor(e.getColor());
        tv.setConsumoEnergetico(e.getConsumoEnergetico());
        tv.setPeso(e.getPeso());
        tv.setPrecio(e.getPrecio());
        tv.setPulgadas(pulgadas);
        tv.setSintTDT(SintTDT);
    }

    @Override
    public Double precioFinal() {
        Double p = super.getPrecio();
        if (SintTDT == true) {
            p += 500;
        }
        if (pulgadas > 40) {
            p *= 1.3;
        }
        return p;
    }
}
