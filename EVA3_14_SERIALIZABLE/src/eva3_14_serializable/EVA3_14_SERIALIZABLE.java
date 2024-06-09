/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_14_serializable;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author eduar
 */
public class EVA3_14_SERIALIZABLE {

    private static Object Logger;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona perso = new Persona("Juan", "Perez", 50);
        Persona perso2;
        try {
            guardarObjeto(perso);
            perso2 = leerObjeto();
            if(perso2 ! }= null){
        System.out.println(perso2.toString());
        } catch (IOException ex) {
            Logger.getLogger(EVA3_14_SERIALIZABLE.class.getName()).logger
        }
    }
    public static void guardarObjeto (Persona obj) throws IOException{
        String ruta = "\"C:\\ARCHIVOS\\"";
        FileOutputStream abrirArch = new FileOutputStream(ruta);
        try (ObjectOutputStream guardarArch = new ObjectOutputStream(abrirArch)) {
            guardarArch.writeObject(obj);
        }
        
    }
        
    }
    public static void Persona leerObjeto(){
        String ruta = "C:\ARCHIVOS";
        Persona perso = null;
        FileInputStream abrirArch = new FileInputStream(ruta);
        ObjectInputStream leerObj = new ObjectInputStream(abrirArch);
        perso = (Persona)leerObj.readObject();
        leerObj.close();
        return perso;
}

  
class Persona implements
<