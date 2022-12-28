/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.Jeff.Cap4.Excepciones;

/**
 *
 * @author carlos
 */
public class InvalidMediaFormatException extends Exception{
    
    private String exceptedFormat;
    private String existingFormat;
    
    public InvalidMediaFormatException(String exceptedFormat, String existingFormat){   
        super("Excepted format: "+ exceptedFormat + " Existing format: "+ existingFormat); 
        this.exceptedFormat = exceptedFormat;
        this.existingFormat = existingFormat;
    }

    

    public String getExceptedFormat() {
        return exceptedFormat;
    }

    public String getExistingFormat() {
        return existingFormat;
    }
    
    
    public static void convert(String srcName, String dtsName)
                throws InvalidMediaFormatException{

        
        if(srcName == null)
            throw new NullPointerException(srcName + " is Null");
        if(dtsName == null)
            throw new NullPointerException(dtsName + " is Null");
        
        //Codigo para acceder al archivo
        //Se asume que la extensión origen es RM (real media)
        //y que la firma sugiere Microsoft Wave
        String exceptedFormat = "RM";
        String existingFormat = "WAVE";
        throw new InvalidMediaFormatException(exceptedFormat, existingFormat);

}
    

      
   public static void main(String[]args){
      
       if(args.length != 2){
           System.out.println("usage: java Convert srcfile dstfile");
           return;
       }
           
       try {
           InvalidMediaFormatException.convert(args[0], args[1]);
       }  catch (InvalidMediaFormatException imfe) {
           System.out.println("Unabe to convert "+ args[0] + " to " + args[1]);
           System.out.println("Excepting " + args[0]+ " to conform to " +
                   imfe.getExceptedFormat() + " format");
           System.out.println("However, "+ args[0]+ " conformed to " +
                   imfe.getExistingFormat() + " format");
       }catch(Exception e){
           System.out.println(e.getMessage());
       }
       

   }    
    
   
    
//fin InvalidMediaFormatException    
}


