package extra003;

import Entities.Alojamiento;
import Entities.Camping;
import Entities.Hotel4estrellas;
import Entities.Hotel5estrellas;
import Entities.Residencia;
import Services.ProgramService;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Extra003 {

    public static void main(String[] args) {

        Random ran = new Random();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ProgramService ps = new ProgramService();

        //Creamos los alojamientos de manera aleatoria y las integramos en un ArrayList
        ArrayList<Alojamiento> alojamientos = new ArrayList();

        System.out.println("Ingrese el total de alojamientos a crear aleatoreamente");
        Integer cant;
        do {
            System.out.print("Ingrese un número entero positivo: ");
            cant = leer.nextInt();
            if (cant < 1) {
                System.err.println("ERROR! Vuelva a ingresar");
            }
        } while (cant < 1);

        Integer opc;
        for (int i = 0; i < cant; i++) {
            opc = ran.nextInt(4);
            switch (opc) {
                case 0:
                    Hotel4estrellas h1 = new Hotel4estrellas(ps.asignarGym(), ps.asignarNombreResto(), ran.nextInt(10) + 1, ran.nextInt(20) + 1, ran.nextInt(5) + 1, ran.nextInt(10) + 1, 0d, ps.asignarNombreAlojamiento(), ps.asignarDirecciones(), ps.asignarLocalidades(), ps.asignarGerente());
                    h1.setPrecio(h1.precioHabitacion());
                    alojamientos.add(h1);
                    break;
                case 1:
                    Hotel5estrellas h2 = new Hotel5estrellas(ran.nextInt(10) + 1, ran.nextInt(10) + 1, ran.nextInt(20) + 1, ps.asignarGym(), ps.asignarNombreResto(), ran.nextInt(10) + 1, ran.nextInt(20) + 1, ran.nextInt(5) + 1, ran.nextInt(10) + 1, 0d, ps.asignarNombreAlojamiento(), ps.asignarDirecciones(), ps.asignarLocalidades(), ps.asignarGerente());
                    h2.setPrecio(h2.precioHabitacion());
                    alojamientos.add(h2);
                    break;
                case 2:
                    Camping c = new Camping(ran.nextInt(50) + 1, ran.nextInt(10) + 1, ps.logico(), ps.logico(), (double) ran.nextInt(1200) + 1, ps.asignarNombreAlojamiento(), ps.asignarDirecciones(), ps.asignarLocalidades(), ps.asignarGerente());
                    alojamientos.add(c);
                    break;
                default:
                    Residencia r = new Residencia(ran.nextInt(20) + 1, ps.logico(), ps.logico(), ps.logico(), (double) ran.nextInt(1200) + 1, ps.asignarNombreAlojamiento(), ps.asignarDirecciones(), ps.asignarLocalidades(), ps.asignarGerente());
                    alojamientos.add(r);
            }

        }

        //Menú del programa
        ps.menu(alojamientos);

    }

}
