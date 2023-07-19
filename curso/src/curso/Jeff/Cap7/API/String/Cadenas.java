//https://www.arquitecturajava.com/java-new-string-y-la-creacion-de-objetos/
//https://www.aprenderaprogramar.com/index.php?option=com_content&view=article&id=961:stringbuffer-stringbuilder-java-ejemplo-diferencias-entre-clases-criterios-para-elegir-metodos-cu00914c&catid=58&Itemid=180#:~:text=Vamos%20a%20enumerar%20las%20principales,ocurre%20con%20StringBuffer%20y%20StringBuilder.
//https://www.w3resource.com/java-tutorial/string/
//https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Formatter.html#syntax
package curso.Jeff.Cap7.API.String;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

/**
 *
 * @author carlos
 */
public class Cadenas {

    String saludo = "hello";
    String saludo2 = new String("hello");

    public void bytes() {
        
        //Entero con signo 8 bits de -128 a 128
        byte[] b = saludo2.getBytes();
        System.out.println(b[0] + " " + Arrays.toString(b));
        byte[] ascii = new byte[]{40, 65, 66, 67, 68, 69, 70};

        String s = new String(ascii);
        System.out.println(s);

        System.out.println("Java String(byte[] bytes, Charset charset) Constructor");
        System.out.println(new String(ascii, Charset.forName("ASCII")));

        System.out.println("Java String(byte[] bytes, int offset, int length) Constructor");
        System.out.println(new String(ascii, 2, 3));

        System.out.println("Java String(byte[] bytes, int offset, int length, Charset charset) Constructor");
        String st = new String(ascii, 1, 2, Charset.forName("ASCII"));
        System.out.println(st);

        //fin bytes
    }

    public void chars() {

        //Caracter unicode 16 bits \u0000 \uFFFF
        System.out.println("Java String(char[] value) Constructor");
        char[] charArray = {'j', 'a', 'v', 'a', '2', 's', '.', 'c', 'o', 'm'};
        System.out.println(new String(charArray));

        System.out.println("Java String(char[] value, int offset, int count) Constructor");
        System.out.println(new String(charArray, 6, 3));

        //fin chars
    }

    public void codePoints() {
        //Entero de 16 bits -2147483648 +2147483648
        int[] bytes = new int[]{65, 66, 67, 68};
        System.out.println("Java String(int[] codePoints, int offset, int count) Constructor");
        System.out.println(new String(bytes, 1, 2));

        //fin codePoints
    }

    /**
     * Metodos estaticos de clase String
     */
    public void metodosEstaticos() {

        char[] ch = new char[]{'d', 'a', 'd'};

        System.out.println("ValueOf convertimos un array en string");
        String s = String.valueOf(ch, 0, 3);
        System.out.println(s);

        System.out.println();

        System.out.println("Format");
        String nombre = "Codi";
        String apellido = "Facilito";

        String nombreCompleto = String.format("%s %s", nombre, apellido);
        System.out.println(nombreCompleto);
        System.out.println("Boolean");
        int cantidad = 10;
        boolean mayor = cantidad > 5;
        String resBoolean = String.format("La cantidad es mayor a %d : %b",
                cantidad, mayor);
        System.out.println(resBoolean);

        System.out.println("Orden de los elementos");
        String uno = "Uno";
        String dos = "Dos";
        String tres = "Tres";
        String resOrden = String.format("%2$s - %3$s - %1$s", ch[0], dos, tres);
        System.out.println(resOrden);

        System.out.println("Calendario");
        System.out.format("Hora local: %tT", Calendar.getInstance());
        Calendar c = Calendar.getInstance();
        System.out.println();

        String ca = String.format("Cumpleaños de Duke: %1$td %1$tB,%1$tY", c);
        System.out.println("ca " + ca);

        System.out.println();
        System.out.println("Join Unimos elementos ");
        String join = String.join("-", "hola", "adios", String.valueOf(ch), null);
        System.out.println(join);

        //metodosEstaticos   
    }

