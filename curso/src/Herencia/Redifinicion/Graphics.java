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
      
       
       //Shape[] shapes = new Shape[]{new Point(10,20), new Circle(10,20,30), new Rectangle("20",20,30,15,10)};
        
//       for(int i = 0; i < shapes.length; i++)
//           shapes[i].draw();

       Shape sh = new Shape("Saludos forma");
       sh.claseShape();
       sh.draw();
       System.out.println(sh.forma);
       System.out.println(sh.saludos);
       sh.protectedShape();
       Shape.metodoStaticoSape();
       
       Shape s = new Rectangle("20",20,30,15,10,"Saludos desde un rectangulo ");
       s.claseShape();
       s.draw();
       s.protectedShape();
       System.out.println(s.saludos);

       Rectangle r = new Rectangle("1000",10,50,50,50,"Rectangulo");
       s.claseShape();
       r.draw();
       r.protectedShape();
       System.out.println(r.saludos);
       
       
       Fractal f = new Fractal("0000000000",10,50,50,50,"Fractal");
       
       System.out.println(f.forma);
       System.out.println(f.fractal);
       System.out.println(f.saludos);
       f.protectedShape();
       f.pintoRectangulo();
       
       
    }
    
}
