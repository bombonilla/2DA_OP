/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_15_clases_anonimas;

/**
 *
 * @author eduar
 */
public class EVA2_15_CLASES_ANONIMAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //No se pueden crear objetos de interfaces.
        //El codigo entre llaves es una clase sin nombre 
        //MANEJO DE EVENTOS  EN LA INTERFAZ GRAFICA
        //en Java existen  manejadores de eventos llamados Listeners
        //Los Listerners son interfaces.
        //Topicos avanzados de Programación
        Prueba prueba = new Prueba() {
            @Override
            public void mostrarMensaje() {
                System.out.println("Hola mundo");
            }
                
        }
    };
                   
}

interface Prueba{
    public void mostrarMensaje();
     
   
}
abstract class ClaseAbstracta{
    public abstract void mensjae();
    public void otroMensaje(){
            System.out.println ("hola undo abstracto");
};
    prueba.mostrarMensaje()
}
//CLASE ANONIMA = CLASE SIN NOMBRE
//Se usan para implementar interfaces o clases abstractas 