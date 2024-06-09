/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_12_polimorfismo;

/**
 *
 * @author eduar
 */
public class EVA2_12_POLIMORFISMO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Estudiante estudiante = new Estudiante("1314","Juan", "Jaquez");
        System.out.println(estudiante);
        Persona persona = estudiante;
        System.out.println("Nombre" + persona.getNombre());
        System.out.println("Apellido" + persona.getApellido());
        //----------
        Persona perso = new Persona("Peter", "Parker");
        System.out.println(perso);

    }
    
}

class Persona{
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

}

class Estudiante extends Persona{
    private String noControl;

    public Estudiante() {
        super();
        this.noControl = "";
    }

    public Estudiante(String noControl, String nombre, String apellido) {
        super(nombre, apellido);
        this.noControl = noControl;
    }

    public String getNoControl() {
        return noControl;
    }

    public void setNoControl(String noControl) {
        this.noControl = noControl;
    }

    @Override
    public String toString() {
        return super.toString() + " " + noControl; 
    }
    
    
    
    


}
