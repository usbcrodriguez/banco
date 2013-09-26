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
public class Banco {
    ArrayList<Cliente> clientes;
    
    public Banco()
    {
        this.clientes = new ArrayList<Cliente>();
    }        
    
    public void adicionarCliente(Cliente c)
    {
        this.clientes.add(c);
    }  
    public void borrarCliente(String documento)
    {
        Cliente c = this.buscarPorDocumento(documento);
        this.clientes.remove(c);
    }      
    public Cliente buscarPorDocumento(String documento)
    {
        Cliente c=null;
        for(int i=0;i<this.clientes.size();i++)
        {
            if(clientes.get(i).cedula.equals(documento))
            {
                return clientes.get(i);
            }    
            
        }    
        
        return c;
    }        
    public void imprimirClientes()
    {
        for (Cliente c: this.clientes)
        {
            System.out.println(c);
        }    
        /*
         for (int i=0; i<clientes.size();i++)
         {
             System.out.println(clientes.get(i));
         }
         */
         
    }        
    
}
