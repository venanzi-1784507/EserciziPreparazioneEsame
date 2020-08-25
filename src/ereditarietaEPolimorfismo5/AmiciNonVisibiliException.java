package ereditarietaEPolimorfismo5;

public class AmiciNonVisibiliException extends Exception{

	public final String MESSAGE = "amici non visibili";
	
	@Override
	public String getMessage() {
		return MESSAGE;
	}
}
