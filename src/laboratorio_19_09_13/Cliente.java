/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio_19_09_13;

/**
 *
 * @author 202
 */
public class Cliente {
    
    String nombre;
    String apellido;
    String cedula;
    Fecha fechaNacimiento;

    public Cliente(String nombre, String apellido, String cedula, Fecha fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula + ", fechaNacimiento=" + fechaNacimiento.aFormatoLetras() + '}';
    }
    
    
    
    
    
}
