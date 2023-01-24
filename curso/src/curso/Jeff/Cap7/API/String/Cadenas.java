//https://www.arquitecturajava.com/java-new-string-y-la-creacion-de-objetos/
//https://www.aprenderaprogramar.com/index.php?option=com_content&view=article&id=961:stringbuffer-stringbuilder-java-ejemplo-diferencias-entre-clases-criterios-para-elegir-metodos-cu00914c&catid=58&Itemid=180#:~:text=Vamos%20a%20enumerar%20las%20principales,ocurre%20con%20StringBuffer%20y%20StringBuilder.
//https://www.w3resource.com/java-tutorial/string/string_contentequals.php


package curso.Jeff.Cap7.API.String;

import java.nio.charset.Charset;
import java.util.Arrays;

/**
 *
 * @author carlos
 */
public class Cadenas {
    

        
       String saludo = "hello";
       String saludo2 = new String("hello");
       
       
       public void bytes(){
           //Entero con signo 8 bits de -128 a 128
           byte[] b = saludo.getBytes();
           System.out.println(b[0]+" "+Arrays.toString(b));
           byte[] ascii = new byte[]{ 65, 66, 67, 68, 69, 70 };
           
           String s = new String(ascii);
           System.out.println(s);
           
           System.out.println("Java String(byte[] bytes, Charset charset) Constructor");
           System.out.println(new String(ascii, Charset.forName("ASCII")));
          
           System.out.println("Java String(byte[] bytes, int offset, int length) Constructor");
           System.out.println(new String(ascii,2,3));
           
           System.out.println("Java String(byte[] bytes, int offset, int length, Charset charset) Constructor");
           String st = new String(ascii,1,2,Charset.forName("ASCII"));
           System.out.println(st);
           
           
       //fin bytes
       
       }
       
       
        public void chars(){
           
            //Caracter unicode 16 bits \u0000 \uFFFF
            System.out.println("Java String(char[] value) Constructor");
            char[] charArray = {'j', 'a', 'v', 'a', '2', 's', '.', 'c', 'o','m' };
            System.out.println(new String(charArray));
            
            System.out.println("Java String(char[] value, int offset, int count) Constructor");
            System.out.println(new String(charArray,6,3));
 
            
           //fin chars
        }
       
        public void codePoints(){
            //Entero de 16 bits -2147483648 +2147483648
            int[] bytes = new int[]{65,66,67,68};
            System.out.println("Java String(int[] codePoints, int offset, int count) Constructor");   
            System.out.println(new String(bytes, 1, 2));
            
            
            
            
           //fin codePoints
        }
        
        
        /**
         * Metodos para selecionar <br/>
         * parte de una cadena, etc.
         */
        public void encontrar(){
            
            String pri = "casa en el pueblo";
            String seg = "Casa en el pueblo";
   
            String strOb1 = "java2s.com";
            System.out.println(strOb1);
            
            System.out.println("Java String.charAt(int index)");
            System.out.println("Char at index 3 '"+strOb1.charAt(3)+"'");
            
            System.out.println("Java String.codePointAt(int index)");
            int retval = strOb1.codePointAt(2);
            System.out.println("Character (unicode point) = "+retval);
            int[] bo = new int[]{retval};
            System.out.println(new String(bo,0,1));
            
            System.out.println("Java String.codePointBefore(int index)");
            int ret = strOb1.codePointBefore(2);
            System.out.println("Character before "+ret);
            int[] b = new int[]{ret};
            System.out.println(new String(b,0,1));
            
            System.out.println("Java String.contains(CharSequence s)");
            System.out.println("Se usa para verificar si y solo si una cadena contiene la secuencia especificada de valores de caracteres.");
            System.out.println("Contiene 'el' seg =>"+ seg.contains("el"));
            
            
            System.out.println("Java String.copyValueOf(char[] data)");
            System.out.println("Se usa para crear una cadena que representa la secuencia de caracteres en la matriz especificada.");
            char[] arr_num = new char[] { '1', '2', '3', '4' };
            System.out.println(Arrays.toString(arr_num));
            String arr_string = String.copyValueOf(arr_num,0,2);
            System.out.println(arr_string);
            
            
            System.out.println("Java String.endsWith(String suffix)");
            System.out.println("Se usa para verificar si una cadena específica termina con el sufijo especificado.");
            System.out.println("SEG acaba con 'eblo' "+ seg.endsWith("eblo"));
            
            
            System.out.println("Java String.getBytes()");
            System.out.println("se usa para codificar una cadena específica en una secuencia de bytes usando \n"
                    + " el conjunto de caracteres con nombre, almacenando el resultado en una nueva matriz de bytes.");
            System.out.println("SEG => "+   Arrays.toString(seg.getBytes()));
            
            
            
            
            System.out.println("Java String.getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)");
            System.out.println("Se usa para copiar caracteres de una cadena determinada en la matriz de caracteres de destino.\n" +
            "El primer carácter que se copiará está en el índice srcBegin; el último carácter que se copiará está \n"+ 
            " en el índice srcEnd-1 (por lo tanto, el número total de caracteres que se copiarán es srcEndsrcBegin).");
            System.out.println("SEG => "+ seg);
            char[] getChars = new char[10];
            seg.getChars(0, 3, getChars, 2);
            System.out.println(Arrays.toString(getChars));
            
            
            System.out.println("Java String.indexOf(int ch)");
            System.out.println("Java String.lastIndexOf(int ch, int fromIndex)");
            System.out.println("Java String.indexOf(String str)");
            System.out.println("Devuelve el índice dentro de esta cadena de la primera aparición del carácter especificado");
            System.out.println("Las letras 'pue' en SEG se encuentra en el indice => " + seg.indexOf("pue",0));//indice por el que empezar
     
            System.out.println("Java String.lastIndexOf(int ch)");
            System.out.println("Java String.lastIndexOf(int ch, int fromIndex)");
            System.out.println("Devuelve el índice dentro de esta cadena de la última aparición del carácter especificado. ");
            System.out.println(seg);
            System.out.println("La última aparición de 'a'");
            System.out.println(seg.lastIndexOf("a"));
            
            
            
            System.out.println("Java String .contentEquals ( CharSequence cs)");
            System.out.println("Es verdadero si y solo si esta cadena representa la misma secuencia \n"
                    + "de valores de caracteres que la secuencia especificada.");
            System.out.println("Diferencia mayusculas seg => "+ seg.contentEquals("Pueblo"));
            
            
            //fin encontrar
            
        }
        
