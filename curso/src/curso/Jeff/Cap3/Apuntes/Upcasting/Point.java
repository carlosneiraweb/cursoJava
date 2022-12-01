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
public class Point {
    
    private int x,y;
    public String circle = "Soy un point";
    Point(int x, int y){
        this.x = x;
        this.y = y;
        
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    @Override public String toString(){
        return "(" + x + "," + y + ")";
    }
    
    void draw(){System.out.println("Point drawn at "+ toString());}
    
    public void metodoClasePadre(){
        System.out.println("Soy un metodo de Point");
    }

}