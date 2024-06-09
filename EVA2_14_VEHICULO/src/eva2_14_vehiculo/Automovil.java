/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_14_vehiculo;

/**
 *
 * @author eduar
 */
public class Automovil extends Vehiculo{
    private int noPuertas;

    public Automovil() {
        super();
    }

    public Automovil(int noPuertas, int velocidad) {
        super(velocidad);
        this.noPuertas = noPuertas;
    }

    public int getNoPuertas() {
        return noPuertas;
    }

    public void setNoPuertas(int noPuretas) {
        this.noPuertas = noPuretas;
    }

   
    
     
    
}