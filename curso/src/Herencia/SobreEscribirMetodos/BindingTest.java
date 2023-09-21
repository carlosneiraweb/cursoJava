/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia.SobreEscribirMetodos;

/**
 *
 * @author carlos
 */

class Padre {
 
    public static void metodoEstatico() {
        System.out.println("Invocación desde el padre.");
    }
}
 
class Hijo extends Padre {
 
    public static void metodoEstatico() {
        System.out.println("Invocación desde el hijo.");
    }
}


public class BindingTest {
 
    public static void main(String[] args) {
        Padre p = new Hijo();       
        p.metodoEstatico();
        Hijo h = new Hijo();
        h.metodoEstatico();
        
       
    }
}