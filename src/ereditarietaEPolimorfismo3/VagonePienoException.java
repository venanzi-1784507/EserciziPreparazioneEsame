package ereditarietaEPolimorfismo3;

public class VagonePienoException extends Exception{

	private final String MESSAGE = "Vagone pieno, niente posti liberi.";
	@Override
	public String getMessage() {
		return MESSAGE;
	}
}
