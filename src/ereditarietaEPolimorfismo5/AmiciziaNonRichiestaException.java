package ereditarietaEPolimorfismo5;

public class AmiciziaNonRichiestaException extends Exception{

	public final String MESSAGE = "nessuna relazione di amicizia";
	
	@Override
	public String getMessage() {
		return MESSAGE;
	}
}
