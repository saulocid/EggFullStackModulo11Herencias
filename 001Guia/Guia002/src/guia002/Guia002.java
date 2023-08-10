package guia002;

import Entities.Persona;
import Services.Servicio;
import java.util.ArrayList;

public class Guia002 {

    public static void main(String[] args) {
        
        ArrayList<Persona> personas = new ArrayList<>();
        Servicio ser = new Servicio();
        Persona p1 = ser.crearPersona("Alejo", 51026426);
        Persona p2 = ser.crearPersona("Lucas", 51026425);
        Persona p3 = ser.crearPersona("María Elena", 12265688);
        Persona p4 = ser.crearPersona("Rodrigo", 34662618);
        Persona p5 = ser.crearPersona("Saulo", 33331260);
        
        personas.add(p1);
        personas.add(p2);
        personas.add(p3);
        personas.add(p4);
        personas.add(p5);
        
        for (Persona persona : personas) {
            System.out.println(persona.toString());
        }
        
    }
    
}
