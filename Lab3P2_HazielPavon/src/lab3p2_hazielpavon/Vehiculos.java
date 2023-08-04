package lab3p2_hazielpavon;

import java.awt.Color;

public class Vehiculos {

    String placa;
    String marca;
    String modelo;
    String tipo;
    int ano;
    Color color;

    public Vehiculos(String placa, String marca, String modelo, String tipo, int ano, Color color) {
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

        for (int i = 0; i < placa.length(); i++) {

            char x = 
            
        }

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

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
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
        return "Vehiculos: " + "placa = " + placa + " , marca = " + marca + " , modelo = " + modelo + " , tipo = " + tipo + " , ano = " + ano + ", color = " + color;
    }

}
