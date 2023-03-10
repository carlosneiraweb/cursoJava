
package Threads.ClassLoader;

/**
 *
 * @author carlos
 */
public class ObtenerClassLoader extends Thread{
    
    
    @Override
    public void run(){
        
        //Devuelve el contexto ObtenerClassLoader para este hilo
        ClassLoader c = getContextClassLoader();
        
        this.setContextClassLoader(c);
        System.out.println("Class = "+c.getClass());
        System.out.println("Parent = "+c.getParent());
        
    }
    
    
    
    //fin getContextClassLoader
}


class Main{
    
    public static void main(String[] args){
        
       ObtenerClassLoader load = new ObtenerClassLoader();
       
       load.start();
        
    }
    
    
}
