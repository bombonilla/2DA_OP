/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_13_polimorfismo_2;

/**
 *
 * @author eduar
 */
public class Persona implements MostrarDatos {
private String nombre;
private String apellido;

    public Persona() {
        this.nombre = "sin nombre";
        this.apellido = "sin apellido";
    }

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

@Override
    public String toString(){
    return nombre + " " + apellido;
    }
@Override
public void imprimirDatos(){
    super.imprimirDatos();
    System.out.println("No de control" + noControl);
    
}
}

