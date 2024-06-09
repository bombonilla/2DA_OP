/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_10_throw;

/**
 *
 * @author eduar
 */
public class EVA3_10_THROW {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Persona perso = new Persona ("Juan", "peoe")
    }
    
}

class Persona {
    private String nombre;
    private String apellidos;
    private int edad;
    
    public Persona() {
        this.nombre = "";
        this.apellidos = "";
        this.edad = 0;
    }

    public Persona(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws Exception {
        if((edad < 0) || (edad > 120))
            throw new Exception("El valor capturado en edad no es valido");
        this.edad = edad;
    }
    
    
}
