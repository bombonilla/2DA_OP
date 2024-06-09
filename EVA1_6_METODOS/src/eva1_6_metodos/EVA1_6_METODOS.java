/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_6_metodos;

/**
 *
 * @author eduar
 */
public class EVA1_6_METODOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        persona perso = new persona();
        perso.setnombre("leo");
        perso.setapellidos("aguilar");
        perso.setedad(18);
        System.out.println("El nombre completo es: " + perso.generarnombrecom());
        System.out.println("La fecha de nacimiento es: " + perso.calcularaño());
        
        //SE DECLARA Y CREA UN ARREGLO
        //EN ESTE METODO, NO EXISTEN LOS 5 OBJETS
        persona[] grupo = new persona[5];
        for (int i = 0; i < grupo.length; i++) {
            grupo[i] = new persona();//creamos cada objeto
            Scanner input = new Scanner(System.in);
            System.out.println("Captura el nombre:"); 
            String nombre = input.nextLine();
            grupo[i].setnombre(nombre);
            
            System.out.println("Captura el apellido:"); 
            String apellidos = input.nextLine();
            grupo[i].setapellidos(nombre);
            
            System.out.println("Captura la edad:"); 
            int edad = input.nextInt(); //CUANDO SEAN NOMBRE SE CAMBIA EL "Line" por el "Int"
            grupo[i].setedad(edad);
        }
         for (int i = 0; i < grupo.length; i++) {
        System.out.println("El nombre completo es: " + grupo[i].generarnombrecom());
        System.out.println("La fecha de nacimiento es: " + grupo[i].calcularaño());
        
    }
}}
