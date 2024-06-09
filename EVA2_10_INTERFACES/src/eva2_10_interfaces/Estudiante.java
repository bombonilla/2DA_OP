/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_10_interfaces;

/**
 *
 * @author eduar
 */
public class Estudiante extends Persona implements Datos{
    private int noControl;
    public Estudiante(){
        super();
        this.noControl=0;
    }

    public Estudiante(int noControl, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.noControl = noControl;
    }

    public Estudiante(int noControl) {
        this.noControl = noControl;
    }

    public int getNoControl() {
        return noControl;
    }

    public void setNoControl(int noControl) {
        this.noControl = noControl;
    }
     @Override
    public void imprimirDatos() {
        System.out.println("NOMBRE"+getNombre());
        System.out.println("APELLIDOS"+getApellido());
        System.out.println("edad "+getEdad());
       
    }

    @Override
    public String generarCompleto() {
     return getNombre()+""+getApellido();
        
        // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}