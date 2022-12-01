/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.Jeff.Cap3.Clone.Equals;

/**
 *
 * @author carlos
 */
public class MetodoEquals {
    
    private int x,y;

    public MetodoEquals(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
 
    @Override public boolean equals(Object o){
        if(o == this){return true;}
        if(!(o instanceof MetodoEquals))
            return false;
        MetodoEquals m = (MetodoEquals) o;
        return m.x == x && m.y == y;
        
    }
    
    public static void main(String[] args){
    
        
      MetodoEquals m1 = new MetodoEquals(10, 20);
      MetodoEquals m2 = new MetodoEquals(20, 30);
      MetodoEquals m3 = new MetodoEquals(10, 20);
      
      
        System.out.println("Comprobamos reflexivilidad");
        System.out.println(m1.equals(m2));
        System.out.println("Comprobamos simetria");
        System.out.println(m1.equals(m2));
        System.out.println(m2.equals(m1));   
        System.out.println("Comprobamos transitividad");
        System.out.println(m2.equals(m3));
        System.out.println(m1.equals(m2));
        System.out.println("Comprobamos los nulos");
        System.out.println(m1.equals(null));
        System.out.println("Comprobar la utilidad del operador instanceof");
        System.out.println(m1.equals("abc"));
        
        
        
        
        
        
        
    } 
    
    
    //fin MetodoEquals
}
