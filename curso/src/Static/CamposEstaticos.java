
package Static;

 /**
 *   @author carlos
 * Las variables de clase estan asociadas con la clase no con el objeto.<br>
 * Cada instancia accede a la misma variable,<br>
 * es comun a todos los objetos instanciados.<br>
 * 
 * Los metodos de clase pueden acceder a metodos y variables de clase,<br>
 * pero no a metodos o variables de instancia.<br>
 * LOs metodos de instancia pueden acceder a metodos y variables de clase.<br>
 * Los metodos de clase no pueden usar this<br>
 * Desde la clase llamante usando el nombre de la clase que contiene<br>
 * los campos de clase se puede acceder a campos y metodos.
 * 
 * 
 */

public class CamposEstaticos {
    


    static int cont;
    static int numeroLetras;
    private int num1;
    private int num2;
    
    public CamposEstaticos(int primero, int segundo) {
        
        this.num1 = primero;
        this.num2 = segundo;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    
    /**
     * devuelve la suma de cont
     * @return int
     */
    public  static Integer devuelvoCont(){
        
        cont = cont + 1;
        
        return cont;
    }
    
    private static void sumoLetras(){
        numeroLetras = ++numeroLetras;
        System.out.println("Anado una a letras "+ numeroLetras);
    }
    
    public void calcularSuma(){
        int total = num1 + num2;
        System.out.println("La suma es : "+ total);
        sumoLetras();
    }
    
    
    
    
    
     //fin CamposEstaticos
}
