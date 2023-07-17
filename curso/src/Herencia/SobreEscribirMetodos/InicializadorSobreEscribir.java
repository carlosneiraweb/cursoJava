/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia.SobreEscribirMetodos;

import Herencia.SobreEscribirMetodos.*;
import java.util.ArrayList;

/**
 *
 * @author Carlos
 */
public class InicializadorSobreEscribir {
  
     public static void main(String[] args) {
         
         
        /*SOBRE ESCRITURA DE METODOS*/
        Cat gato = new  Cat(4,10,"si",1,"miau","valencia");
        Animal cat = new Cat(4,10,"si",1,"miau","valencia");
        Animal a = new Animal(1,"miau","valencia");
        
       /*
        Animal.testClassMethod(); //Clase animal
        gato.testInstanceMethod();//Instancia Cat
        cat.testInstanceMethod();//Instancia Cat
        Cat.testClassMethod(); //Clase Cat
         
        */
       Animal p,g;
       
       //p = new Pajaro("2 alas", " 30cm",5, "pajaro","Valencia");
       g = new Cat(4,10,"ser",20,"gato","sevilla");
       g.descripcion();
       //p.descripcion();
       
       
       
       /*******************************************/
       
       
       
     }
    
    
    
 //fin InicializadorSobreEscribir   
    
}
