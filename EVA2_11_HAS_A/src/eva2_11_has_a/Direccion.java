/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_11_has_a;

/**
 *
 * @author eduar
 */
public class Direccion {
    private String calle;
    private String numero;
    private String colonia;
    private String ciudad;
    private String estado;

    public Direccion(String calle, String numero, String colonia, String ciudad, String estado) {
        this.calle = calle;
        this.numero = numero;
        this.colonia = colonia;
        this.ciudad = ciudad;
        this.estado = estado;
    }

    public Direccion() {
        this.calle = "--";
        this.numero = "----";
        this.colonia = "-----";
        this.ciudad = "----";
        this.estado = "-----";
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    @Override
    public String toString(){
     String cade = "Calle " + calle + "\n" + numero + "\n" + "Colonia" + colonia + "\n" + "Ciudad" + ciudad + "\n" + "Estado" + estado;
     return cade;
    }
   
    
    
    
}