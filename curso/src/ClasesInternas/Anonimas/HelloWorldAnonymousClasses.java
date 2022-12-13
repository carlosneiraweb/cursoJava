/*
En pocas palabras, el uso de una clase anónima te permite 
crear un objeto que implementa una interfaz
en particular y poder usarlo libremente 
sin la molestia de tener que definir explícitamente una clase.
https://es.stackoverflow.com/questions/42911/cu%C3%A1l-es-el-prop%C3%B3sito-de-las-clases-an%C3%B3nimas-en-java
*/
package ClasesInternas.Anonimas;

/**
 *
 * @author carlos
 */
public class HelloWorldAnonymousClasses {
    
    interface HelloWorld{
        public void greet();
        public void greetSomeone(String someone);
    }
    
    
    public void sayHello(){
        
        class EnglishGreeting implements HelloWorld{
            
            String name = "world";
            @Override
            public void greet(){
                greetSomeone("world");
            }
            @Override
            public void greetSomeone(String someone){
                name = someone;
                System.out.println("Hello" + name);
            }
        }
            HelloWorld englishGreeting = new EnglishGreeting();
            
            HelloWorld frenchGreeting = new HelloWorld(){
                
                String name = "tout le monde";
                @Override
                public void greet(){
                    greetSomeone("tout le monde");
                }
                @Override
                public void greetSomeone(String someone){
                    name = someone;
                    System.out.println("Salut "+name);
                }
                
                
            };
            
            
            HelloWorld spanishGreeting = new HelloWorld(){
                String name = "mundo";
                @Override
                public void greet(){
                    greetSomeone("mundo");
                }
                @Override
                public void greetSomeone(String someone){
                    name = someone;
                    System.out.println("Hola "+name);
                    
                }
            };
            
        englishGreeting.greet();
        frenchGreeting.greetSomeone("Fred");
        spanishGreeting.greet();   
        
    }

//fin HelloWorldAnonymousClasses  
    
    public static void main(String... args) {
        HelloWorldAnonymousClasses myApp =
            new HelloWorldAnonymousClasses();
        myApp.sayHello();
    }   
}
