/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.Jeff.Cap4.ClasesInternas;



/**
 *
 * @author carlos
 */
public abstract class InternaStatic {
   
    public abstract double getX(); 
    public abstract double getY();
    public abstract double getWidth();
    public abstract double getHeight();
    
    public static class Double extends InternaStatic{
        
        private double x,y,width,height;
            
            public Double(double x, double y, double width, double height){
                this.x = x;
                this.y = y;
                this.width = width;
                this.height = height;

            }

        public double getX(){return x;}
        public double getY(){return y;}
        public double getWidth(){return width;}
        public double getHeight(){return height;}

       
        
    }
    
    public static class Float extends InternaStatic{
        
        private float x,y,width,height;
        
            public Float(float x, float y, float width, float height){
                this.x = x;
                this.y = y;
                this.width = width;
                this.height = height;
            }
            
        public double getX(){return x;}
        public double getY(){return y;}
        public double getWidth(){return width;}
        public double getHeight(){return height;}
  
    }
    
   private InternaStatic(){}
   public boolean contains(double x, double y){
       return (x >= getX() && x < getX()+getWidth()) && 
         (y >= getY() && y < getY()+getHeight());
   }
   
   public static void main(String[] args){
       InternaStatic.Double x = new InternaStatic.Double(10.0, 10.0, 20.0, 30.0);
       
       InternaStatic r = new InternaStatic.Double(10.0, 10.0, 20.0, 30.0);
       System.out.println("x = "+ r.getX());
       System.out.println("y = "+ r.getY());
       System.out.println("width = "+ r.getWidth());
       System.out.println("height = "+ r.getHeight());
       System.out.println("contains(15.0,15.0) = " + r.contains(15.0, 15.0));
       System.out.println("contains(0.0,0.0) = " + r.contains(0.0, 0.0));
       System.out.println();
       
       r = new InternaStatic.Float(10.0f, 10.0f, 20.0f, 30.0f);
       System.out.println("x = "+ r.getX());
       System.out.println("y = "+ r.getY());
       System.out.println("width = "+ r.getWidth());
       System.out.println("height = "+ r.getHeight());
       System.out.println("contains(15.0,15.0)) ="  + r.contains(15.0, 15.0));
       System.out.println("contains(0.0,0.0) = " + r.contains(0.0, 0.0));
      
       
           
          
       
   }
   
   
}
