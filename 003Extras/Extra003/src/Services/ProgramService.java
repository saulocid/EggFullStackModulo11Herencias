package Services;

import Entities.Alojamiento;
import Entities.Camping;
import Entities.Hotel;
import Entities.Hotel4estrellas;
import Entities.Hotel5estrellas;
import Entities.Residencia;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Comparator;
import java.util.Scanner;

public class ProgramService {

    public final Random ran = new Random();
    public final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    //Atributos de Alojamiento
    public final ArrayList<String> gerentes = new ArrayList<>(Arrays.asList(
            "Santiago García", "Valentina Martínez", "Matías Rodríguez", "Isabella López", "Sebastián Hernández",
            "Sofía Pérez", "Benjamín González", "Camila Ramírez", "Martín Fernández", "Valeria Torres",
            "Lucas Gómez", "Renata Díaz", "Mateo Vargas", "Florencia Morales", "Daniel Castro",
            "Regina Ortega", "Alejandro Silva", "Amanda Mendoza", "Emiliano Aguilar", "Emma Romero",
            "Samuel Navarro", "Nicole Pacheco", "Diego Méndez", "Lucía Medina", "David Velázquez",
            "Mía Jiménez", "Joaquín Ruiz", "Victoria Ramírez", "Adrián Santos", "Catalina Soto",
            "Nicolás Chávez", "Martina Herrera", "Gabriel Peralta", "Antonella Rivas", "Leo Molina",
            "Zoe Delgado", "Andrés Ochoa", "Paulina Núñez", "Felipe Peña", "Diana Cordero",
            "Raúl Cabrera", "Angela Mercado", "Hugo Paredes", "Laura Franco", "Pablo Valencia",
            "Juana Navarro", "Luis Morales", "Valentina Vargas", "Juan Guzmán", "José Villanueva"));

    public String asignarGerente() {
        return gerentes.get(ran.nextInt(50));
    }

    public final ArrayList<String> nombreAlojamiento = new ArrayList<>(Arrays.asList(
            "Hotel Playa Azul", "Hostal Estrella", "Casa del Sol", "Resort Paraíso", "Alojamiento Los Pinos",
            "Posada Luna", "Apartamentos Mar", "Cabañas Montaña", "Mansion del Lago", "Hacienda Vista",
            "Villa Jardín", "Hostería del Bosque", "Hotel Oasis", "Posada del Mar", "Alojamiento Tranquilidad",
            "Casa Rural Amanecer", "Resort Brisas", "Hostal Sombra", "Cabañas del Río", "Hotel Montaña Mágica",
            "Hospedaje Aurora", "Villa del Cielo", "Mansion del Mar", "Casa Campestre Sueños", "Posada Aventura",
            "Hostería Encanto", "Hotel Aurora", "Cabañas del Bosque", "Resort Encanto Tropical", "Alojamiento Vista",
            "Casa de Ensueño", "Posada del Lago", "Hostal Alegria", "Villa del Mar", "Hospedaje Montaña",
            "Hotel Jardín Sereno", "Casa Rústica Sol", "Resort Natura", "Hostería Playa Serena", "Mansion Oasis",
            "Cabañas Río Azul", "Alojamiento Campestre", "Hotel Puesta del Sol", "Villa de la Montaña",
            "Posada Río Tranquilo", "Casa del Lago", "Resort Viento Marino", "Hospedaje Bosque Encantado",
            "Hostal Estrella de Mar", "Cabañas del Cielo"));

    public String asignarNombreAlojamiento() {
        return nombreAlojamiento.get(ran.nextInt(50));
    }

