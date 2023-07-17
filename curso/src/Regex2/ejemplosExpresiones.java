/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Regex2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author carlos
 */
public class ejemplosExpresiones {
    
    /**
     * Metodo que nos indica si el patron <br>
     * "abc" esta en el String pasado <br>
     * @param st 
     */
    public void contienePatron(String st){
        
        /*
        System.out.println("Comprobar si el String cadena empieza por \"abc\" ó \"Abc\"=> ^[aA]bc.*" );
        System.out.println(" Comprobar si el String cadena está formado por un mínimo \n"+
                " de 5 letras mayúsculas o minúsculas y un máximo de 10 => "+"[a-zA-Z]{5,10}");
        
        System.out.println("Comprobar si el String cadena no empieza por un dígito => ^[^\\d].*");
        System.out.println("Comprobar si el String cadena no acaba con un dígito => .*[^\\d]$");
        System.out.println("Comprobar si el String cadena solo contienen los caracteres a ó b => (a|b)+");
        System.out.println("Comprobar si el String cadena contiene un 1 y ese 1 no está seguido por un 2 => .*1(?!2).*");
        System.out.println("");
        
        */
        
        
        
        
    //fin contienePatron    
    }
    
    
    /**
     * Operadores logicos
     */
    public void operadoresLogicos(){
        
        System.out.println("patron1 o patron2 => \\patron1|patron2\\ regex=>'~ojo|a.a~' cadena => (ojo aca ojo sal ojo ada)");   
        String st = "ojo aca ojo sal ojo ada";
        String rg = "ojo|a.a";
        
        Matcher mt = Pattern.compile(rg).matcher(st);
        //mt.find();
        //System.out.println(mt.group(0));
        while(mt.find()){
            System.out.println("valor "+mt.group());
        }
        
        
        System.out.println("");
        System.out.println("""
                           Encuentra patron1 solo si le sigue patron2.
                           patron2 no formará parte del resultado encontrado.
                           Patron => ojo (?=cuidado)
                           Para que forme parte usar este patron ojo .*(?=cuidado) 
                           Texto => ojo hoja ojo cuidado ojo por la noche ojo cuidado
                           """);
        String rg2 = "ojo .*(?=cuidado)";
        String txt2 = "ojo hoja ojo cuidado ojo por la noche ojo cuidado";
        
        Matcher mc = Pattern.compile(rg2).matcher(txt2);
        boolean bo = mc.find();
        if(bo){System.out.println("Encontrado "+mc.group());}
        
        
        
        System.out.println("");
        System.out.println("""
                           Encuentra patron1 solo si no le sigue patron2. 
                           patron2 no formará parte del resultado encontrado.
                           Patron => ojo (?=!uidado)
                           Texto => ojo hoja ojo cuidado ojo por la noche.
                           """);
        
        String txt3 = "ojo hoja ojo cuidado ojo por la noche";
        String rg3 = "ojo .* (?!cuidado)";
        Matcher mt3 = Pattern.compile(rg3).matcher(txt3);
        boolean bo2 = mt3.find();
        if(bo2){System.out.println("Valor devuelto "+mt3.group());}
        
        
        //fin operadoresLogicos
    }
    
    /**
     * Diferencia entre () y []
     */
    
    public void parentesisCorchetes(){
        
        
        /*
        System.out.println("""
                           [patron]	Encuentra cualquier carácter de este conjunto.
                           [^patron]	Encuentra cualquier carácter que no esté en este conjunto

                           """);
        System.out.println("Es es el ess e os oss esss eos oes uuus");
        System.out.println("Regex 	/[eo]s/");

        String rg = "[eo].*\\s";
        String cadena = "Eses eless e os oss esss eos oes uuus";
        
        
        Matcher mt = Pattern.compile(rg).matcher(cadena);
        
        while(mt.find()){
            System.out.println(mt.group());
        }
        */
        
        System.out.println("Encuentra lo que está entre paréntesis y lo guarda en variables $1,$2 etc.");
        System.out.println("guardaAguardaB");
        System.out.println("Patron (guarda.)(guarda.)");
        
        String cad = "guardaAguardaB";
        String reg2 = "(guarda.)(guarda.)";
        
        Matcher mt2 = Pattern.compile(reg2).matcher(cad);
        
        String a = "";
        String b ="";
        
        if(mt2.find()){
            
            a = mt2.group(1);
            b = mt2.group(2);
            
        }
        
        System.out.println(a);
        System.out.println(b);
        
    //fin parentesisCorchetes    
    }
    
    //fin ejemplosExpresiones
    
}
