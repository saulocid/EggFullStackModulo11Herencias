/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entities.Persona;
import Interfaces.NewInterface;

/**
 *
 * @author Rodrigo
 */
public class Servicio implements NewInterface{

    @Override
    public Persona crearPersona(String nombre, Integer dni) {
        return new Persona(nombre, dni);
    }

}
