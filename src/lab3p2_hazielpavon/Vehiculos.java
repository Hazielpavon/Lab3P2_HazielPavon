package lab3p2_hazielpavon;

import java.awt.Color;
import java.util.Date;

public class Vehiculos {

    private String placa;
    private String marca;
    private String modelo;
    private String tipo;
    private Date ano;
    private Color color;

    public Vehiculos(String placa, String marca, String modelo, String tipo, Date ano, Color color) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
        this.ano = ano;
        this.color = color;
    }

    public Vehiculos() {
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getAno() {
        return ano;
    }

    public void setAno(Date ano) {
        this.ano = ano;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Vehiculos " + "placa = " + placa + " , marca = " + marca + ", modelo = " + modelo + " , tipo = " + tipo + " , ano = " + ano + " , color = " + color + ", ";
    }

}
