/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threads.GetAllStackTraces;

import java.util.Map;

/**
 *
 * @author carlos
 */
public class GetAllStackTraces implements Runnable{

    @Override
    public void run() {
        System.out.println("This is de run method");
        Map m = Thread.getAllStackTraces();
        System.out.println(m.size());
    }
    
}


class Iniciar{
    
public static void main(String[] args){
    
    GetAllStackTraces gt = new GetAllStackTraces();
    
    Thread t = new Thread(gt);
    
    //t.start();
    t.run();
    
    Map mp = Thread.getAllStackTraces();
    System.out.println(mp.size());
    
}    
    
    
}
