package extra002;

import Entities.Edificio;
import Entities.EdificioDeOficina;
import Entities.Polideportivo;
import Services.EdificioService;
import java.util.ArrayList;
import java.util.Random;

public class Extra002 {

    public static void main(String[] args) {

        EdificioService es = new EdificioService();
        ArrayList<Edificio> edificios = new ArrayList();
        Random ran = new Random();

        Polideportivo p1 = new Polideportivo("Polideportivo N1", true, (double) ran.nextInt(60), (double) ran.nextInt(50), (double) ran.nextInt(100));
        Polideportivo p2 = new Polideportivo("Polideportivo N2", false, (double) ran.nextInt(60), (double) ran.nextInt(50), (double) ran.nextInt(100));
        System.out.println("Ingrese los datos para el primer Edificio de Oficina");
        EdificioDeOficina edo1 = es.crearEDO();
        System.out.println("---------------------------------------");
        System.out.println("Ingrese los datos para el segundo Edificio de Oficina");
        EdificioDeOficina edo2 = es.crearEDO();

        edificios.add(p1);
        edificios.add(p2);
        edificios.add(edo1);
        edificios.add(edo2);

        Integer cant = 0, techo = 0, noTecho = 0;
        for (Edificio e : edificios) {
            if (e instanceof EdificioDeOficina) {
                System.out.println("---------------------------------------");
                EdificioDeOficina aux = (EdificioDeOficina) e;
                cant++;
                aux.cantPersonas(cant);
            } else {
                Polideportivo aux = (Polideportivo) e;
                if (aux.getTechado() == true) {
                    techo++;
                } else {
                    noTecho++;
                }
            }
        }
        System.out.println("---------------------------------------");
        if (techo > 0) {
            System.out.println("La cantidad de Polideportivos cerrados son " + techo);
        }
        System.out.println("---------------------------------------");
        if (noTecho > 0) {
            System.out.println("La cantidad de Polideportivos abiertos son " + noTecho);
        }

    }

}
