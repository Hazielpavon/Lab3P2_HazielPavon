
package lab3p2_hazielpavon;

import java.awt.Color;
import java.util.Date;


public class Bus extends Vehiculos {
    
    private int cantP; 
    private int eje; 
    private int longitud; 

    public Bus(int cantP, int eje, int longitud, String placa, String marca, String modelo, String tipo, Date ano, Color color) {
        super(placa, marca, modelo, tipo, ano, color);
        this.cantP = cantP;
        this.eje = eje;
        this.longitud = longitud;
    }

    public Bus(int cantP, int eje, int longitud) {
        this.cantP = cantP;
        this.eje = eje;
        this.longitud = longitud;
    }

    public int getCantP() {
        return cantP;
    }

    public void setCantP(int cantP) {
        this.cantP = cantP;
    }

    public int getEje() {
        return eje;
    }

    public void setEje(int eje) {
        this.eje = eje;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    @Override
    public String toString() {
        return "Bus " + "cantP = " + cantP + " , eje = " + eje + " , longitud = " + longitud ;
    }
    
    
    
}
