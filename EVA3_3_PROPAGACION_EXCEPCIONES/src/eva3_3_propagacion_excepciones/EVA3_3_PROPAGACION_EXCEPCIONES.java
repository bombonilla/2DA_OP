/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_3_propagacion_excepciones;

/**
 *
 * @author eduar
 */
public class EVA3_3_PROPAGACION_EXCEPCIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
A();
    }
    public static void A(){
    B();
    }
    public static void B(){
    C();
    }
    public static void C(){
    int x = 10 , y = 0;
    int resu = x / y;
        System.out.println(resu);
    }
    
}