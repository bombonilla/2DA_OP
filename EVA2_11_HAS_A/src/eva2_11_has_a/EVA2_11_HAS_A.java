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
public class EVA2_11_HAS_A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   Direccion direc = new Direccion("5ta", "55", "valles", "cdmx", "cdmx");
        Persona perso = new Persona("juan", "perez", 50, direc);
        System.out.println(perso);
       
    }
    
}
