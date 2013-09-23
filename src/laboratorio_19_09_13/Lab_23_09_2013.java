/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio_19_09_13;

import java.util.ArrayList;

/**
 *
 * @author 202
 */
public class Lab_23_09_2013 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      ArrayList<Cliente> arreglo;
      arreglo = new ArrayList<Cliente>();  
      
      
      arreglo.add(new Cliente("Juan","Perez","",new Fecha(1,1,12)));
      
      for(int i=0;i<arreglo.size();i++)
      {
          System.out.println(arreglo.get(i));
      }    
      arreglo.remove(1);
      System.out.println("Después de eliminar en la pos 1");
      for(int i=0;i<arreglo.size();i++)
      {
          System.out.println(arreglo.get(i));
      } 
      
    }
}
