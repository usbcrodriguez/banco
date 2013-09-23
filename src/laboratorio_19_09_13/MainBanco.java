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
        banco.adicionarCliente(new Cliente(null,null,null, null));
        banco.adicionarCliente(new Cliente(null,null,null, null));
        banco.adicionarCliente(new Cliente(null,null,null, null));
        
        Cliente x = banco.buscarPorDocumento("131211");
        System.out.println(x);
        banco.borrarCliente("131211");
        
        
    }
}
