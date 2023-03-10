
package Threads.GetState;

/**
 *
 * @author carlos
 */
public class GetState implements Runnable{

    @Override
    public void run() {
        
        Thread.State state = Thread.currentThread().getState();
        System.out.println("Nombre hilo "+ Thread.currentThread().getName());
        System.out.println("Estado "+ state);
    }
    
}


 class Main{

     
     public static void main(String[] args){
         Thread t = new Thread(new GetState());
         t.start();
     }
     
     
     
}