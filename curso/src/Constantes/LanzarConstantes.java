/**
 * https://ricardogeek.com/patrones-y-anti-patrones-al-usar-constantes-en-java/
 */
package Constantes;

/**
 *
 * @author carlos
 */
public class LanzarConstantes implements InterfazConstantes{
    
    
    public static void main(String[] args){
        
        
         Constantes cns = new Constantes(10,20);
         System.out.println("Total "+cns.sumar());
         System.out.println(INTCONS);
                
         //cns.IN2=5; ERROR no se puede modificar
        
        
    }   
     
    //fin LanzarConstantes
}
