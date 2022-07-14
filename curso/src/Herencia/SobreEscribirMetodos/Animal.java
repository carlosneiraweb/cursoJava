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
public class Animal {
    
    
    public Integer edad;
    private String nombre;
    protected String lugar;

    public Animal(Integer edad, String nombre, String lugar) {
        this.edad = edad;
        this.nombre = nombre;
        this.lugar = lugar;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
    
    
    
    
    
    public static void testClassMethod() {
        System.out.println("El método estático en Animal");
    }
    public void testInstanceMethod() {
        System.out.println("El método de instancia en Animal");
    }
    
    public void descripcion(){
        
        System.out.println("Soy un animal y me llamo "+this.nombre +
                " y sou de "+ this.lugar+ "y mi edad es "+this.edad+ " ");
    }
    
    
}
