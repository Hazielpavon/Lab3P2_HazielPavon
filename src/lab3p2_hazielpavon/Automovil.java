
package lab3p2_hazielpavon;

import java.awt.Color;
import java.util.Date;


public class Automovil extends Vehiculos{
    private String tipoC; 
    private int cantP; 
    private String trans; 
    private int cantA; 

    public Automovil(String tipoC, int cantP, String trans, int cantA, String placa, String marca, String modelo, String tipo, Date ano, Color color) {
        super(placa, marca, modelo, tipo, ano, color);
        this.tipoC = tipoC;
        this.cantP = cantP;
        this.trans = trans;
        this.cantA = cantA;
    }

    public Automovil(String tipoC, int cantP, String trans, int cantA) {
        this.tipoC = tipoC;
        this.cantP = cantP;
        this.trans = trans;
        this.cantA = cantA;
    }

    public String getTipoC() {
        return tipoC;
    }

    public void setTipoC(String tipoC) {
        this.tipoC = tipoC;
    }

    public int getCantP() {
        return cantP;
    }

    public void setCantP(int cantP) {
        this.cantP = cantP;
    }

    public String getTrans() {
        return trans;
    }

    public void setTrans(String trans) {
        this.trans = trans;
    }

    public int getCantA() {
        return cantA;
    }

    public void setCantA(int cantA) {
        this.cantA = cantA;
    }

    @Override
    public String toString() {
        return "Automovil: " + "tipoC = " + tipoC + " , cantP = " + cantP + " , trans = "  + trans + " , cantA = " + cantA ;
    }
    
    
    
    
    
}
