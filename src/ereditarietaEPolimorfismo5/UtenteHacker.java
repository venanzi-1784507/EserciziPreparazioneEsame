package ereditarietaEPolimorfismo5;

public class UtenteHacker extends Utente{

	public UtenteHacker(String nome, String cognome, visibilita vis) {
		super(nome, cognome, vis);
	}
	
	public void hackera(Utente u) throws AmiciNonVisibiliException {
		u.getAmiciDi(u).clear();
	}
}
