package ejercicio004;

import Formas.Circulo;
import Formas.Rectangulo;

public class Ejercicio004 {

    public static void main(String[] args) {

        System.out.println("-----CÍRCULO-----");
        Circulo ci1 = new Circulo(7.5d);
        System.out.println("El perímetro es " + ci1.calcularPerimetro() + " cm");
        System.out.println("El área es " + ci1.calcularArea() + " cm");

        System.out.println("-----RECTÁNGULO-----");
        Rectangulo r1 = new Rectangulo(5.2d, 8.3d);
        System.out.println("El perímetro es " + r1.calcularPerimetro() + " cm");
        System.out.println("El área es " + r1.calcularArea() + " cm");

        System.out.println("-----CUADRADO-----");
        Rectangulo cu1 = new Rectangulo(4.5d, 4.5d);
        System.out.println("El perímetro es " + cu1.calcularPerimetro() + " cm");
        System.out.println("El área es " + cu1.calcularArea() + " cm");

    }

}