    public final ArrayList<String> direcciones = new ArrayList<>(Arrays.asList(
            "Av. Playa Azul 123", "Calle Estrella 456", "Calle del Sol 789", "Calle Paraíso 101",
            "Av. Los Pinos 234", "Calle Luna 567", "Av. Mar 890", "Calle Montaña 111", "Calle Vista 222",
            "Av. Jardín 333", "Calle del Bosque 444", "Av. Oasis 555", "Calle del Mar 666", "Av. Tranquilidad 777",
            "Calle Amanecer 888", "Av. Brisas 999", "Calle Sombra 123", "Calle del Río 456", "Av. Montaña Mágica 789",
            "Av. Aurora 101", "Calle Cielo 234", "Av. del Lago 567", "Calle Sueños 890", "Av. Aventura 111",
            "Calle Encanto 222", "Av. del Bosque 333", "Calle Encanto Tropical 444", "Av. Vista 555",
            "Calle de Ensueño 666", "Calle del Lago 777", "Av. Alegria 888", "Calle del Mar 999", "Av. Montaña 123",
            "Av. Jardín Sereno 456", "Calle Rústica Sol 789", "Calle Natura 101", "Av. Playa Serena 234",
            "Calle Oasis 567", "Av. Río Azul 890", "Calle Campestre 111", "Av. Puesta del Sol 222",
            "Av. de la Montaña 333", "Calle Río Tranquilo 444", "Calle del Lago 555", "Av. Viento Marino 666",
            "Calle Bosque Encantado 777", "Calle Estrella de Mar 888", "Av. del Cielo 999", "Av Libertador 1954",
            "Calle Larga km 175"
    ));

    public String asignarDirecciones() {
        return direcciones.get(ran.nextInt(50));
    }

    public final ArrayList<String> localidades = new ArrayList<>(Arrays.asList(
            "Ciudad Capital", "Playa del Sol", "Montaña Verde", "Pueblo Tranquilo",
            "Ciudad de las Flores", "Pueblo Alegre", "Costa Hermosa", "Valle Sereno",
            "Pueblo de Ensueño", "Montaña Mágica", "Playa Dorada", "Ciudad del Río",
            "Pueblo Encantado", "Costa Brillante", "Valle del Arco Iris", "Playa Serena",
            "Montaña Dorada", "Pueblo del Lago", "Costa Serena", "Ciudad Jardín",
            "Pueblo de la Luna", "Valle del Sol", "Playa Encantada", "Montaña Serena",
            "Pueblo del Bosque", "Ciudad Maravilla", "Costa Alegre", "Valle Azul",
            "Pueblo del Cielo", "Montaña Brillante", "Playa Amanecer", "Ciudad del Paraíso",
            "Pueblo del Río", "Costa de Ensueño", "Valle Tranquilo", "Playa del Ensueño",
            "Montaña del Mar", "Pueblo del Viento", "Ciudad de los Sueños", "Costa del Sol",
            "Valle Encantado", "Playa Maravillosa", "Montaña de la Luna", "Pueblo Marino",
            "Ciudad Tropical", "Costa del Paraíso", "Valle de los Sueños", "Playa del Cielo",
            "Valle Grande", "Los Reyunos"
    ));

    public String asignarLocalidades() {
        return localidades.get(ran.nextInt(50));
    }

    //Atributos restantes
    public final ArrayList<String> nombreResto = new ArrayList<>(Arrays.asList(
            "Ciudad Capital", "Playa del Sol", "Montaña Verde", "Pueblo Tranquilo",
            "Ciudad de las Flores", "Pueblo Alegre", "Costa Hermosa", "Valle Sereno",
            "Pueblo de Ensueño", "Montaña Mágica", "Playa Dorada", "Ciudad del Río",
            "Pueblo Encantado", "Costa Brillante", "Valle del Arco Iris", "Playa Serena",
            "Montaña Dorada", "Pueblo del Lago", "Costa Serena", "Ciudad Jardín",
            "Pueblo de la Luna", "Valle del Sol", "Playa Encantada", "Montaña Serena",
            "Pueblo del Bosque", "Ciudad Maravilla", "Costa Alegre", "Valle Azul",
            "Pueblo del Cielo", "Montaña Brillante", "Playa Amanecer", "Ciudad del Paraíso",
            "Pueblo del Río", "Costa de Ensueño", "Valle Tranquilo", "Playa del Ensueño",
            "Montaña del Mar", "Pueblo del Viento", "Ciudad de los Sueños", "Costa del Sol",
            "Valle Encantado", "Playa Maravillosa", "Montaña de la Luna", "Pueblo Marino",
            "Ciudad Tropical", "Costa del Paraíso", "Valle de los Sueños", "Playa del Cielo",
            "La Massa al plato", "La Máquina"
    ));

    public String asignarNombreResto() {
        return nombreResto.get(ran.nextInt(50));
    }

    public char asignarGym() {
        Integer opc = ran.nextInt(2);
        if (opc == 0) {
            return 'A';
        } else {
            return 'B';
        }
    }

