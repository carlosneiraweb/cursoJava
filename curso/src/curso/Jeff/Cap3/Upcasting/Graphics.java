/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.Jeff.Cap3.Upcasting;

/**
 *
 * @author carlos
 */
public class Graphics {
    
    public static void main (String[] args){
        
        Point[] points = new Point[]{new Point(10,20), new Circle(10,20,30)};
        System.out.println(points[1].circle);
        for (int i = 0; i < points.length; i++) {
            points[i].draw();
            
            
        }
        
    }
    
    
}
