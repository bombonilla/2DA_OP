/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_5_vehiculo;

/**
 *
 * @author eduar
 */
public class Vehiculo {
    private String marca;
    private String modelo;
    private int annio;
    private String color;
    private double precio;
    
    public String getMarca(){
        return marca;
    }
    public void setMarca (String valor){
        marca = valor;
    }
    public String getModelo (){
        return modelo;
    }
    public void setModelo (String valor){
        modelo = valor;
    }
    public int getAnnio (){
        return annio;
    }
    public void setAnnio (int valor){
        annio = valor;          
    }
    public String getColor (String valor){
        return color;
    }
    public void setColor (String valor){
        color = valor;
    }
    public double getPrecio (double valor){
        return valor;
    }
    public void setPrecio (double valor){
        precio = valor;
    }
    
    
    
}
