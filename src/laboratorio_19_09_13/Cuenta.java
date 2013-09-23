/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio_19_09_13;

/**
 *
 * @author 202
 */
public class Cuenta {
    String noCuenta;
    double saldo;
    Cliente titular;
    String clave;

    public Cuenta(String noCuenta, double saldo, Cliente titular, String clave) {
        this.noCuenta = noCuenta;
        this.saldo = saldo;
        this.titular = titular;
        this.clave = clave;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "noCuenta=" + noCuenta + ", saldo=" + saldo + ", titular=" + titular + ", clave=" + clave + '}';
    }
    void consignar(double valor)
    {
        this.saldo = this.saldo + valor;
    }        
    boolean retirar(double valor)
    {
        boolean transaccionExitosa=false;
        if(valor<=this.saldo)
        {
            this.saldo = this.saldo - valor;
            transaccionExitosa = true;
        }    
        
        return transaccionExitosa;
    }        
    double consultarSaldo()
    {
        return this.saldo;
    }        
    boolean transferirA(Cuenta otra, int valor)
    {
        boolean transaccionExitosa = false;
        if(valor<=this.saldo)
        {
            this.saldo=this.saldo-valor;
            otra.saldo=otra.saldo+valor;
            transaccionExitosa=true;
        }    
        return transaccionExitosa;
    }        
    
    
}















