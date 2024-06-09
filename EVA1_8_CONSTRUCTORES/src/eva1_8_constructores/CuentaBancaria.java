/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_8_constructores;

/**
 *
 * @author eduar
 */
public class CuentaBancaria {
    private double saldo;
    private int noCuenta;
    private String nomCl;
    
    //CONSTRUCTOR DEFAULT
    public CuentaBancaria(){
        noCuenta = 0;
        nomCl = "SIN CLIENTE";
        saldo = 1000000;
    }
    
    //RETIRAN
    public void retirar(double monto){
        //SI ESTA EN TU SALDO
        //RETIRAR 10 MILLONES (O cualquier monto)
        if(monto <= saldo)
            saldo = saldo - monto;
        
    }
    //DEPOSITAR
    public void depositar(double monto){
        saldo = saldo + monto;
    }
    
    public void setNomCliente (String cliente){
        nomCl = cliente;
    }
    public String getNomCliente (){
        return nomCl;
    }
    public void setNoCuenta (int cuenta){
        noCuenta = cuenta;
    }
    public int getNoCuenta (){
        return noCuenta;
    }

    public void imprimirDatosCuenta(){
        System.out.println("El cliente es: " + nomCl);
        System.out.println("El numero de cuenta es: " + noCuenta);
        System.out.println("El saldo es: " + saldo);
        
    }
  
    
}
