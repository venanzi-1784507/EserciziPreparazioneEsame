package ereditarietaEPolimorfismo5;

public class UtenteFastidioso extends Utente{

	public UtenteFastidioso(String nome, String cognome, visibilita vis) {
		super(nome, cognome, vis);
	}

	@Override
	public void richiediAmicizia(Utente u) {
		richiesteAmicizia.add(u);
		richiesteAmicizia.add(u);
		richiesteAmicizia.add(u);
	}
}
