package esercizio3.app.exceptions;

public class BancaException extends Exception{
	
	public BancaException(String message){
		super(message);
	}
	
	public String toString(String message) {
		return message;
	}
}
