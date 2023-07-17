/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.Jeff.Cap3.Abstract;

/**
 *
 * @author carlos
 */
public class Graphics {
    
    public static void main (String[] args){
        
        Shape[] shapes = new Shape[]{new Point(10,20), new Circle(10,20,30),new Rectangle(20,30,15,25)};
        
          for (int i = 0; i < shapes.length; i++) {
            shapes[i].saludosAbstract();
            shapes[i].draw();
            
        }
  
            
        
        
    }
    
    
}
