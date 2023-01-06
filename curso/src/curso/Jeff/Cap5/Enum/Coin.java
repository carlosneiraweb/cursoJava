
package curso.Jeff.Cap5.Enum;

/**
 *
 * @author carlos
 */
public enum Coin {
    
    
    PENNY(1),
    NICKEL(5),
    DIME(10),
    QUARTER(25);
    
    
    //denomValue selecionamos un elemento de ENUM
    private final int denomValue;//obligatorio final
    
    Coin(int denomValue){
        this.denomValue = denomValue;
    }
    
    public int denomValue(){return denomValue;}
    
    public int toDenomination(int numPennies){
        return numPennies/denomValue;
    }
    
    
    //fin coin
    



}

