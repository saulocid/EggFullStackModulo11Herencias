package extra001;

import Entities.Alquiler;
import Entities.Barco;
import Entities.BarcoMotor;
import Entities.Velero;
import Entities.Yate;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Extra001 {

    public static void main(String[] args) throws ParseException {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("------DATOS PERSONALES------");
        System.out.println("");

        //Datos personales
        System.out.print("Ingrese su nombre: ");
        String nombre = leer.next();
        System.out.print("Ingrese su DNI: ");     
        Long dni;
        do{
            dni = leer.nextLong();
            if(dni<10000000 || dni>60000000){
                System.err.println("DNI fuera de rango");
                System.out.print("Ingrese DNI: ");
            }
        }while(dni<10000000 || dni>60000000);
        System.out.println("------ALQUILER DE BARCOS------");

        System.out.println("Elija el barco que desee alquilar\n"
                + "1. Velero\n"
                + "2. Barco a motor\n"
                + "3. Yate de lujo");
        System.out.print("Ingrese opción: ");
        Integer opc;
        do {
            opc = leer.nextInt();
            if (opc < 1 || opc > 3) {
                System.err.println("ERROR!");
                System.out.print("Elija valores del 1 al 3: ");
            }
        } while (opc < 1 || opc > 3);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String fecha;
        Barco b;
        switch (opc) {
            case 1:
                fecha = "10/01/2000";
                Velero vel = new Velero(3, 95175346L, 2.4d, sdf.parse(fecha));
                b = vel;
                break;
            case 2:
                fecha = "15/05/2010";
                BarcoMotor bm = new BarcoMotor(19, 85742631L, 20d, sdf.parse(fecha));
                b = bm;
                break;
            default:
                fecha = "01/01/2023";
                Yate y = new Yate(20, 35, 15489632L, 28d, sdf.parse(fecha));
                b = y;
        }

        System.out.println("En qué amarre quiere ubicar el barco?");
        System.out.print("Elija de 1 a 20: ");
        Integer am;
        do{
            am = leer.nextInt();
            if(am<1 || am>20){
                System.err.println("FUERA DE RANGO");
                System.out.print("Elija de 1 a 20: ");
            }
        }while(am<1 || am>20);
        Alquiler al = new Alquiler(nombre,dni,sdf.parse("15/06/2023"),sdf.parse("04/08/2023"),am,b);
//      Alquiler al = new Alquiler("Saulo", 33331260L, sdf.parse("15/06/2023"), sdf.parse("04/08/2023"), 5, b);
        
        System.out.println("Precio final alquiler $"+b.calcularAlquiler(al.getDevolucion(), al.getAlquiler()));

    }

}
