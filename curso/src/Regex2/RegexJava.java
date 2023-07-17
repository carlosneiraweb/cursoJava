/*333333
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Regex2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.regex.*;

/**
 *
 * @author carlos
 */
public class RegexJava {

    /**
     * Metodo que comprueba un patron contra un string
     *
     * @param patron type String
     * @param cadena type String
     */
    public void match(String patron, String cadena) {

        Pattern pat = Pattern.compile(patron);
        Matcher mat = pat.matcher(cadena);
        
           
        if (mat.matches()) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }

        //fin match
    }

    /**
     * Metodo que tiene un estring <br>
     * con emails mezclados.
     */
    public void buscarEmails() {

        String[] listaTextos = {
            "¡Hola Mundo!",
            "miCorreo@gmail.com",
            "La teoría de 'Pattern Machine' dice…",
            "correoFalso@yahoo.es",
            "En un lugar de la Mancha, cuyo nombre no quiero acordarme…",
            "+34 91 123 456 789",
            "estoNOesUnCorreoNoTieneArroba.com",
            "RaMoN@jarroba.com",
            "Calle Alcalá 12345 Madrid, Madrid"
        };

        String regex = "[A-Za-z]+@[a-z]+\\.[a-z]+";
        Pattern patron = Pattern.compile(regex);

        for (String texto : listaTextos) {
            Matcher emparejador = patron.matcher(texto);
            boolean esCoincidente = emparejador.find();

            if (esCoincidente) {
                System.out.println("Correo reconocido: " + texto);
            }
        }

        //fin buscarEmails  
    }

    /**
     * Recupera el valor encontrados con el patron
     * con nombre
     */
    public void mostrarEncontrados() {

        String pattern = ";(?<foo>\\d{6});(?<bar>\\d{6});";
        Pattern regex = Pattern.compile(pattern);
        String x = ";123456;123456;";
        Matcher matcher = regex.matcher(x);
        boolean success = matcher.find();

        String foo = success ? matcher.group("foo") : null;
        String bar = success ? matcher.group("bar") : null;
        System.out.println(foo + bar);

       
        //fin mostrarEncontrados     
    }

    /**
     * Ejemplos metodo group
     * 
     */
    public void ejemplosGroup() {

        String cadena = "Es es y es el ess e os oss esss eos es oes uuus";
        //String patron =".*[eo]s.*";
        //String patron ="[^eo]s";
        String patron = "(es)";
        Pattern pat = Pattern.compile(patron);
        Matcher mat = pat.matcher(cadena);
        String prueba;
        mat.find();
        prueba = mat.group(1);

        System.out.println("Valor guardado " + mat.group(0));
        System.out.println("Valor guardado " + mat.group(1));
        //System.out.println("Valor guardado " + mat.group(2));
        //System.out.println("Valor guardado " + mat.group(3));

        
        
        String pattern = "href=(.+?)\\.(.+)\\.(.+)";
        String url = "href=www.google.es";
        Matcher matcher = Pattern.compile(pattern).matcher(url);
        matcher.find();
        System.out.println(matcher.group());
        System.out.println(matcher.group(1));
        System.out.println(matcher.group(2));
        System.out.println(matcher.group(3));


        
       
        
        //fin ejemplosGroup
    }
    
    
    /**
     * Busca y muestra las coincidencias
     */

    public void busquedaCoincidencia() {

        String[] listaTexto = {
            "¡Hola Mundo!",
            "miCorreo@gmail.com",
            "La teoría de 'Pattern Machine' dice…",
            "correoFalso@yahoo.es",
            "En un lugar de la Mancha, cuyo nombre no quiero acordarme…",
            "+34 91 123 456 789",
            "estoNOesUnCorreoNoTieneArroba.com",
            "RaMoN@jarroba.com",
            "Calle Alcalá 12345 Madrid, Madrid"

        };

        String patron = "[A-Za-z]+@[a-z]+\\.[a-z]+";
        Pattern pt = Pattern.compile(patron);
        for (String txt : listaTexto) {
            Matcher emp = pt.matcher(txt);

            boolean bo = emp.find();

            if (bo) {
                System.out.println("Correo" + txt);
            }
        }

       

        //fin busquedaCoincidencia
    }

    /**
     * Reemplazamos todo lo que este fuera de las variables asignadas en el<br>
     * patron. Si no hay coincidencia devuelve el String pasado al metodo<br>
     * matcher
     */
    public void reemplazo() {

        String regex = "(\\d+) de (\\w+) de (\\d+) s";
        Pattern pt = Pattern.compile(regex);

        String txt = "30 de Enero de 2015 s";
        Matcher mt = pt.matcher(txt);

        mt.find();

        String sustitucion = "$1-$2-$3 ";

        String result = mt.replaceAll(sustitucion);
        System.out.println("EL resultado es " + result);

        //fin reemplazo
    }

    /**
     * Ejemplo de Separacion Extracion
     */
    public void guardarEnVariables() {

        String regex = "(\\d+) de (\\w+) de (\\d+)";
        Pattern pat = Pattern.compile(regex);

        String txt = "30 de Enero de 2015";
        Matcher mat = pat.matcher(txt);

        mat.find();
        
        String st1 = mat.group(1);
        String st2 = mat.group(2);
        String st3 = mat.group(2);
        
        System.out.println("El contenido en la variable $1 es : "+ st1 +
                            " EL contenido en la variable $2 es: "+st2 +
                            " El contenido en la variable $s3 es: "+st3 );

        

        //separarExtraer    
    }
    
    
    
    /**
     * Contamos el numero de coincidencias
     */
    
    public void contarCoincidencias(){
        
    String rgx = ".s.";
    String txt= "asa ese aca iso ala oso ato";
    
    //Pattern pt = Pattern.compile(rgx);
    Matcher mc = Pattern.compile(rgx).matcher(txt);
    StringBuilder dv = new StringBuilder();
    
    int num = 0;
    
    while(mc.find()){
        dv.append("\n Palabra \""+ mc.group()+ "\"  encontrada en la posicion "+ mc.start() );
        
         num++;
    }
        
     dv.insert(0, "El numero de apariciones es "+num);
        System.out.println(dv.toString());  
        
        
        
    //fin   contarCoincidencias      
    
    }
    
    
    

//fin RegexJava 
}
