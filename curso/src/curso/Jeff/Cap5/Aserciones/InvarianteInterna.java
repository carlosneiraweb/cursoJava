
package curso.Jeff.Cap5.Aserciones;

/**
 *
 * @author carlos
 * 
 * Una invariante interna es un comportamiento orientado <br/>
 * a la expresion que no se espera que cambie.
 */
public class InvarianteInterna {
    
    final static int NORTH = 0;
    final static int SOUTH = 1;
    final static int EAST = 2;
    final static int WEST = 3;
    
    
    
    public void temperatura(){
        
        double temp = 50.0;
        
        if(temp < 0.0)
            System.out.println("El agua esta conjelada");
        else if(temp >= 100.0)
            System.out.println("El agua esta hirviendo");
        else
            //temp > 0.0 t temp < 100.0
           // assert temp > 0.0 && temp < 100.0 : temp;
            throw new AssertionError(temp);
            System.out.println("El agua esta liquida");
        
        //fin temperatura
    }
    
    
    public void direccion(){
        
        int dirc = 4;//(int)(Math.random()*5);
        
        switch(dirc){
            
            case NORTH : System.out.println("travelling north");break;
            case SOUTH : System.out.println("travelling south");break;
            case EAST : System.out.println("travelling east");break;
            case WEST : System.out.println("travelling west");break;
            default: assert false;
            
        }
        
        
        
        //fin direccion
    }
    
}
