/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesInternas.ClaseInterna.Static;

/**
 *
 * @author carlos
 */
public class OuterClass {
   
    String outerField = "Outer Field";
    static String staticOuterField = "Static outer fiel";
    
    class InnerClass{
       
        void accessMembers(){
            System.out.println(outerField);
            System.out.println(staticOuterField);
        }
    }
    
    static class StaticNestedClass{
        
        void accessMembers(OuterClass outer){
           // System.out.println(outerField);
            System.out.println(outer.outerField);
            System.out.println(staticOuterField);
        }
        
    }
    
    public static void main(String[] args) 
    {
        System.out.println("Inner class:");
        System.out.println("------------");
        OuterClass outerObject = new OuterClass();
        OuterClass.InnerClass innerObject = outerObject.new InnerClass();
        innerObject.accessMembers();

        System.out.println("\nStatic nested class:");
        System.out.println("--------------------");
        StaticNestedClass staticNestedObject = new StaticNestedClass();        
        staticNestedObject.accessMembers(outerObject);
               
        
        System.out.println("\nTop-level class:");
        System.out.println("--------------------");
        TopLevelClass topLevelObject = new TopLevelClass();        
        topLevelObject.accessMembers(outerObject);                
    }

   
    //fin OuterClass
}
