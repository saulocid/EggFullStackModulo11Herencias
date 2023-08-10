package Services;

import Entities.Employee;
import Entities.Person;
import Entities.ServiceStaff;
import Entities.Student;
import Entities.Teacher;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class ProgramService {

    public final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public final AttributeLists attrib = new AttributeLists();

    public void mostrarPersonas(ArrayList<Person> personas) {
        for (Person persona : personas) {
            if (persona instanceof Student) {
                System.out.println("------ ESTUDIANTE ------");
                System.out.println(persona.toString());
                continue;
            }
            if (persona instanceof Teacher) {
                System.out.println("------ PROFESOR ------");
                System.out.println(persona.toString());
                continue;
            }
            if (persona instanceof ServiceStaff) {
                System.out.println("------ EMPLEADO ------");
                System.out.println(persona.toString());
            }
        }
    }

    public void mostrarCuils(ArrayList<Person> personas) {
        System.out.println("-------------------------------------------");
        System.out.println("Los CUILs de las personas existentes son:");
        for (Person persona : personas) {
            System.out.println(persona.getCuil());
        }
    }

    public void cambiarEcivil(ArrayList<Person> personas, Long cuil) {
        Integer num = 0;
        System.out.println("----------------------------------------------");
        System.out.println("Lista de opciones");
        for (String ec : attrib.eCiviles) {
            num++;
            System.out.println(num + ". " + ec);
        }
        System.out.print("Ingrese el nuevo estado civil (1/4): ");
        Integer opc;
        do {
            opc = leer.nextInt();
            if (opc < 1 || opc > 4) {
                System.out.print("Error! elija del 1 al 4: ");
            }
        } while (opc < 1 || opc > 4);
        for (Person persona : personas) {
            if (Objects.equals(persona.getCuil(), cuil)) {
                persona.seteCivil(attrib.eCiviles.get(opc - 1));
                System.out.println("Cambio de estado Civil correcto a " + persona.geteCivil());
                break;
            }
        }
    }

    public void reasignarDespacho(ArrayList<Person> personas, Long cuil) {
        boolean nohay = false;
        for (Person persona : personas) {
            if (persona instanceof Employee && Objects.equals(cuil, persona.getCuil())) {
                System.out.print("Elija nuevo despacho (1/20): ");
                Integer opc;
                do {
                    opc = leer.nextInt();
                    if (opc < 1 || opc > 20) {
                        System.out.print("ERROR! Elija del 1 a 20: ");
                    }
                } while (opc < 1 || opc > 20);
                ((Employee) persona).setDespacho(opc);
                nohay = true;
            }
        }
        if (nohay == false) {
            System.out.println("No corresponde el cambio de despacho a ésta persona");
        }

    }

    public void cambiarMatricula(ArrayList<Person> personas, Long cuil) {
        boolean nohay = false;
        for (Person persona : personas) {
            if (persona instanceof Student && Objects.equals(cuil, persona.getCuil())) {
                System.out.print("Elija la nueva matrícula para: ");
                Integer cont = 0;
                for (String matricula : attrib.matriculas) {
                    cont++;
                    System.out.println(cont + ". " + matricula);
                }
                Integer opc;
                do {
                    opc = leer.nextInt();
                    if (opc < 1 || opc > 12) {
                        System.out.print("ERROR! Elija del 1 a 12: ");
                    }
                } while (opc < 1 || opc > 12);
                nohay = true;
                ((Student) persona).setCurso(attrib.matriculas.get(opc - 1));
            }
        }
        if (nohay == false) {
            System.out.println("No corresponde el cambio de matrícula a ésta persona");
        }
    }

    public void cambioDepartamento(ArrayList<Person> personas, Long cuil) {
        boolean nohay = false;
        for (Person persona : personas) {
            if (persona instanceof Teacher && Objects.equals(cuil, persona.getCuil())) {
                System.out.print("Elija el nuevo departamento para: ");
                Integer cont = 0;
                for (String dep : attrib.departamentos) {
                    cont++;
                    System.out.println(cont + ". " + dep);
                }
                Integer opc;
                do {
                    opc = leer.nextInt();
                    if (opc < 1 || opc > 20) {
                        System.out.print("ERROR! Elija del 1 a 20: ");
                    }
                } while (opc < 1 || opc > 20);
                nohay = true;
                ((Teacher) persona).setDepartamento(attrib.departamentos.get(opc - 1));
            }
        }
        if (nohay == false) {
            System.out.println("No corresponde el cambio de departamento a ésta persona");
        }
    }

    public void traslado(ArrayList<Person> personas, Long cuil) {
        boolean nohay = false;
        for (Person persona : personas) {
            if (persona instanceof ServiceStaff && Objects.equals(cuil, persona.getCuil())) {
                System.out.print("Elija el nueoa departamento para: ");
                Integer cont = 0;
                for (String dep : attrib.departamentos) {
                    cont++;
                    System.out.println(cont + ". " + dep);
                }
                Integer opc;
                do {
                    opc = leer.nextInt();
                    if (opc < 1 || opc > 19) {
                        System.out.print("ERROR! Elija del 1 a 20: ");
                    }
                } while (opc < 1 || opc > 19);
                nohay = true;
                ((ServiceStaff) persona).setSeccion(attrib.secciones.get(opc - 1));
            }
        }
        if (nohay == false) {
            System.out.println("No corresponde el traslado de sección a ésta persona");
        }
    }

    public void test(ArrayList<Person> personas) {
        do {
            //mostramos los CUILs existentes
            mostrarCuils(personas);
            System.out.println("Ingrese un CUIL existente para generar el test");
            Long cuil;
            boolean validar, salir;
            String nombreAux = "", personaAux = "";
            //validamos que ingrese un cuil existente
            do {
                validar = false;
                cuil = leer.nextLong();
                for (Person persona : personas) {
                    if (Objects.equals(cuil, persona.getCuil())) {
                        validar = true;
                        nombreAux = persona.getNombre() + " " + persona.getApellido();
                        if (persona instanceof Student) {
                            personaAux = "Estudiante";
                            continue;
                        }
                        if (persona instanceof Teacher) {
                            personaAux = "Profesor";
                            continue;
                        }
                        if (persona instanceof ServiceStaff) {
                            personaAux = "Empleado";
                        }
                    }
                }
                if (validar == false) {
                    System.err.print("No se encontró coincidencia,\n"
                            + "Vuelva a ingresar: ");
                }
            } while (validar == false);
            //creamos el menu para que elija una opcion y validamos la misma
            Integer opc;
            System.out.println("----------------------------------------");
            System.out.println("Trabajaremos con " + nombreAux + ", " + personaAux);
            do {
                salir = false;
                System.out.println("----------------------------------------");
                System.out.println("Ingrese una opción para");
                System.out.println("1. Cambiar estado civil");
                System.out.println("2. Reasignación de despacho para empleados");
                System.out.println("3. Matriculación para alumnos en nuevo curso");
                System.out.println("4. Cambio de departamento para profesor");
                System.out.println("5. Traslado de sección a staff de servicio");
                System.out.println("6. Mostrar información de la persona");
                System.out.println("7. Salir del menú");
                do {
                    opc = leer.nextInt();
                    if (opc < 1 || opc > 7) {
                        System.out.print("ERROR! Elija del 1 al 7: ");
                    }
                } while (opc < 1 || opc > 7);
                switch (opc) {
                    case 1:
                        cambiarEcivil(personas, cuil);
                        break;
                    case 2:
                        reasignarDespacho(personas, cuil);
                        break;
                    case 3:
                        cambiarMatricula(personas, cuil);
                        break;
                    case 4:
                        cambioDepartamento(personas, cuil);
                        break;
                    case 5:
                        traslado(personas, cuil);
                        break;
                    case 6:
                        mostrarPersonas(personas);
                        break;
                    default:
                        salir = true;
                }
            } while (salir == false);
            System.out.print("Quiere probar otro test? N para salir, otro para continuar: ");
            String continuar = leer.next().toUpperCase();
            if (continuar.equals("N")) {
                System.out.println("Programa finalizado, tenga buen día");
                System.exit(0);
            }
        } while (true);
    }
}
