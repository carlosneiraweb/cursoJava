/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threads.SimpleThread;

/**
 *
 * @author carlos
 */
public class SimpleThread {
    
    //Display a message, preceded by 
    //the name of current thread
    static void threadMessage(String message)
            
    {
        
        String threadName = Thread.currentThread().getName();
        System.out.format("%s: %s%n",threadName, message);
             
    }
    
    private static class MessageLoop implements Runnable{

        @Override
        public void run() {
            
            String importantInfo[] = {
                
               "Mares eat oats",
               "Does eat oats",
               "Little lambs eat ivy",
               "A kid will eat ivy too"
        };
            
        
            try {
                
                for (int i = 0; i < importantInfo.length; i++) {
                    
                    //Pause for 4 seconds
                    Thread.sleep(40000);
                    //Print a message
                    threadMessage(importantInfo[i]);
                    
                }
                
            } catch (InterruptedException e) {
                threadMessage("I wasn't done!");
            }
   
        }
   
    }
    
    //fin SimpleTHread



public static void main(String args[])throws InterruptedException{
    
    
    //Delay, in milliseconds before
    //we interrupt MessageLoop
    //thread(default one hour)
    long patience = 1000 * 60 *60;
    
    //If command line argument
    //present, gives patience
    //in seconds
    
    if(args.length > 0){
    
        try {
            
            patience = Long.parseLong(args[0]) * 1000;
            
            
        } catch (NumberFormatException ne) {
            System.err.println("Argument must be a integer");
            System.exit(1);
        }   
    }
    
    threadMessage("Starting MessageLoop thread");
    long startTime = System.currentTimeMillis();
    Thread t = new Thread(new MessageLoop());
    t.start();
    
    threadMessage("Waiting for MessageLoop thread to finish");
    //loop until MessageLoop
    //thread exits
    
    while(t.isAlive()){
        
        threadMessage("Still waiting...");
        //Wait maximun of second
        //for MessageLoop thread
        //to finish.
        t.join(1000);
        
        if(((System.currentTimeMillis() - startTime) > patience) && t.isAlive()){
            
            threadMessage("Tired of waiting!");
            t.isInterrupted();
            
            //Shouldn be long now
            //--wait indefinitely
            t.join();
        }
    
    }
    
    threadMessage("Finally");

}


}