    public Boolean logico() {
        Integer opc = ran.nextInt(2);
        if (opc == 0) {
            return true;
        } else {
            return false;
        }
    }

    //OPCIONES PARA EL MENÚ
    //1. Mostrar todos los alojamientos
    public void mostrarAlojamientos(ArrayList<Alojamiento> al) {
        System.out.println("Los Alojamientos son");
        for (Alojamiento a : al) {
            if (a instanceof Hotel5estrellas) {
                System.out.println("--- HOTEL 5 ESTRELLAS ---");
                System.out.println(al.toString());
                continue;
            }
            if (a instanceof Hotel4estrellas) {
                System.out.println("--- HOTEL 4 ESTRELLAS ---");
                System.out.println(al.toString());
                continue;
            }
            if (a instanceof Residencia) {
                System.out.println("--- RESIDENCIA ---");
                System.out.println(al.toString());
                continue;
            }
            if (a instanceof Camping) {
                System.out.println("--- CAMPING ---");
                System.out.println(al.toString());
            }
        }
    }

    //Mostrar todos los hoteles desde el más caro al más barato
    public void mostrarHoteles(ArrayList<Alojamiento> al) {
        ArrayList<Hotel> hoteles = new ArrayList();
        for (Alojamiento a : al) {
            if (a instanceof Hotel5estrellas) {
                hoteles.add((Hotel) a);
                continue;
            }
            if (a instanceof Hotel4estrellas) {
                hoteles.add((Hotel) a);
            }
        }
        //Creamos el comparador de precios
        Comparator<Hotel> comparadorPorPrecio = (hotel1, hotel2) -> Double.compare(hotel2.getPrecio(), hotel1.getPrecio());
        Collections.sort(hoteles, comparadorPorPrecio);
        System.out.println("Los hoteles son");
        for (Hotel hotel : hoteles) {
            System.out.println(hotel.toString());
        }
    }

    //3. Mostrar campings con restaurante
    public void mostrarCamping(ArrayList<Alojamiento> al) {
        ArrayList<Camping> campings = new ArrayList();
        for (Alojamiento a : al) {
            if (a instanceof Camping) {
                if (((Camping) a).getResto() == true) {
                    campings.add((Camping) a);
                }
            }
        }
        if (campings.isEmpty()) {
            System.out.println("No hay campings con restaurantes");
        } else {
            System.out.println("Los campings con restaurante son");
            for (Camping camping : campings) {
                System.out.println(camping.toString());
            }
        }
    }

    //4. Mostrar Residencias con descuento
    public void mostrarResidencia(ArrayList<Alojamiento> al) {
        ArrayList<Residencia> residencias = new ArrayList();
        for (Alojamiento a : al) {
            if (a instanceof Residencia) {
                if (((Residencia) a).getDescuento() == true) {
                    residencias.add((Residencia) a);
                }
            }
        }
        if (residencias.isEmpty()) {
            System.out.println("No hay residencias con descuentos para gremios");
        } else {
            System.out.println("Los campings con descuentos para gremios son");
            for (Residencia residencia : residencias) {
                System.out.println(residencia.toString());
            }
        }
    }

    //MENU
    public void menu(ArrayList<Alojamiento> al) {
        do {
            System.out.println("-------------------------------");
            System.out.println("Ingrese una opción para operar");
            System.out.println("1. Mostrar todos los alojamientos");
            System.out.println("2. Mostrar los hoteles de más caros a más baratos");
            System.out.println("3. Mostrar los campings con restaurante");
            System.out.println("4. Mostrar las residencias con descuento para gremios");
            System.out.println("5. Salir");
            System.out.print("Ingrese opción: ");
            Integer opc;
            do {
                opc = leer.nextInt();
                if (opc < 1 || opc > 5) {
                    System.out.print("ERROR, ingrese de 1 a 4: ");
                }
            } while (opc < 1 || opc > 5);

            switch (opc) {
                case 1:
                    mostrarAlojamientos(al);
                    break;
                case 2:
                    mostrarHoteles(al);
                    break;
                case 3:
                    mostrarCamping(al);
                    break;
                case 4:
                    mostrarResidencia(al);
                    break;
                default:
                    System.out.println("GRACIAS POR NAVEGAR EN NUESTRA APP");
                    System.out.println("Que tenga buen día");
                    System.exit(0);
            }
        } while (true);
    }

}
