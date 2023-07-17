/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClaseObject.WaitAndNotifyAll;

/**
 *
 * @author carlos
 */
public class Waiter implements Runnable{
    
    
    private Message msg;
    
    public Waiter(Message m){
        this.msg = m;
    }

    @Override
    public void run() {
        
        String name = Thread.currentThread().getName();
        //System.out.println("nombre hilo "+name );
        synchronized(msg){
            
            try {
                
                System.out.println(name+ " waiting to get notified at time: "+System.currentTimeMillis());
                msg.wait();
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
            
            System.out.println(name+ " waiter thread got notified at time: "+System.currentTimeMillis());
            //process the new message now
            System.out.println(name+" processed: "+msg.getMsg());
        }
    }
    
    
}
