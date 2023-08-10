package Services;

import Entities.EdificioDeOficina;
import java.util.Random;
import java.util.Scanner;

public class EdificioService {

    public final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public final Random ran = new Random();

    public EdificioDeOficina crearEDO() {
        
        System.out.print("Ingrese la cantidad de oficinas: ");
        Integer of;
        do {
            of = leer.nextInt();
            if (of < 1) {
                System.err.println("VALOR ERRÓNEO!");
                System.out.print("Ingrese un valor positivo: ");
            }
        } while (of < 1);
        
        System.out.print("Ingrese la cantidad de personas que entran en cada oficina: ");
        Integer pe;
        do {
            pe = leer.nextInt();
            if (pe < 1) {
                System.err.println("VALOR ERRÓNEO!");
                System.out.print("Ingrese un valor positivo: ");
            }
        } while (pe < 1);
        
        System.out.print("Ingrese la cantidad de pisos: ");
        Integer pi;
        do {
            pi = leer.nextInt();
            if (pi < 1) {
                System.err.println("VALOR ERRÓNEO!");
                System.out.print("Ingrese un valor positivo: ");
            }
        } while (pi < 1);
        
        return new EdificioDeOficina(of, pe, pi,(double)ran.nextInt(60) ,(double)ran.nextInt(50) ,(double)ran.nextInt(100));

    }
        
}
