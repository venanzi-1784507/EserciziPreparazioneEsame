package ereditarietaEPolimorfismo5;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class ReteSociale {

	private ArrayList<Utente> utenti;
	
	public ReteSociale() {
		utenti = new ArrayList<>();
	}
	
	public void aggiungiUtente(Utente u) {
		if(u == null) return;
		utenti.add(u);
	}
	
	public ArrayList<Utente> getUtentiPerCognome(String cognome){
		return utenti.stream().filter(x->x.getCognome().equals(cognome)).collect(Collectors.toCollection(ArrayList::new));
	}
}
