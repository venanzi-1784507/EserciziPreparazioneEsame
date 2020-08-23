package ereditarietaEPolimorfismo3;

public class NonAssonnatoException extends Exception{

	private final String MESSAGE = "Passeggero non assonnato, si accettano solo passeggeri assonnati.";
	
	@Override
	public String getMessage() {
		return MESSAGE;
	}
}
