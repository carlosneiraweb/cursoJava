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
public class Pajaro extends Animal{
    
    public String Alas;
    protected String Altura;

    public Pajaro(String Alas, String Altura, Integer edad, String nombre, String lugar) {
        super(edad, nombre, lugar);
        this.Alas = Alas;
        this.Altura = Altura;
    }
    
    @Override
    public void descripcion(){
        //super.descripcion();
        System.out.println("Soy un pajaro y tengo "+this.Alas+ " y mi altura es "+this.Altura+ 
                " y mi edad es "+this.edad);
    }
}
