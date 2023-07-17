
package curso.Jeff.Cap5.Aserciones;
import java.util.Arrays.*;

/**
 *
 * @author carlos
 */
public class Posteriores {
    
    public static int[] merge(int[]a,int[]b){
        
        if(a == null)throw new NullPointerException("a is null");
        if(b == null)throw new NullPointerException("b is null");
        
        int[] result = new int[a.length+b.length];
        
        //Precondicion
        assert result.length == a.length+b.length: "length mismatch";
        
        
        for(int i = 0; i < a.length;i++)
            result[i] = a[i];
        for(int i = 0; i < b.length; i++)
            result[a.length+i-1] = b[i];
        
        assert containsAll(result,a,b): "Vallue missing from array";
 
       return result; 
    }
    
    
    
    private static boolean containsAll(int[] result, int[] a, int[]b){
        
        for(int i=0; i < a.length;i++)
            if(!contains(result,a[i]))
                return false;
        for(int i = 0; i < b.length;i++)
            if(!contains(result,b[i]))
                return false;
        
        return true;
    }
    
    private static boolean contains(int[] a, int val){
        for(int i = 0; i < a.length;i++)
            if(a[i] == val)
                return true;
        
        return false;
    }
    
    public static void main(String[]args){
    int[]x = {1,2,3,4,5,6};
    int[]y= {1,2,7,9};
    int[] result = merge(x,y);
    
    for(int i = 0; i < result.length; i++){
        System.out.println(result[i]);
    }
    
    
    }
    
    
    //fin posteriores
}
