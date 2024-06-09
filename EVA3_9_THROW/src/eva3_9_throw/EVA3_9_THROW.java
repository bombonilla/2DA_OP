/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_9_throw;

import java.util.logging.Level;
import java.util.logging.Logger;

 /*
 * @author eduar
 */
public class EVA3_9_THROW {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try { //Aqui estamos en un punto en el codigo donde ya no podemos 
            //pasar la bolita al siguinte metodo. Debemos ayender la excepcion (try catch)
            metodoProblematico();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public static void metodoProblematico() throws Exception{
        System.out.println("Metodo problematico");
        throw new Exception("ALGO GRAVE HA PASADO");
        //System.out.println("Muchos problemas!!");
        //Siempre qaue se ponga un throw debe ser la ultima excepcion
    }
    
}
