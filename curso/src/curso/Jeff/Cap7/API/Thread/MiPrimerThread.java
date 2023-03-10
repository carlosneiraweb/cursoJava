/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.Jeff.Cap7.API.Thread;

/**
 *
 * @author carlos
 */
public class MiPrimerThread {

public void miPrimerHilo(){
   
    
    Runnable r = new Runnable(){
        
        @Override
        public void run() {
            
            
            
            String name = Thread.currentThread().getName();
            
            int count = 0;
            
            while(count < 100){
                
                System.out.println(name + " : "+ count++);
                    
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ie) {
                }
                
            }
            
            
            
         //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        
        
        }
        
    };
    
         
        Thread th1 = new Thread(r);
        th1.setName("A");
        Thread th2 = new Thread(r);
        th2.setName("B");
        
        th1.start();
        th2.start();
         
//fin mi primer hilo
}  
    
  
/**
 * Metodo join 
 */
    
public void join(){
    
    
    Runnable r = new Runnable(){
        @Override
        public void run() {
            
            System.out.println("worked thread is simulating"+
                    " work by sleeping for 9 seconds");
            
            try {
                Thread.sleep(9000);
            } catch (InterruptedException ie) {
            }
            System.out.println("Worked thread is dying");
            
           // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        
        
        
    };
    
    Thread thd = new Thread(r);
    thd.start();
    System.out.println("Default main thread is doing work");
    
    try {
        Thread.sleep(2000);
    } catch (InterruptedException ie) {
    }
    
    System.out.println("Default main has finished its work");
    System.out.println("Default thread is waiting for worker thread to die");
    
    try {
        thd.join();
    } catch (InterruptedException ie) {
    }
    
    System.out.println("Main thread is dying");
    
    //fin join
}
    

//fin MiPrimerThread    
}
