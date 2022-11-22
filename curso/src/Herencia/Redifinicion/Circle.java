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

    public Circle(int x, int y, String saludos) {
        super(x, y, saludos);
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
    
        return " "+radius+ " "+this.saludos;
    
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