    /**
     * Metodos para selecionar <br/>
     * parte de una cadena, etc.
     */
    public void encontrar() {

        String pri = "casa en el pueblo";
        String seg = "Casa en el pueblo";

        String strOb1 = "java2s.com";
        
        System.out.println("Java String.charAt(int index)");
        System.out.println("Char at index 3 '" + strOb1.charAt(3) + "'");
        System.out.println("");

        System.out.println("Java String.codePointAt(int index)");
        int retval = strOb1.codePointAt(2);
        System.out.println("Character (unicode point) = " + retval);
        System.out.println("Asignamos a un array de integer");
        int[] bo = new int[]{retval};
        System.out.println("Utilizamos un constructor String que admita arrays integers \n"
                + " ademas de oofset y count => " + new String(bo, 0, 1));
        System.out.println();

        System.out.println("Java String.codePointBefore(int index)");
        System.out.println("Nos devuelve el codePOint anterior al index");
        int ret = strOb1.codePointBefore(5);
        System.out.println("Character before " + ret);
        System.out.println("");

        System.out.println("CodePointCount devuelve el unicodePoint en el lugar indicado");
        int cod = strOb1.codePointCount(1, 5);
        System.out.println(cod);
        System.out.println();

        System.out.println("CodePOints devuelve un stream de los codePOints");

        IntStream cod2 = strOb1.codePoints();
        cod2.forEach(System.out::print);
        System.out.println();
        System.out.println();

        System.out.println("Java contains(CharSequence s)");
        System.out.println("""
                                Se usa para verificar si y solo si una cadena 
                                contiene la secuencia especificada de valores de caracteres.
                                Detecta las mayusculas 
                               """);
        StringBuffer eq = new StringBuffer("Casa");
        System.out.println("Contiene 'el' seg =>" + seg.contains(eq));
        
        System.out.println("Java String .contentEquals ( CharSequence cs)");
        System.out.println("""
                           Es verdadero si y solo si esta cadena representa la misma secuencia 
                           de valores de caracteres que la secuencia especificada.
                           Ademas compara el tipo de dato, en este caso hemos 
                           comparado un STring con StringBuffer
                           """);
        System.out.println("Diferencia mayusculas seg => " + seg.contentEquals(eq));

        System.out.println();

        System.out.println("Java String.copyValueOf(char[] data)");
        System.out.println("""
                               Se usa para crear una cadena que  
                                representa la secuencia de caracteres
                               en la matriz especificada.""");
        char[] arr_num = new char[]{'1', '2', '3', '4'};
        System.out.println(Arrays.toString(arr_num));
        System.out.println("CopyValueOf con offset y count nos devuelve un nuevo String");
        String arr_string = String.copyValueOf(arr_num, 0, arr_num.length);
        System.out.println(arr_string);
        System.out.println();

        System.out.println("Java String.endsWith(String suffix)");
        System.out.println("""
                               Se usa para verificar si una cadena 
                    específica termina con el sufijo especificado.""");
        System.out.println("SEG acaba con 'eblo' " + seg.endsWith("eblo"));
        System.out.println("");

       

        System.out.println("Java String.getBytes()");
        System.out.println("""
                        se usa para codificar una cadena específica 
                        en una secuencia de bytes usando 
                        el conjunto de caracteres con nombre, almacenando 
                        el resultado en una nueva matriz de bytes.""");
        System.out.println("SEG => " + Arrays.toString(seg.getBytes()));
        System.out.println("");

        System.out.println("Java String.getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)");
        System.out.println(
                """
             Se usa para copiar caracteres de una cadena determinada 
             en la matriz de caracteres de destino
             El primer carácter que se copiará está en el índice srcBegin;
             el último carácter que se copiará está  
             en el índice srcEnd-1 (por lo tanto, el número total 
             de caracteres que se copiarán es (srcEnd -srcBegin) ).""");

        System.out.println("SEG => " + seg);
        char[] getChar = new char[10];
        //dst array donde se introducen los datos
        //dstBegin indice por donde empezar en el array destino
        seg.getChars(1, 3, getChar, 0);
        String a = String.valueOf(getChar);
        System.out.println(a);
        System.out.println("");

        System.out.println(
                """
                     ValueOf retorno un string del tipo de dato pasado.
                     Si es un Integer devuelve un String 
                     Si es un array de char tambien
                               """);
        int inte = 10;
        Boolean bol = false;
        String intg = String.valueOf(inte);
        String bole = String.valueOf(bol);
        System.out.println("Mostrando Strin con valueOf => " + intg
                + " y Boolean => " + bole);
        int z = 10;
        Integer a2 = Integer.valueOf(z);
        Integer b = Integer.valueOf("1024");
        Integer c = Integer.valueOf("1BC", 16);
        Double d = Double.valueOf(b);
        Float e = Float.valueOf(a2);

        System.out.println(a2);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

        System.out.println("");

        System.out.println("Java String.indexOf(int ch)");
        System.out.println("Java String.lastIndexOf(int ch, int fromIndex)");
        System.out.println("Java String.indexOf(String str)");
        System.out.println("");
        System.out.println(
                """
                  Devuelve el índice dentro de esta cadena de 
                  la primera aparición del carácter especificado""");

        System.out.println("");
        System.out.println("Las letras 'pue' en SEG se encuentra en el indice => " + seg.indexOf("pue", 0));//indice por el que empezar

        System.out.println("Java String.lastIndexOf(int ch)");
        System.out.println("Java String.lastIndexOf(int ch, int fromIndex)");
        System.out.println("Devuelve el índice dentro de esta cadena de la última aparición del carácter especificado. ");
        System.out.println(seg);
        System.out.println("La última aparición de 'a'");
        System.out.println(seg.lastIndexOf("a"));
        System.out.println("");

       

        //fin encontrar
    }

