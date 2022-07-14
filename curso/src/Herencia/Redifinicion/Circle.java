/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia.Redifinicion;

/**
 *
 * @author Carlos
 */
public class Circle extends Point{
    
    private int radius;

    public Circle(int radius, int x, int y) {
        super(x, y);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }
    
    /**
     * metodo circle
     */
    public void circulo(){
        
    }
    
    /**
     * metodo toString Circle
     * @return 
     */
    @Override
    public String toString(){
    
        return " "+radius;
    
    }
    /**
     * metodo draw Circle
     */
    
    
    @Override
    void draw(){
        
        System.out.println("CIrcle draw at " +super.toString()+
                " with radius "+ toString());
        
}
    
}
