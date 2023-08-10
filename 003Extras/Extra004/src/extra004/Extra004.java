package extra004;

import Entities.Person;
import Entities.ServiceStaff;
import Entities.Student;
import Entities.Teacher;
import Services.AttributeLists;
import Services.ProgramService;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

public class Extra004 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Random ran = new Random();
        ArrayList<Person> personas = new ArrayList();
        AttributeLists attrib = new AttributeLists();
        ProgramService ps = new ProgramService();

        //Creamos una x cantidad de personas
        System.out.println("Ingrese las personas a crear");
        Integer cant;
        do {
            System.out.print("Ingrese un número entero positivo: ");
            cant = leer.nextInt();
            if (cant < 1) {
                System.err.println("ERROR! Vuelva a ingresar");
            }
        } while (cant < 1);

        //Ahora vamos a instancias el tipo de persona y los asiganmos al arraylist de personas
        Integer opc;
        for (int i = 0; i < cant; i++) {
            opc = ran.nextInt(3);
            switch (opc) {
                case 0:
                    Student alumno = new Student(attrib.matriculaRandom(), attrib.nombreRandom(), attrib.apellidoRandom(), attrib.cuilRandom(), attrib.eCivilRandom());
                    personas.add(alumno);
                    break;
                case 1:
                    Calendar ingreso = Calendar.getInstance();
                    attrib.ingresoRandom(ingreso);
                    Teacher profesor = new Teacher(attrib.departamentoRandom(), ingreso, attrib.despachoRandom(), attrib.nombreRandom(), attrib.apellidoRandom(), attrib.cuilRandom(), attrib.eCivilRandom());
                    personas.add(profesor);
                    break;
                default:
                    Calendar ingreso2 = Calendar.getInstance();
                    attrib.ingresoRandom(ingreso2);
                    ServiceStaff empleado = new ServiceStaff(attrib.seccionRandom(), ingreso2, attrib.despachoRandom(), attrib.nombreRandom(), attrib.apellidoRandom(), attrib.cuilRandom(), attrib.eCivilRandom());
                    personas.add(empleado);
            }

        }

        //Iniciamos el test que está en el servicio
        ps.test(personas);

    }

}
