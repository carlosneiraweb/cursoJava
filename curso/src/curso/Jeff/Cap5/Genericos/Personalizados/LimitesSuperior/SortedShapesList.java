
package curso.Jeff.Cap5.Genericos.Personalizados.LimitesSuperior;

/**
 *
 * @author carlos
 */
public class SortedShapesList <S extends Shape & Comparable<S>>{
 
    
     @SuppressWarnings("unchecked")
    private S[] shapes = (S[]) new Shape[2];
    private int index = 0;
    
    void add(S shape){
        
        shapes[index++] = shape;
        if(index < 2)
            return;
        System.out.println("Before sort: " + this);
        sort();
        System.out.println("After sort: "+ this);
    }
    
    
    private void sort(){
        
        if(index == 1)
            return;
        
        if(shapes[0].compareTo(shapes[1]) > 0){
            
            S shape = (S) shapes[0];
            shapes[0] = shapes[1];
            shapes[1] = shape;
            
        }
        
    }
   
   @Override
   public String toString(){
       return shapes[0].toString() + " "+shapes[1].toString();
   }
    
    
    //fin SortedShapeList
}
