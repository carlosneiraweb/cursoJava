/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.Jeff.Cap3.Apuntes.Upcasting;

/**
 *
 * @author carlos
 */
public class Circle extends Point{
    
    private int radius;
    public String circle = "Soy un circle";
    public Circle(int x, int y,int radius) {
        super(x, y);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }
    
    @Override public String toString(){
        return " "+radius;
    }
    
    @Override void draw(){
        System.out.println("Circle drawn at " + super.toString() +  " with radius " + toString());
    }
    
    public void metodoCircle(){
        System.out.println("Soy un Circle");
    }
}
