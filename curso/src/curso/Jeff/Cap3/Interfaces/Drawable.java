
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

//abstract redundante
public abstract interface Drawable {
    //public,static,final
    //Hay que inicializarlos 
    int RED = 1;
    int GREEN = 2;
    int BLUE = 3;
    int BLACK = 4;
    
    //public y abstract
    //son metodos de instancia
    //no pueden ser static
    void draw(int color);
    
}
