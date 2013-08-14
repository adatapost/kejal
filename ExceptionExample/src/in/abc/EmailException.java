package in.abc;

public class EmailException extends Exception {
    public EmailException(){
    	super("Email error");
    }
    public EmailException(String msg){
    	super(msg);
    }
}
