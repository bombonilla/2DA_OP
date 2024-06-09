/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_8_finally;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author eduar
 */
public class EVA3_8_FINALLY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
        Scanner captu = new Scanner (System.in);
        int nume = captu.nextInt();
        System.out.println("El valor captiurado es" + nume);
    }catch(InputMismatchException e){
        e.printStackTrace();
    }finally{
        //Se usa para ejecutar alguna instruccion critica de su programa
        //y esta debe ejecutarse sin importar si ocurre o no la excepcion
            System.out.println("ESTA INSTRUCCION SIEMPRE SE EJECUTA!!");
        }
        System.out.println("EL FIN DEL PROGRAMA!!");
    
    }
}

