/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threads.PRIORITY;

/**
 *
 * @author carlos
 */
public class PrioridadHilos implements Runnable{
 
int contar;
Thread hilo;
static boolean stop = false;
static String actualNombre;

    public PrioridadHilos(String nombre) {
        this.contar = 0;
        this.hilo = new Thread(this,nombre);
        actualNombre = nombre;
    }
  
 @Override
    public void run() {
        
        System.out.println(hilo.getName()+ " iniciado. ");
        
        do {         
         
            contar++;
            if(actualNombre.compareTo(hilo.getName()) !=0){
                actualNombre = hilo.getName();
                System.out.println("En "+actualNombre);
            }
            
     } while (stop == false && contar < 1000000);
       
        stop = true;
        System.out.println("\n"+hilo.getName()+ " terminado");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }    
    
    //PrioridadHilos

   
}


class DemoPrioridad{
    
    public static void main(String[] args){
        
    
        PrioridadHilos ph1 = new PrioridadHilos("Prioridad Alta");
        PrioridadHilos ph2 = new PrioridadHilos("Prioridad baja");
        PrioridadHilos ph3 = new PrioridadHilos("Prioridad normal #1");
        PrioridadHilos ph4 = new PrioridadHilos("Prioridad normal #2");
        PrioridadHilos ph5 = new PrioridadHilos("Prioridad normal #3");
        
        ph1.hilo.setPriority(Thread.NORM_PRIORITY +2);
        ph2.hilo.setPriority(Thread.NORM_PRIORITY - 2);
        
        ph1.hilo.start();
        ph2.hilo.start();
        ph3.hilo.start();
        ph4.hilo.start();
        ph5.hilo.start();
        
        //El método join() se utiliza para mantener la ejecución del hilo que se está ejecutando actualmente
        //hasta que el hilo especificado esté muerto(ejecución terminada).
        
        try {
            
            ph1.hilo.join();
            ph2.hilo.join();
            ph3.hilo.join();
            ph4.hilo.join();
            ph5.hilo.join();
            
        } catch (InterruptedException ie) {
            System.out.println("Hilo principal interrumpido");
        }
        
        System.out.println("\n Hilo de alta prioridad conto hasta "+ph1.contar);
        System.out.println("Hilo de baja prioridad conto hasta "+ph2.contar);
        System.out.println("Hilo de normal prioridad #1 conto hasta "+ph3.contar);
        System.out.println("Hilo de normal prioridad #2 conto hasta "+ph4.contar);
        System.out.println("Hilo de normal prioridad #3 conto hasta "+ph5.contar);
        
        
    }
    
    
    
    //fin DemoPrioridad
}