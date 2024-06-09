/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_7_uso_excepcion;

/**
 *
 * @author eduar
 */
import java.util.InputMismatchException;
import java.util.Scanner;
public class EVA3_7_USO_EXCEPCION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try ( // TODO code application logic here
                Scanner scanner = new Scanner(System.in)) {
            int numero;
            
            while (true) {
                try {
                    System.out.print("Por favor, ingresa un número entero: ");
                    numero = scanner.nextInt();
                    break;  
                } catch (InputMismatchException e) {
                    System.out.println("Debes ingresar un número entero. Intenta nuevamente.");
                    scanner.nextLine(); 
                } catch (ArithmeticException e) {
                    System.out.println("¡Error aritmético! No se puede realizar la operación.");
                    scanner.nextLine(); 
                }
            }
            
            
            System.out.println("Has ingresado el número entero: " + numero );
        }
    }
}

    