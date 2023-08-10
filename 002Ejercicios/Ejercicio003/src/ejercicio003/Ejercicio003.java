package ejercicio003;

import Entities.Electrodomestico;
import Entities.Lavadora;
import Entities.Televisor;
import java.util.ArrayList;

//LAVADORA Integer carga, Double precio, String color, char consumoEnergetico, Double peso
//TV Integer pulgadas, boolean SintTDT, Double precio, String color, char consumoEnergetico, Double peso

public class Ejercicio003 {

    public static void main(String[] args) {

        Lavadora lava1 = new Lavadora();
        lava1.crearLavadora(lava1);
        Televisor tv1 = new Televisor();
        tv1.crearTelevisor(tv1);
        Lavadora lava2 = new Lavadora();
        lava2.crearLavadora(lava2);
        Televisor tv2 = new Televisor();
        tv2.crearTelevisor(tv2);

        ArrayList<Electrodomestico> ele = new ArrayList();
        ele.add(lava1);
        ele.add(tv1);
        ele.add(lava2);
        ele.add(tv2);

        Double suma=0d;
        Double precio;
        System.out.println("--------PRECIOS FINALES--------");
        for (Electrodomestico elec : ele) {
            precio=elec.getPrecio();
            if (elec instanceof Lavadora) {
                System.out.println("El precio final de la lavadora es $" + precio);
                suma+=precio;
                continue;
            }
            if (elec instanceof Televisor) {
                System.out.println("El precio final del televisor es $" + precio);
                suma+=precio;
            }
            
        }
        
        System.out.println("La suma de todos los precios es $"+suma);

    }

}
