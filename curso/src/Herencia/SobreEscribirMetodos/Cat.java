/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia.SobreEscribirMetodos;

import Herencia.SobreEscribirMetodos.*; 

/**
 *
 * @author Carlos
 */
public class Cat extends Animal{
    
    public Integer patas;
    private Integer peso;
    protected String razon;

    public Cat(Integer patas, Integer peso, String razon, Integer edad, String nombre, String lugar) {
        super(edad, nombre, lugar);
        this.patas = patas;
        this.peso = peso;
        this.razon = razon;
    }

    public Integer getPatas() {
        return patas;
    }

    public void setPatas(Integer patas) {
        this.patas = patas;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public String getRazon() {
        return razon;
    }

    public void setRazon(String razon) {
        this.razon = razon;
    }
    
    
    
    public static void  testClassMethod() {
        System.out.println("El método estático en Cat");
    }
    
    public void testInstanceMethod() {
        System.out.println("El método de instancia en Cat");
    }
    
    public void descripcion(){
        System.out.println("Soy un gato y tengo "+this.patas +" patas "+
                " y peso "+ this.peso+ "y mi edad es "+this.edad+ " ");
    }
    
}
