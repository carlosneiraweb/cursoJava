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
public class Rectangle extends Shape{

    public int anchura;
    public int altura;
    public int i;
    public int o;
    
    Rectangle(int i, int o, int anchura, int altura) {
        
        this.anchura = anchura;
        this.altura = altura;
    }
    
    
    @Override public String toString(){
        
        return (" anchura "+anchura + " altura"+altura );
    }
    
    void draw(){
        System.out.println("Soy un rectangulo "+ toString());
    }
}
