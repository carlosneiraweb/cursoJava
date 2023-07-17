
package curso.Jeff.Cap5.Enum;

/**
 *
 * @author carlos
 */
public class EnhancedSwitch {
    
    
    private enum Coin{PENNY,NICKEL,DIME,QUARTER,DOLAR}
    public static void main(String[]args){
        
      Coin coin = Coin.DIME;
      
      switch(coin){
          case PENNY : System.out.println("Icent");break;
          case NICKEL : System.out.println("5 cents");break;
          case DIME :System.out.println("10 cents");break;
          case QUARTER : System.err.println("25 cents");break;
          default: assert false: "ninguna opcion";
          
      }
        
        
    }
    
    
}
