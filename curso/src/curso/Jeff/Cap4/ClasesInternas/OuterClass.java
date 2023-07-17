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
public class OuterClass {
    public String saludoPublicOuter = "Saludo public";
    protected String StringProtected = "saludo protected";
    static String estaticoOuter ="soy outer y estatico";
    public String Saludo = "Saludos outer";
    
    public static class NestedStaticClass extends OuterClass{ // Outer class
        public String SaludosInner = "Saludos INNER";
        public String Saludo = "Saludos inner";
        static String estaticoInner = "Soy estatico Inner";
        
        public void my_method() {        //Inner class
            System.out.println("This is a static nested class.");
        }
    }

    
    
    
    
    public static void main(String args[]) { // Main function
        

        OuterClass ou = new OuterClass();
        System.out.println(ou.saludoPublicOuter);
        System.out.println(ou.StringProtected);
        System.out.println(OuterClass.estaticoOuter);
        System.out.println();
        
        OuterClass ouc = new OuterClass.NestedStaticClass(); //Si no la extiende no es posible
        System.out.println(ouc.StringProtected);
        System.out.println(ouc.saludoPublicOuter);
        System.out.println(ouc.Saludo);
        System.out.println();
       
        System.out.println(OuterClass.NestedStaticClass.estaticoInner);
        System.out.println(OuterClass.NestedStaticClass.estaticoOuter);//si no la extiende no es posible
        System.out.println();
        
        //object of nested class
        NestedStaticClass ob = new NestedStaticClass();
        ob.my_method();
        System.out.println(ob.Saludo);
        System.out.println(ob.SaludosInner);
        
        
    }

    
    
    
}
