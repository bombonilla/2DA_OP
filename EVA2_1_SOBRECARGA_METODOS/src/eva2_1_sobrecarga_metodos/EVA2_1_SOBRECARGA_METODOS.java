/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_1_sobrecarga_metodos;

/**
 *
 * @author eduar
 */
public class EVA2_1_SOBRECARGA_METODOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Persona perso1 = new Persona();
     perso1.imprimirDatos();
     Persona perso2 = new Persona ("Pedro", "Paramo", 70);
     perso2.imprimirDatos();
     

    }
   
  
}

