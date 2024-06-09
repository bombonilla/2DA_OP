/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_1_excepciones;

/**
 *
 * @author eduar
 */
import java.util.Scanner;
public class EVA3_1_EXCEPCIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captnum = new Scanner(System.in);
        
        // Solicitar al usuario que ingrese un número
        System.out.print("Ingrese un número: ");
        
        // Leer el número ingresado por el usuario
        int numero = captnum.nextInt();
        
        // Imprimir el número ingresado por el usuario
        System.out.println("El número ingresado es: " + numero);
        
        // Cerrar el objeto Scanner
        captnum.close();
    }
    
    
}
