//https://www.digitalocean.com/community/tutorials/java-thread-wait-notify-and-notifyall-example
package ClaseObject.WaitAndNotifyAll;

/**
 *
 * @author carlos
 */
public class Message {
    
    private String msg;
    
    public Message(String str){
        this.msg = str;
    }
    
    public String getMsg(){
        return msg;
    }
    
    public void setMsg(String str){
        this.msg=str;
    }
    
}
