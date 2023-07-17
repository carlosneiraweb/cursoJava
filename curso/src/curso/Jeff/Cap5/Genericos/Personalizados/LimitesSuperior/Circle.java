/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.Jeff.Cap5.Genericos.Personalizados.LimitesSuperior;

import curso.Jeff.Cap5.Genericos.Personalizados.*;

/**
 *
 * @author carlos
 */
public class Circle extends Shape implements Comparable<Circle> {
   
    private double x,y,radius;
    
    Circle(double x, double y, double radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    
    @Override
    public int compareTo(Circle circle){
        System.out.println(radius);
        System.out.println(circle.radius);
        if (radius < circle.radius)
            return -1;
        else
            
            if(radius > circle.radius)
                return 1;
        else
                return 0;
    }
    
    @Override 
    public String toString(){
        return "(" + x + ", "+ y + ", "+radius + ")";
    }
    
    
    
    //fin Circle
}




    
    
