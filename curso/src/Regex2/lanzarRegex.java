/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Regex2;
//https://jarroba.com/busqueda-de-patrones-expresiones-regulares/
//http://puntocomnoesunlenguaje.blogspot.com/2013/07/ejemplos-expresiones-regulares-java-split.html
/**
 *
 * @author carlos
 */
public class lanzarRegex {
    
    
    
    
    public static void main(String[] args){
    
     
    String cadena1 = "Los ñiños del año pasado no pudieron estudiar mucho";    
        
        
        
        RegexJava rgx = new RegexJava();
        //rgx.match(".{1}os.*"    ,cadena1);
        //rgx.buscarEmails();
        //rgx.ejemplosGroup();
        //rgx.mostrarEncontrados();
        //rgx.busquedaCoincidencia();
        //rgx.reemplazo();
        //rgx.guardarEnVariables();
        //rgx.contarCoincidencias();
        
        
        
        ////////////////EJEMPLOS/////////////////
        
        ejemplosExpresiones ej = new ejemplosExpresiones();
        
        
        String txt = "abc abd adf bda abe dsa";
        //ej.contienePatron(txt);
        //ej.operadoresLogicos();
        //ej.parentesisCorchetes();
        
        
        RegexTestHarness rt = new RegexTestHarness();
        //rt.TextHarness();
        
        /////////CLASE MACHER///////////////
        MatcherDemo md = new MatcherDemo();
        //md.startEnd();
        
        //md.MatchesLookingAt();
        //md.replaceFirstReplaceAll();
        //md.appendReplacementAppendTail();
        //md.hitENd();
        //md.regionEnd();
    } 
    
}
