package guia001;

import Entities.Animal;
import Entities.Gato;
import Entities.Perro;
import java.util.ArrayList;

public class Guia001 {

    public static void main(String[] args) {
        
        ArrayList<Animal> entidad = new ArrayList();
        
        Animal a = new Animal();
        Animal p = new Perro();
        Animal g = new Gato();
        
        entidad.add(a);
        entidad.add(p);
        entidad.add(g);
        
        for (Animal animal : entidad) {
            System.out.println(animal.hacerRuido());
        }
        
    }
    
}
