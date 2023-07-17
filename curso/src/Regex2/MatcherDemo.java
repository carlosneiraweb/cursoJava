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
public class MatcherDemo {
  
 
    
/**
 * Start<br>
 * Devuelve el índice de inicio de la coincidencia anterior.<br>
 * 
 * End <br>
 * Devuelve el desplazamiento después del último <br>
 * carácter coincidente.
 */    
public void  startEnd(){
    
String regex = "\\bdog\\b";
String input = "dog dog dog doggie dogg";


Pattern p = Pattern.compile(regex);
Matcher m = Pattern.compile(regex).matcher(input);

//Matcher m = p.matcher(input);
int count = 0;

while(m.find()){
    count++;
    System.out.println("Match number "+count);
    System.out.println("start() : " + m.start());
    System.out.println("end() : "+ m.end());
}
    
  
    //fin startEnd
}   

/**
 * LookingAt <br>
 * Intenta hacer coincidir la secuencia de entrada, <br>
 * comenzando por el principio de la región, con el patrón.
 */
public void MatchesLookingAt(){
    
    String regex = "foo";
    String input = "foo"; //ooooooooooooooo";
    
    Matcher mt = Pattern.compile(regex).matcher(input); //CASE_INSENSITIVE=> 64
    
    System.out.println("""
                       Ejemplo con 
                        Pattern.compile(regex).matcher(input).matches();""");
    System.out.println(Pattern.compile(regex).matcher(input).matches());
    System.out.println("");
    System.out.println("Ejemplo con Pattern.matches(regex, input);");
    System.out.println(Pattern.matches(regex, input));
    System.out.println("");
    
    
    System.out.println("Current regex is : "+ regex);
    System.out.println("Current input is :" +input);
    
    System.out.println("LookingAt() " + mt.lookingAt());
    System.out.println("matches() : "+ mt.matches());
    mt.reset();
    System.out.println(mt.find()+ mt.group());
     
    System.out.println("Ejemplo con metodo Matches mt.find() ");
    System.out.println("nos devuelve el string de la coincidencia "
            + " y Matcher tiene los metodo group, end,etc ");
    
    
    //MatchesLookingAt
}

/**
 * ReplaceFirst<br>
 * Reemplaza la primera subsecuencia de la secuencia <br>
 * de entrada que coincide con el patrón con la cadena<br>
 * de reemplazo dada.<br>
 * 
 * ReplaceAll<br>
 * Reemplaza cada subsecuencia de la secuencia de entrada<br>
 * que coincida con el patrón con la cadena de reemplazo dada.
 */
public void replaceFirstReplaceAll(){
    
    String regex ="dog";
    String input = "The dog says meow. All dogs say meow.";
    String replace = "cat";
    
    Pattern p = Pattern.compile(regex);
    Matcher m = p.matcher(input);
    input = m.replaceAll(replace);
    System.out.println(input);
    
    String reg = "a*b";
    String inp = "aabfooaabfooabfoob";
    String rpl = "-";
    
    Pattern pt = Pattern.compile(regex);
    Matcher mc = p.matcher(input);
    inp = m.replaceFirst(rpl);//solo cambia la primera coincidencia
    System.out.println(inp);
    

    //fin replaceFirstReplaceAll
}
    
 /**
  * AppendReplacement<br>
  * Implementa un paso de agregar y reemplazar sin terminal.<br>
  * 
  * AppendTail<br>
  * Implementa un paso de agregar y reemplazar terminal.
  * 
  */  
 public void appendReplacementAppendTail(){
     
     
    String regex = "a*b";
    String inpunt = "aabfooaabfooabfoob";
    String replace = "-";
    
    Pattern p = Pattern.compile(regex);
    Matcher m = p.matcher(inpunt);
    StringBuffer sb = new StringBuffer();
    
    while(m.find()){
        m.appendReplacement(sb, replace);
    }
     
    m.appendTail(sb);
    
     System.out.println(sb.toString());
     
     //fin appendReplacementAppendTail
 }   
    
    
/**
 * hitEnd<br>
 * Devuelve verdadero si el motor de búsqueda <br>
 * alcanzó el final de la entrada en la última operación <br>
 * de coincidencia realizada por este comparador.
 */   
public void hitEnd(){
    
    
String rg = "Geeks";
Pattern pt = Pattern.compile(rg);
String st = "GeeksForGeeks Geeks for For Geeks Geek";

Matcher mt = pt.matcher(st);

while(mt.find()){
    
    
    System.out.println("Grupo emparejado "+mt.group());
    System.out.println("Has matching hit end "+ mt.hitEnd());
    
}
    
    System.out.println("Has matching hit end :" +mt.hitEnd());  
    
    
    //fin hitENd
}   
  

/**
 * regionEnd<br>
 * Le indicamos por donde empezar<br>
 * y donde acabar <br>
 * en el String a buscar.
 */
public void regionEnd(){
    
    String rg = "abd";
    Pattern pt = Pattern.compile(rg);
    String st = "abd dba abd dfg abd";
    Matcher mt = pt.matcher(st).region(3, st.length());
    
    while(mt.find()){
        
        mt.useAnchoringBounds(true);
        System.out.println(mt.group());
        System.out.println("Principio "+mt.start());
        System.out.println("Fin "+mt.end());
        System.out.println("Usa anclajes "+mt.hasAnchoringBounds());
    }
    //fin regionEnd
}





    //fin MatcherDemo

  
}
