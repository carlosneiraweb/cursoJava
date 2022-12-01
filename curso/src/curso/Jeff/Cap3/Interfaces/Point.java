/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.Jeff.Cap3.Interfaces;

import curso.Jeff.Cap3.Abstract.*;
import curso.Jeff.Cap3.Apuntes.Upcasting.*;

/**
 *
 * @author carlos
 */
public class Point implements Drawable{
    
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
    
    @Override public void draw(int color){System.out.println("Point drawn at "+ toString() + "in color "+color);}
    
    public void metodoClasePadre(){
        System.out.println("Soy un metodo de Point");
    }

}