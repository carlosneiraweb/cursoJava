/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia.Redifinicion;

import Herencia.Redifinicion.Point;
import Herencia.Redifinicion.Circle;

/**
 *
 * @author Carlos
 */
public class Graphics {
   
    public static void main(String[] args) {
       /* 
       Point[] points = new Point[]{new Point(10,20),new Circle(10,20,30), new Squid(30,30,30)};
       for(int i =0; i < points.length; i++)
           points[i].draw();
       */
      
       
       Shape[] shapes = new Shape[]{new Point(10,20), new Circle(10,20,30), new Rectangle("20",20,30,15,10)};
        
       for(int i = 0; i < shapes.length; i++)
           shapes[i].draw();

       Shape s = new Rectangle("20",20,30,15,10);
       
    }
    
}
