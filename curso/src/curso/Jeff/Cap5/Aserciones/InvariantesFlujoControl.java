/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.Jeff.Cap5.Aserciones;

/**
 * Flujo de control que no se espera que cambie
 * @author carlos
 */
public class InvariantesFlujoControl {
    
    final static int NORTH = 0;
    final static int SOUTH = 1;
    final static int EAST = 2;
    final static int WEST = 3;
    
    void direccionFlujoControl(){
        
     
        int dirc = 4;//(int)(Math.random()*5);
        
        switch(dirc){
            
            case NORTH : System.out.println("travelling north");break;
            case SOUTH : System.out.println("travelling south");break;
            case EAST : System.out.println("travelling east");break;
            case WEST : System.out.println("travelling west");
            default: assert false;
            
        }
        
        
        
        //fin direccionFlujoControl
        
    }
    
    
    
}
