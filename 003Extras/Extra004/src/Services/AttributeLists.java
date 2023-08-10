package Services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Random;

public class AttributeLists {

    public final Random ran = new Random();

    public final ArrayList<String> nombres = new ArrayList<>(Arrays.asList(
            "Mateo", "Valentina", "Santiago", "Isabella", "Matías", "Sofía", "Sebastián", "Camila", "Benjamín", "Mía",
            "Martín", "Valeria", "Lucas", "Lucía", "Nicolás", "Emma", "Emiliano", "Victoria", "Dylan", "Martina",
            "Thiago", "Renata", "Samuel", "María José", "Diego", "Sara", "Joaquín", "Ximena", "Daniel", "Jimena",
            "Emmanuel", "Natalia", "Alexander", "Paula", "Ángel", "Abril", "David", "Antonella", "Vicente", "María",
            "Leo", "Renata", "Adrián", "Daniela", "Fernando", "Laura", "Gael", "Florencia", "Miguel", "Regina"
    ));

    public String nombreRandom() {
        return nombres.get(ran.nextInt(50));
    }

    public final ArrayList<String> apellidos = new ArrayList<>(Arrays.asList(
            "González", "Rodríguez", "Gómez", "Fernández", "López", "Martínez", "Pérez", "García", "Sánchez", "Romero",
            "Ramírez", "Soto", "Torres", "Vargas", "Castillo", "Rojas", "Ruiz", "Vásquez", "Hernández", "Morales",
            "Ortega", "Silva", "Cruz", "Núñez", "Gutiérrez", "Mendoza", "Paredes", "Chávez", "Méndez", "Guerra",
            "Gallardo", "Ríos", "Cabrera", "Montes", "Vega", "Aguilar", "Espinoza", "Orellana", "Fuentes", "Villanueva",
            "Miranda", "Barrera", "Figueroa", "Navarro", "Luna", "Cortés", "Pinto", "Tapia", "Sandoval", "Araya"
    ));

    public String apellidoRandom() {
        return apellidos.get(ran.nextInt(50));
    }

    public Long cuilRandom() {
        Integer xx, dni, x;
        do {
            xx = ran.nextInt(30) + 1;
        } while (xx != 20 && xx != 24 && xx != 27 && xx != 30);
        do {
            dni = ran.nextInt(99999999);
        } while (dni < 10000000 || dni > 60000000);
        x = ran.nextInt(10);
        String cuil = xx + "" + dni + "" + x;
        return Long.valueOf(cuil);
    }

    public final ArrayList<String> eCiviles = new ArrayList<>(Arrays.asList(
            "casada/o", "viuda/o", "divorciada/o", "soltera/o"
    ));

    public String eCivilRandom() {
        return eCiviles.get(ran.nextInt(4));
    }

    public void ingresoRandom(Calendar ingreso) {
        ingreso.set(Calendar.DAY_OF_MONTH, ran.nextInt(31) + 1);
        ingreso.set(Calendar.MONTH, ran.nextInt(12));
        int aux;
        //Validamos hasta 35 años de trabajo, ya que luego se jubilaría
        do {
            aux = ran.nextInt(2023) + 1;
        } while (aux < 1988);
        ingreso.set(Calendar.YEAR, aux);
    }

    public Integer despachoRandom() {
        return ran.nextInt(20) + 1;
    }

    public final ArrayList<String> departamentos = new ArrayList(Arrays.asList(
            "Lenguas Modernas", "Matemáticas", "Ciencias de la Computación",
            "Historia", "Literatura", "Ciencias Sociales", "Economía",
            "Psicología", "Física", "Química", "Biología",
            "Medicina", "Derecho", "Ingeniería Eléctrica",
            "Arquitectura", "Educación", "Bellas Artes",
            "Música", "Comunicación", "Ciencias Ambientales"
    ));

    public String departamentoRandom() {
        return departamentos.get(ran.nextInt(20));
    }

    public final ArrayList<String> secciones = new ArrayList(Arrays.asList(
            "Biblioteca", "Decanato", "Secretaría", "Recursos Humanos",
            "Registro Académico", "Servicios Estudiantiles",
            "Relaciones Internacionales", "Comunicaciones",
            "Tecnologías de la Información", "Tesorería",
            "Mantenimiento", "Laboratorios", "Deporte y Recreación",
            "Cafetería", "Seguridad", "Planificación y Desarrollo",
            "Relaciones con Exalumnos", "Investigación", "Cooperación y Extensión"
    ));

    public String seccionRandom() {
        return secciones.get(ran.nextInt(19));
    }

    public final ArrayList<String> matriculas = new ArrayList(Arrays.asList(
            "Matrícula Regular", "Matrícula Adelantada", "Matrícula Tardía",
            "Matrícula en Línea", "Matrícula a Tiempo Parcial",
            "Matrícula a Tiempo Completo", "Matrícula Modular",
            "Matrícula por Crédito", "Matrícula Específica para Programas",
            "Matrícula Continua", "Matrícula Auditable", "Matrícula Condicional"
    ));

    public String matriculaRandom() {
        return matriculas.get(ran.nextInt(12));
    }

}
