/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio_19_09_13;

/**
 *
 * @author 202
 */
public class Fecha {
    int dia;
    int mes;
    int agno;

    public Fecha(int dia, int mes, int agno) {
        this.dia = dia;
        this.mes = mes;
        this.agno = agno;
        
        
        
    }
    
    public String aFormatoNumerico()
    {
        String s="";
        if (this.dia<10) s=s+"0";
        
        s = s+this.dia+"/";
        
        if (this.mes<10) s=s+"0";
        
        s = s+this.mes+"/";
        
        s = s+this.agno;
        
          return s;
    }        
    public String aFormatoLetras()
    {
        String s = "";
        String meses [] = {"Enero", "Febrero", "marzo","Abril","Mayo","Junio",
            "Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
        
        s = this.dia + " de "+ meses[this.mes-1] + " de "+this.agno;
        return s;
    }        
    public int aDias()
    {
        int dias;
        dias = this.agno*365 + (this.mes-1)*30 + this.dia;
        return dias;
    }        
    public boolean mayorQue(Fecha otra)
    {
        boolean resultado;
        resultado = this.aDias() > otra.aDias();
        return resultado;
    }        
}