        /**
         * Metodos para comparar <br/>
         * cadenas.
         */
        public void compararCadenas(){
            
            
            String pri = "casa en el pueblo";
            String seg = "Casa en el pueblo";
            
            
            System.out.println("Java String(String original) Constructor");
            String s1 = "hola";
            String s2 = new String("hola");
            
            System.out.println("¿ s1 contiene los mismos datos que s2 ? ");
            System.out.println(s1.equals(s2));
            System.out.println("¿ Son el mismo objeto ?" );
            System.out.println( s1 == s2);
            
            
            System.out.println("Java String.compareTo(String anotherString)");
            System.out.println("Compara dos cadenas lexicográficamente");
            System.out.println("El valor 0 si la cadena del argumento es igual a esta cadena.");
            System.out.println("Un valor menor que 0 si esta cadena es lexicográficamente menor que el argumento de la cadena.");
            System.out.println("Un valor mayor que 0 si esta cadena es lexicográficamente mayor que el argumento de cadena.");
            System.out.println("Cadenas a comparar");
            
            System.out.println(pri);
            
            System.out.println(seg);
            System.out.println(pri.compareTo(seg));
            
            System.out.println("Java String.equals(Object anObject)");
            System.out.println("se usa para comparar una cadena dada con el objeto especificado. \n "
                    + "El resultado es verdadero si y solo si el argumento no es nulo y es un objeto \n "
                    + "String que representa la misma secuencia de caracteres que este objeto.\n"
                    + " también tenemos Java String .equalsIgnoreCase ( String anotherString)");
            System.out.println("SEG equals PRI" + pri.equals(seg));
            
            //fin compararCadenas
        }
        
