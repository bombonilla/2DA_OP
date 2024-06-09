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
public class EVA1_8_CONSTRUCTORES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here= new CuentaBancaria(
        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.setNomCliente ("JUAN EL PIPORRO VAZQUEZ");
        cuenta.setNoCuenta(64646565);
        cuenta.imprimirDatosCuenta();
        
    }
    
}
