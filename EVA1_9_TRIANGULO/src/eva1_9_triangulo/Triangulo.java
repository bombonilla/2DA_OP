/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_9_triangulo;

/**
 *
 * @author eduar
 */
public class Triangulo {//Triangulo rectangulo
    private double base;
    private double altura;
    
    
    
    public Triangulo(){
        base = 0;
        altura = 0;
    }
    //get y set de base y altura
    public double getBase(){
        return base;
    }
    public void setBase (double valor){
        base = valor;
    }
    public double getAltura(){
        return altura;
    }
    public void setAltura (double valor){
        altura = valor;
    }
    private double calcularArea(){
        return(base * altura) / 2;
    }
    private double calcularHip(){
        return Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
    
    }
    private double calcularPeri(){
        double peri;
        peri = base + altura + calcularHip();
        return peri;
    }
    
    public void imprimirDatos (){
        System.out.println("El area es: " + calcularArea());
        System.out.println("El perímetro es: " + calcularPeri());
    }
   
    
}
