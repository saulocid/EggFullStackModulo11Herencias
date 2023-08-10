package ejercicio001;

//nombre, alimento, edad, razaAnimal
import Entities.Animal;
import Entities.Caballo;
import Entities.Gato;
import Entities.Perro;
import java.util.ArrayList;

public class Ejercicio001 {

    public static void main(String[] args) {

        Animal perro1 = new Perro("Juancho", "Raza adultos", 5, "Coolie");
        Animal perro2 = new Perro("Scooby", "Sabrosito adultos", 15, "Grandanés");
        Animal gato1 = new Gato("Colitas", "ratones", 7, "Siamés");
        Animal caballo1 = new Caballo("Relámpago", "heno", 2, "Mustang");

        perro1.Alimentarse();
        perro2.Alimentarse();
        gato1.Alimentarse();
        caballo1.Alimentarse();

        System.out.println("----------------------------------");
        
        ArrayList<Animal> animales = new ArrayList();
        
        animales.add(perro1);
        animales.add(perro2);
        animales.add(gato1);
        animales.add(caballo1);
        
        for (Animal animal : animales) {
            System.out.println(animal.toString());
        }
        
    }

}
