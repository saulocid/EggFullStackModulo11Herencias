package ejercicio002;

import Entities.Electrodomestico;
import Entities.Lavadora;
import Entities.Televisor;
import java.util.ArrayList;

public class Ejercicio002 {

    public static void main(String[] args) {

        Lavadora l = new Lavadora();
        l.crearLavadora(l);
        Televisor tv = new Televisor();
        tv.crearTelevisor(tv);

        ArrayList<Electrodomestico> ele = new ArrayList();
        ele.add(l);
        ele.add(tv);

        System.out.println("--------PRECIOS FINALES--------");
        for (Electrodomestico elec : ele) {
            if (elec instanceof Lavadora) {
                System.out.println("El precio final de la lavadora es $" + elec.getPrecio());
                continue;
            }
            if (elec instanceof Televisor) {
                System.out.println("El precio final del televisor es $" + elec.getPrecio());
            }
        }

    }

}
