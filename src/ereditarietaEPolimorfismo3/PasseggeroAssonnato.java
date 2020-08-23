package ereditarietaEPolimorfismo3;

public class PasseggeroAssonnato extends Passeggero{

	public static final String ASSONNATO = "assonnato";
	
	public PasseggeroAssonnato(String nome, String cognome, int eta) {
		super(nome, cognome, eta);
	}

	@Override
	public String toString() {
		return this.getNome() + " " + ASSONNATO;
	}
}
