/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia.Redifinicion;

/**
 *
 * @author Carlos
 */
public class Rectangle extends Shape{
    
    private String radius;
    private int l1,l2,l3,l4;
    public String rectangulo ="Soy un rectangulo";

    public Rectangle(String radius, int l1, int l2, int l3, int l4, String saludos) {
        super(saludos);
        this.radius = radius;
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
        this.l4 = l4;
    }

    

    public String getRadius() {
        return radius;
    }

    public void setRadius(String radius) {
        this.radius = radius;
    }

    public int getL1() {
        return l1;
    }

    public void setL1(int l1) {
        this.l1 = l1;
    }

    public int getL2() {
        return l2;
    }

    public void setL2(int l2) {
        this.l2 = l2;
    }

    public int getL3() {
        return l3;
    }

    public void setL3(int l3) {
        this.l3 = l3;
    }

    public int getL4() {
        return l4;
    }

    public void setL4(int l4) {
        this.l4 = l4;
    }
    
    
    public void pintoRectangulo(){
       System.out.println("Pinto rectangulo"); 
    }

    
    @Override
    public String toString(){
        return "mi radio es "+this.radius+ " mis lados mide "+this.l1+ " "+this.l2+
                " "+this.l3+" "+this.l4+ " "+this.saludos;
    }
    
    /**
     *  Metodo draw de Rectangle
     */
    @Override
    void draw(){
        
        System.out.println("Soy un rectangulo con radius "+toString());
        
    }
    
   
    
}
