/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio_19_09_13;

import javax.swing.JOptionPane;

/**
 *
 * @author 202
 */
public class Laboratorio_19_09_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
       Cliente y[] = new Cliente[4];
       for(int i=0;i<y.length;i++)
       { 
           String nombre;
           String apellido;
           nombre = JOptionPane.showInputDialog("Nombre del cliente "+i);
           apellido = JOptionPane.showInputDialog("Apellido del cliente "+i);
           y[i] = new Cliente(nombre, apellido, "", new Fecha(12,1,12));
       }
       for(int i=0;i<y.length;i++)
       {
           System.out.println(y[i].nombre+" "+y[i].apellido);
       }    
       
    }
}
