/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio_19_09_13;

/**
 *
 * @author 202
 */
public class Persona {
    String nombre;
    String apellido;

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + '}';
    }
    
}