    /**
     * Metodos para comparar <br/>
     * cadenas.
     */
    public void compararCadenas() {

        String pri = "casa en el pueblo";
        String seg = "casa en el pueblo";

        System.out.println("Java String(String original) Constructor");
        String s1 = "hola";
        String s3 = "hola";
        String s2 = new String("hola");
        System.out.println("");

        System.out.println("¿ s1 contiene los mismos datos que s2 ? ");
        System.out.println(s1.equals(s2));
        System.out.println("¿ Son el mismo objeto ?");
        System.out.println(s1 == s3);
        System.out.println("");

        System.out.println("Java String.compareTo(String anotherString)");
        System.out.println("""
                               
                    Compara dos cadenas lexicográficamente
                    El valor 0 si la cadena del argumento es igual a esta cadena.
                    Un valor menor que 0 si esta cadena es lexicográficamente
                     menor que el argumento de la cadena.
                    Un valor mayor que 0 si esta cadena es lexicográficamente
                     mayor que el argumento de cadena.
                               """);
        System.out.println("Cadenas a comparar");

        System.out.println(pri);

        System.out.println(seg);
        System.out.println(pri.compareTo(seg));
        System.out.println("");

        System.out.println("Java String.equals(Object anObject)");
        System.out.println(
                """
                   Se usa para comparar una cadena dada con el objeto especificado.
                   El resultado es verdadero si y solo si el argumento no es nulo
                     y es un objeto String que representa la misma secuencia de caracteres 
                     que este objeto. También tenemos 
                     Java String .equalsIgnoreCase ( String anotherString)""");
        System.out.println("SEG equals PRI" + pri.equals(seg));
        System.out.println("");
         System.out.println("Equals de la clase Object no puedes fallar esto");
        String uno = "Hola mundo";
        String dos = new String("Hola mundo");
        String tres = "hola";
        String cuatro = "hola";
        //Da igual utilizar el new que instanciar sin el
        //Por que no se ha hecho new
        System.out.println("uno es equals a dos " + uno.equalsIgnoreCase(dos));
        System.out.println("tres == cuatro");
        System.out.println(tres == cuatro);
        System.out.println("");

        System.out.println(
            """
            String containsEquals
                 se encarga de comparar una variable de tipo String
                 con un objeto de tipo StringBuffer, tambien puede ser un literal, 
                 donde una vez hecha la comparacion nos devolvera un valor booleano 
                 siendo true en el caso de que los caracteres de ambos objetos sean 
                 iguales y en caso contrario false
            """);
        System.out.println(pri.contentEquals(seg));
        String cdn1 = "Las cadenas son inmutables";
	StringBuffer cdn2 = new StringBuffer("Las cadenas son inmutables");

	System.out.println(cdn1.contentEquals("Los enteros son mutables"));
	System.out.println(cdn1.contentEquals(cdn2));

        
        
        System.out.println("Diferencia entre isBlank y empty");
        System.out.println("""
                           
            StringUtils.isBlank(null)      = true 
            StringUtils.isBlank("")        = true   
            StringUtils.isBlank(" ")       = true   
            StringUtils.isBlank("bob")     = false   
            StringUtils.isBlank("  bob  ") = false     
                           
            StringUtils.isEmpty(null)      = true 
            StringUtils.isEmpty("")        = true   
            StringUtils.isEmpty(" ")       = false   
            StringUtils.isEmpty("bob")     = false   
            StringUtils.isEmpty("  bob  ") = false                
                           
                           
                           """);
        
        //fin compararCadenas
    }

