/*
*https://programacion.net/articulo/threads_de_control_100/11
*
*La clase ThreadGroup maneja grupos de threads para las aplicaciones Java
*El grupo principal en una aplicación Java 
*es el grupo de threads llamado "main".
*
*/
package Threads.ThreadGroup;

/**
 *
 * @author carlos
 */
public class ThreadGroup {
   
    
    void listCurentThreads(){
        
        java.lang.ThreadGroup currentGroup = Thread.currentThread().getThreadGroup();
        int numThreads;
        Thread[] listOfThreads;
        
        numThreads = currentGroup.activeCount();
        listOfThreads = new Thread[numThreads];
        currentGroup.enumerate(listOfThreads);
        
        for (int i = 0; i < numThreads; i++) {
            
            System.out.println("THread # "+i+ listOfThreads[i].getName());
            
        }
        
    }
    
public static void main(String[] args){
    
    ThreadGroup gr = new ThreadGroup();
    gr.listCurentThreads();
    
    
}    
    
    //fin ThreadGroup
}
