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
public class Point extends Shape{
    
    private int x,y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    /**
     * public POint
     */
    protected void point(){
        
    }
    /**
     * metodo toString Point
     * @return 
     */
    @Override
    public String toString(){
    
        return "("+x+","+y+")";
    
    }
    /**
     * metodo draw Point
     */
    void draw(){
        
        System.out.println("Poijnt draw at " +toString());
        
}
    
    
    
    
    
    
}
