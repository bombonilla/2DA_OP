/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_4_clase_persona;

/**
 *
 * @author eduar
 */
public class EVA1_4_CLASE_PERSONA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona perso = new Persona ();
        perso.setNombre("Eduardo");
        perso.setApellido("Bonilla");
        perso.setEdad(20);
        System.out.println("Nombre: " + perso.getNombre());
        System.out.println("Apellido: " + perso.getApellido());
        System.out.println("Edad: " + perso.getEdad());
        System.out.println("La Alexa se come un churro");
       
    }
    
}

class Persona {
    //ATRIBUTOS: Deben ser privados (por diseño)
    private String nombre;
    private String apellido;
    private int edad;
    
    //MÉTODOS: debe haber métodos público (interfaz)
    //que nos permita manipular los atributos.
    //JAVA: Estos metodos son los metodos get y set
    //GET: Nos permite recuperar recuperar un valor (lectura)
    //SET: nos permite asignar un valor (escritura)
    public String getNombre(){
        return nombre;
    }
    public void setNombre (String valor){ 
       nombre = valor;
    }
    public String getApellido(){
        return apellido;
    }
    public void setApellido (String valor){
        apellido = valor;
    }
    public int getEdad (){
        return edad;
    }
    public void setEdad (int valor){
        edad = valor;
    }
   
}
