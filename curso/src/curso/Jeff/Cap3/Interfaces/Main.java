/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.Jeff.Cap3.Interfaces;

/**
 *
 * @author carlos
 */
public class Main {
    
    public static void main (String[] args){
    
    Point p = new Point(30,40);
    p.draw(3);
    
    
    Drawable[] drawables = new Drawable[]{new Point(10,20),new Circle(10,20,30)};
        
        for (Drawable drawable : drawables) {
            drawable.draw(Drawable.RED);
            
        }
    }
    
    
    
}
