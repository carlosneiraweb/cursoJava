
package curso.Jeff.Cap5.Aserciones;

import static java.util.Arrays.sort;

/**
 * Algo que debe ser cierto cuando un metodo es llamado
 * @author carlos
 */
public class Precondiciones {
    
    
    private static int rnd(int limit){
        
        assert limit > 1 : "limit = "+limit;
        return (int)(Math.random()*limit);
        
        
        //fin rnd
    }
    
    private static void sort(int[] x){
        
        for(int pass = 0; pass < x.length-1; pass++)
            for(int i = x.length -1; i > pass; i--)
                if(x[i] < x[pass]){
                    int temp = x[i];
                    x[i] = x[pass];
                    x[pass] = temp;
                }
        
        
        //fin sort
    }
    
    void loto(){
    int[]selectedNumbers = new int[6];
    
    
    for(int slot = 0; slot < selectedNumbers.length; slot++){
    
        int num;
        try_again:
        
        do {            
            num = rnd(49)+1;
            for(int i=0; i < slot; i++)
                if(selectedNumbers[i] == num)
                    continue try_again;
            break;
        } while (true);
        
        selectedNumbers[slot] = num;
        sort(selectedNumbers);
        for(int i=0; i < selectedNumbers.length; i++)
            System.out.println(selectedNumbers[i]+ " ");
    }
    
    
    //fin lotto
    }
    //fin precondiciones
}