    /**
     * Metodos varios para trabajar <br/>
     * las cadenas.
     */
    public void trabajarCadenas() {

        String pri = "casa en el pueblo";
        String seg = "Casa en el pueblo";

        System.out.println("Método joined, une secuencias de cadenas por un delimitador.");
        String unir = String.join("/", "01", "10", "2020");
        System.out.println(unir);
        System.out.println("");

        System.out.println("Java String.replaceAll (String regex, reemplazo de cadena)");
        String nueva = pri.replace("en el ", "del ");
        System.out.println(nueva);
        System.out.println("");

        System.out.println("Java String.split (cadena expresión regular)");
        System.out.println("""
                               Divide un string por la expresi\u00f3n regular dada. 
                                Devuelve Array String""");
        String exp = " ";
    
        String[] spli = pri.split(exp);

        System.out.println(spli[0]);
        System.out.println(spli[1]);
        System.out.println(spli[2]);
        System.out.println(spli[3]);
        
        //String Builder es mutable
        StringBuilder prueba = new StringBuilder();

        for (int i = 0; i < spli.length; i++) {

            prueba.append(" ").append(spli[i]);

        }

        System.out.println(prueba);

        System.out.println();

        System.out.println("Java String.startsWith (prefijo de cadena)");
        System.out.println("""
                               Indica si una cadena comienza con 
                                la secuencia pasada.""");
        System.out.println("PRI comienza con casa");
        System.out.println(pri.startsWith("casa"));
        System.out.println("Podemos señalar por donde comenzar, en este caso 5 posiciones");
        System.out.println(pri.startsWith("en", 5));
        System.out.println("");

        System.out.println("Java String.subSequence(int beginIndex, int endIndex)");
        System.out.println("Devuelve una CharSequence  desde el punto de inicio al de fin");
        CharSequence x = pri.subSequence(1, 3);
        System.out.println(x);
        System.out.println("");

        System.out.println("Java String.substring(int beginIndex)");
        System.out.println("""
                               Devuelve una cadena que es una subcadena de esta cadena. 
                               La subcadena comienza con el car\u00e1cter en el \u00edndice especificado 
                                y se extiende hasta el final de esta cadena.""");

        String xs = pri.substring(1, 3);
        System.out.println(xs);
        System.out.println("");

        System.out.println("Java String.toCharArray()");
        System.out.println("""
                               El metodo toCharArray() convierte una cadena determinada en una 
                                nueva matriz de caracteres.""");
        char[] ch = pri.toCharArray();
        System.out.println(ch);
        System.out.println(ch[3]);
        System.out.println("");

        System.out.println("Java String.toLowerCase()");
        String up = pri.toUpperCase();
        System.out.println(up);
        System.out.println("");

        System.out.println("Cadena Java.trim()");
        System.out.println("""
                               El metodo trim() se usa para obtener una cadena cuyo valor 
                              es esta cadena, con cualquier espacio en blanco inicial y final eliminado.""");
        System.out.println(" Soy una cadena con espacios en blanco inicio y fin ");
        String ori = " Soy una cadena con espacios en blanco inicio y fin ";
        System.out.println("Longitud de la cadena sin trim " + ori.length());
        System.out.println("Despues pasar por trim");
        System.out.println(ori.trim().length());
        System.out.println("");

        System.out.println("Java String.concat(String str)");
        String str3 = pri.concat(seg);
        System.out.println(str3);
        System.out.println("");

        System.out.println("Java String.hashCode()");
        System.out.println("""
                               Se usa para obtener un c\u00f3digo hash de una cadena determinada. 
                               El c\u00f3digo hash para un objeto String se calcula como:""");
        String hs = " Mi has de string ";
        System.out.println(hs.hashCode());
        System.out.println("");
        
         System.out.println("Java String.matches(String regex)");
         System.out.println("Indica si esta cadena coincide o no con la expresión regular dada.");
        //http://puntocomnoesunlenguaje.blogspot.com/2013/07/ejemplos-expresiones-regulares-java-split.html
        //https://spa.myservername.com/java-regex-tutorial-with-regular-expression-examples
        String email = "lucas@gmail.com";
        Boolean emailCorrecto=email.matches("[-\\w\\.]+@\\w+\\.\\w+");
        System.out.println(email);
        

        System.out.println("");
        System.out.println("Metodo Strip elimina los espacios vacios iniciales o finales parecido a trim()");
        String stp =" Soy  un string con espacios ";
        System.out.println("Mi longitud es: "+stp.length()+ " "+stp);
        
        System.out.println(stp.strip());
        System.out.println("Aplico strip y ahora mi longitud es: "+stp.length());
        System.out.println("Espacios vacios al inicio"+stp.stripLeading());
        System.out.println("");
        System.out.println("Espacios vacios al final "+stp.stripTrailing());
        System.out.println("");
        
        System.out.println("Metodo split");
        
        
        
        
        System.out.println("Metodo matches clase String nos devuelve true o false");
        String reg = ".*[abc].*";
        String cad = "la casa vacia";
        Boolean t = cad.matches(reg);
        System.out.println(t );
        System.out.println("");
        
        
        System.out.println("Metodo regionMatches devuelve true o false");
        String cd1 = "Bienvenidos a tinchicus.com";
        String cd2 = "tinchicus";
        String msj = "Valor devuelto : ";
        int pos1 = cd1.indexOf(cd2);
        
        System.out.println(msj + cd1.regionMatches(pos1, cd2, 0, 1));
        cd2 = "Tinchicus";
        System.out.println(msj + cd1.regionMatches(pos1, reg, 0 ,9));
        System.out.println(msj + cd1.regionMatches(true, pos1, cd2, 0, 9));
        System.out.println("");
        
        
        
        
        System.out.println("Metodo lastIndexOf");
        String last = "Volviendo a casa por al lado de la ....";
        String bus = "ado";
        System.out.println(last.lastIndexOf(bus,20));
        //fin trabajarCadenas
        
        
    }
    
    
   
    public void Ejercicio(){
        
        /*
        String prueba = "Prueba de metodos";
        String otro = "otro string";
        
        System.out.println(prueba.concat(otro.substring(0, 3).toUpperCase()));
        */
        System.out.println("Diferencia entre instanciar un String o no");
        
        long inicio = System.nanoTime();
        String insta = new String("Soy un String con new");
        
        System.out.println("");
        long fin = System.nanoTime();
    
        System.out.println("Hemos tardado en realizar la operación => "+ ( fin - inicio ));
        
        long ini2 = System.nanoTime();
        String noIns = "Soy un String con new";
        
        long fin2 = System.nanoTime();
    
        System.out.println("Hemos tardado en realizar la operación => "+ ( fin2 - ini2 ));
        
        //fin Ejercicio
    }
//fin Cadenas
}