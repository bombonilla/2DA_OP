/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_4_herencia;

/**
 *
 * @author eduar
 */
public class EVA2_4_HERENCIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona perso = new Persona();
        //TODAS LAS CLASES EN JAVA DESCIENDEN DE LA CLASE object
        System.out.println(perso.toString());
        //el método toString() no es implementado por nosotros, viene
        //por herencia.
        Estudiante estu = new Estudiante();
        System.out.println("Nombre: " + estu.getNombre());
        System.out.println("Apellidos: " + estu.getApellidos());
        System.out.println("Edad: " + estu.getEdad());
    }
}
    class Persona{
        private String nombre;
        private String apellidos;
        private int edad;
      
        public Persona(){
            this.nombre = "SIN NOMBRE";
            this.apellidos = "SIN APELLIDOS";
            this.edad = 0;
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

        public void setEdad(int edad) {
            this.edad = edad;
        }
        
       
    }
    class Estudiante extends Persona{
        private String noControl;
        
        public Estudiante(){
    }

        public Estudiante(String noControl) {
            this.noControl = noControl;
        }

        public String getNoControl() {
            return noControl;
        }

        public void setNoControl(String noControl) {
            this.noControl = noControl;
        }
        
}


