
/**
 * Devuelve el identificador de este Thread. El ID del hilo es un longnúmero positivo generado cuando se creó este hilo. 
 * El ID del subproceso es único y permanece sin cambios durante su vigencia.
 * Cuando se termina un subproceso, este ID de subproceso se puede reutilizar.
 */
package Threads.GetID;

/**
 *
 * @author carlos
 */
public class GetId implements Runnable{

    Thread th;
    
    
    GetId(Thread thread) {
        this.th = thread;
    }

    
    @Override
    public void run() {
        
        System.out.println("Name = "+ th.getName());
        System.out.println("Id = "+ th.getId());
    }
    
}


class Main{
    
    
    public static void main(String[] args){
        
        
        GetId gt = new GetId(new Thread());
        gt.run();
    }
    
    
}
