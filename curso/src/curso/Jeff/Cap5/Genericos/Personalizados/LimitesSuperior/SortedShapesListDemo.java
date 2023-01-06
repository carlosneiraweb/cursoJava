/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.Jeff.Cap5.Genericos.Personalizados.LimitesSuperior;


/**
 *
 * @author carlos
 */
public class SortedShapesListDemo {
    
    
    
    public static void main(String []args){
        
        
        SortedShapesList<Circle> ssl = new  SortedShapesList<>();
        ssl.add(new Circle(100,200,300));
        ssl.add(new Circle(10,20,30));
        SortedShapesList<Triangulo> sst = new SortedShapesList<>();
        sst.add(new Triangulo(10,20,30));
        sst.add(new Triangulo(0,5,1));
        
        
        


    }

    
    
    
    
    //fin SortedShapesListDemo
}
