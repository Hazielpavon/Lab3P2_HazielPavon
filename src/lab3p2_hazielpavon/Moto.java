
package lab3p2_hazielpavon;

import java.awt.Color;
import java.util.Date;


public class Moto extends Vehiculos {
    private double velocidad;
    private double peso; 
    private double combustible; 

    public Moto(double velocidad, double peso, double combustible, String placa, String marca, String modelo, String tipo, Date ano, Color color) {
        super(placa, marca, modelo, tipo, ano, color);
        this.velocidad = velocidad;
        this.peso = peso;
        this.combustible = combustible;
    }

    public Moto(double velocidad, double peso, double combustible) {
        this.velocidad = velocidad;
        this.peso = peso;
        this.combustible = combustible;
    }

    public Moto() {
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getCombustible() {
        return combustible;
    }

    public void setCombustible(double combustible) {
        this.combustible = combustible;
    }

    @Override
    public String toString() {
        return "Moto " + "velocidad = " + velocidad + " , peso = " + peso + " , combustible = " + combustible;
    }
    
    
    
    
}
