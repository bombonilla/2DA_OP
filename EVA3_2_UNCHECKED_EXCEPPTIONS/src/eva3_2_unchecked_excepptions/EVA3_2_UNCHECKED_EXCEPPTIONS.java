/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_2_unchecked_excepptions;

/**
 *
 * @author eduar
 */
public class EVA3_2_UNCHECKED_EXCEPPTIONS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //NullPointerException: cuando tratamos de usar
        //un objeto que no existe
        //Persona persona = null;
        //System.out.println(persona.toString());
        
        //IndexOutOfBoundsException: cuando tratamos de leer
        //una posicion que no existe en un arreglo
         int arreglo[] = new int[10]; //N: 10
         //e java, la primer posicion es 0 (cero)
         //la ultima es N - 1 = 9
         arreglo[15] = 200;
         
         //ArithmeticException: division entre cero
         int x = 100, y = 0;
         int resu = x / y;
         System.out.println("Resultado = " + resu);
         
         //InputMismatchException: cuando no coinciden
         //los tipos de datos
         Scanner captu = new Scanner(System.in);
         int valor = captu.nextInt();
    }
    
}

class Persona{}
