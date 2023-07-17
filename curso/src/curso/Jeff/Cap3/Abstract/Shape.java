/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.Jeff.Cap3.Abstract;

/**
 *
 * @author carlos
 */
abstract class Shape {
    String nombre;
    abstract void draw();
    public void saludosAbstract(){
        System.out.println("Soy un metodo de la clase Shape y no soy abstracto");
    }
    
}