        /**
         * Metodos varios para trabajar <br/>
         * las cadenas.
         */
        public void trabajarCadenas(){
            
            String pri = "casa en el pueblo";
            String seg = "Casa en el pueblo";
            
            
            System.out.println("Método joined, une secuencias de cadenas por un delimitador.");
            String unir = String.join("/", "01","10","2020");
            System.out.println(unir);
            
            System.out.println("Java String.replaceAll (String regex, reemplazo de cadena)");
            String nueva = pri.replace("en el ", "del ");
            System.out.println(nueva);
            
            System.out.println("Java String.split (cadena expresión regular)");
            System.out.println("Divide un string por la expresión regular dada. \n"
                    + " Devuelve Array String");
            String exp = " ";
            String[] spli = pri.split(exp);
            System.out.println(spli[0]);
            System.out.println(spli[1]);
            System.out.println(spli[2]);
            System.out.println(spli[3]);
            System.out.println(Arrays.toString(spli));
            
            System.out.println("Java String.startsWith (prefijo de cadena)");
            System.out.println("Indica si una cadena comienza con \n"
                    + " la secuencia pasada.");
            System.out.println("PRI comienza con casa");
            System.out.println(pri.startsWith("casa"));
            System.out.println("Podemos señalar por donde comenzar, en este caso 5 posiciones");
            System.out.println(pri.startsWith("en", 5));
                    
            System.out.println("Java String.subSequence(int beginIndex, int endIndex)");
            System.out.println("Devuelve una cadena desde el punto de inicio al de fin");
            CharSequence x = pri.subSequence(1,3);
            System.out.println(x);
            
            System.out.println("Java String.substring(int beginIndex)");
            System.out.println("Devuelve una cadena que es una subcadena de esta cadena. \n"
                    + "La subcadena comienza con el carácter en el índice especificado \n"
                    + " y se extiende hasta el final de esta cadena.");
                
            String xs = pri.substring(1,3);
            System.out.println(xs);
            
            System.out.println("Java String.toCharArray()");
            System.out.println("El método toCharArray() convierte una cadena determinada en una \n"
                    + " nueva matriz de caracteres.");
            char[] ch = pri.toCharArray();
            System.out.println(ch);
            System.out.println(ch[3]);
            
            System.out.println("Java String.toLowerCase()");
            String up = pri.toUpperCase();
            System.out.println(up);
            
            System.out.println("Cadena Java.trim()");
            System.out.println("El método trim() se usa para obtener una cadena cuyo valor \n"
                    + "es esta cadena, con cualquier espacio en blanco inicial y final eliminado.");
            System.out.println(" Soy una cadena con espacios en blanco inicio y fin ");
            String ori = " Soy una cadena con espacios en blanco inicio y fin ";
            System.out.println("Longitud de la cadena sin trim "+ ori.length());
            System.out.println("Despues pasar por trim");
            System.out.println(ori.trim().length());
            
            
            System.out.println("Cadena Java: método valueOf()");
            System.out.println("El método valueOf() se usa para obtener la representación de cadena del argumento char."
                    + " una cadena de longitud 1 que contiene como único carácter el argumento c.");
            
                int z = 10;
		Integer a = Integer.valueOf(z);
		Integer b = Integer.valueOf("1024");
		Integer c = Integer.valueOf("1BC",16);
		Double d = Double.valueOf(b);
		Float e = Float.valueOf(a);

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
                
                
                   
            //fin trabajarCadenas
        }
        
        
        
        
        public void miString(){
            
            
            String pri = "casa en el pueblo";
            String seg = "Casa en el pueblo";
            /*
            
            
            String strOb1 = "java2s.com";
            System.out.println(strOb1);

            System.out.println("Java String.codePointCount(int beginIndex, int endIndex)");
            int ret2 = strOb1.codePointCount(1,6);
            System.out.println("El número de puntos de código Unicode en el rango de texto especificado."+ret2);
            

            System.out.println("Java String .compareToIgnoreCase ( String str)");
            System.out.println("Ignorando las diferencias entre mayúsculas y minúsculas.");
            System.out.println(pri.compareTo(seg));
            
            System.out.println("Java String.concat(String str)");
            String str3  = pri.concat(seg);
            System.out.println(str3);

            System.out.println("Metodo format de clase String");
            System.out.println("Mostramos 810 en hexadecimal. = "+ String.format("%x", 810));

            System.out.println("Java String.hashCode()");
            System.out.println("Se usa para obtener un código hash de una cadena determinada. \n"+
            "El código hash para un objeto String se calcula como:");
            
            
            
            System.out.println("Java String.matches(String regex)");
            System.out.println("Indica si esta cadena coincide o no con la expresión regular dada.");
            //http://puntocomnoesunlenguaje.blogspot.com/2013/07/ejemplos-expresiones-regulares-java-split.html
            //https://spa.myservername.com/java-regex-tutorial-with-regular-expression-examples
            
            
            
            System.out.println("Java String.intern()");
            System.out.println("Pasante de Java String () se usa para obtener la cadena de la memoria si ya existe. \n"
                    + " Este método asegura que todos mismas cuerdas comparten la misma memoria. \n"
                    + "Por ejemplo, crear una cadena “hola” 10 veces con el método intern () \n"
                    + "garantizaría que solo haya una instancia de “Hola” en la memoria y que las 10 referencias apunten a la misma instancia.");
            
        String str1 = "Hello";
		
	//Java automatically interns this	
	String str2 = "Hello";
        
		
	//This is same as creating string using string literal		
	String str3 = str2.intern();//"Hello".intern();
		
	//This will create a new instance of "Hello" in memory
	String str4 = new String("Hello");
        
	if ( str1 == str2 ){System.out.println("String str1 and str2 are same");}

	if ( str2 == str3 ){System.out.println("String str2 and str3 are same" );}

	if ( str1 == str4 ){
	    //This will not be printed as the condition is not true
	    System.out.println("String str1 and str4 are same" );  
	}

	
        */
        
        
        
        
        
        
        
        
        
        
        
         //fin miString   
        }
       
        
        
    
    
}
