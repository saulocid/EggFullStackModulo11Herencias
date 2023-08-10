package Entities;

//precio, color, consumo energético (letras entre A y F) y peso
import java.util.Scanner;

public class Electrodomestico{

    public final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    protected Double precio;
    protected String color;
    protected char consumoEnergetico;
    protected Double peso;

    public Electrodomestico() {
    }

    public Electrodomestico(Double precio, String color, char consumoEnergetico, Double peso) {
        this.precio = 1000 + precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = 1000 + precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public char comprobarConsumoEnergetico(char letra) {
        if (letra < 'A' || letra > 'E') {
            letra = 'F';
        }
        return letra;
    }

    public String comprobarColor(String color) {
        //blanco, negro, rojo, azul y gris
        if (!color.equals("negro") && !color.equals("rojo") && !color.equals("azul") && !color.equals("gris")) {
            color = "blanco";
        }
        return color;
    }

    public Electrodomestico crearElectrodomestico() {

        //creo mi electrodomestico auxiliar
        Electrodomestico e = new Electrodomestico();

        //ingreso el precio validado
        System.out.print("Ingrese el precio: ");
        do {
            precio = leer.nextDouble();
            if (precio < 0) {
                System.err.println("ERROR!");
                System.out.print("Ingrese un valor positivo: ");
            }
        } while (precio < 0);
        e.setPrecio(precio);

        //ingreso el color
        System.out.print("Ingrese el color: ");
        color = comprobarColor(leer.next());
        e.setColor(color);

        //ingreso el consumo energético
        System.out.print("Ingrese la letra para consumo energético: ");
        consumoEnergetico = comprobarConsumoEnergetico(leer.next().charAt(0));
        e.setConsumoEnergetico(consumoEnergetico);

        //ingreso el peso del electrodoméstico valdiado
        System.out.print("Ingrese el peso: ");
        do {
            peso = leer.nextDouble();
            if (peso < 0) {
                System.err.println("ERROR!");
                System.out.print("Ingrese un valor positivo: ");
            }
        } while (peso < 0);
        e.setPeso(peso);

        return e;
    }

    public Double precioFinal() {
        switch (consumoEnergetico) {
            case 'A':
                precio += 1000;
                break;
            case 'B':
                precio += 800;
                break;
            case 'C':
                precio += 600;
                break;
            case 'D':
                precio += 500;
                break;
            case 'E':
                precio += 300;
                break;
            default:
                precio += 100;
                break;
        }

        if (peso <= 19) {
            precio += 100;
        } else if (peso <= 49) {
            precio += 500;
        } else if (peso <= 79) {
            precio += 800;
        } else {
            precio += 1000;
        }

        return precio;

    }
}
