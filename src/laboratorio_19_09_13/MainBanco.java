/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio_19_09_13;

/**
 *
 * @author 202
 */
public class MainBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Banco banco = new Banco();
        banco.adicionarCliente(new Cliente("Juan","Pérez","1234", new Fecha(1,1,99)));
        banco.adicionarCliente(new Cliente("María","Rodríguez","4122", new Fecha(1,1,99)));
        banco.adicionarCliente(new Cliente("Pedro","Gómez","444", new Fecha(1,1,99)));
       
        banco.imprimirClientes();
        System.out.println("Al buscar 1234");
       Cliente x = banco.buscarPorDocumento("1234");
        System.out.println(x);
        System.out.println("Al borrar 1234");
        banco.borrarCliente("1234");
        banco.imprimirClientes();
               
        
        
    }
}
