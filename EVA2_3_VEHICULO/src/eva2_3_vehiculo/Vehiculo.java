/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_3_vehiculo;

/**
 *
 * @author eduar
 */
public class Vehiculo {
    // Atributos
    private String marca;
    private String modelo;
    private int annio;
    private String color;
    
     public Vehiculo(String marca, String modelo, int annio, String color) {
        this.marca = "Sin marca";
        this.modelo = "Sin modelo";
        this.annio = 0;
        this.color = "Sin color";
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

    public int getAnnio() {
        return annio;
    }

    public void setAnnio(int annio) {
        this.annio = annio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
     

}
