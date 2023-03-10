/*
https://www.arquitecturajava.com/java-wait-notify-y-threads/
*/
package ClaseObject.WaitAndNotify;

/**
 *
 * @author carlos
 */
public class Main {
    
    public static void main(String[] args){
        
        Bolsa bolsa = new Bolsa();
        HiloEnvio hilo = new HiloEnvio(bolsa);
        hilo.start();
        
        for (int i = 0; i < 10; i++) {
            
            Producto p = new Producto();
            
            try{
                
                synchronized(bolsa){
                    
                    Thread.sleep(1000);
                    if(bolsa.estaLlena()){
                        bolsa.notify();
                    }
                }
                
                
            }catch(InterruptedException ie){
                
            }
            
            bolsa.addProducto(p);
            System.out.println("Tamaño de la bolsa"+bolsa.getSize());
            
        }
        
        
        
        
    }
    
}
