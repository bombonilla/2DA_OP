/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_5_multiples_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author eduar
 */
public class EVA3_5_MULTIPLES_CATCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //InputMistmatch
        //Arithmetic
        try{
            Scanner captu = new Scanner(System.in);
            System.out.println("Valor del numerador: ");
            int nume = captu.nextInt();
            System.out.println("Valor del divisor");
            int divi = captu.nextInt();
            int resu = nume / divi;
            System.out.println("El resultado es " + resu);
        }catch(InputMismatchException e){
            e.printStackTrace();
        }catch(ArithmeticException e){
                e.printStackTrace();
            
        }
        System.out.println("FIN DEL PROGRAMA"
                + "");
    }
    
}
