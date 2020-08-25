package ereditarietaEPolimorfismo5;

import java.util.ArrayList;

public class Utente {
	
	public static enum visibilita {
		TUTTI, SOLOAMICI
	}

	protected String nome;
	protected String cognome;
	public String getCognome() { return cognome; }
	protected visibilita visibilitaAmicizie;
	protected ArrayList<Utente> richiesteAmicizia;
	protected ArrayList<Utente> amici;
	
	public Utente(String nome, String cognome, visibilita vis) {
		this.nome = nome;
		this.cognome = cognome;
		this.visibilitaAmicizie = vis;
		richiesteAmicizia = new ArrayList<>();
		amici = new ArrayList<>();
	}
	
	public visibilita getVisibilitaAmicizie() { return visibilitaAmicizie; }
	
	protected ArrayList<Utente> getAmici() { return amici; }
	
	/**
	 * 
	 * @param u oggetto utente che verra inserito nelle richieste di amicizia
	 */
	public void richiediAmicizia(Utente u) {
		richiesteAmicizia.add(u);
	}
	
	public void accettaAmicizia() {
		//check if the richieste list is empty
		if(richiesteAmicizia.isEmpty())
			return;
		//check if the user is already in the amici list
		if(amici.contains(richiesteAmicizia.get(0)))
			return;
		amici.add(richiesteAmicizia.get(0));
		richiesteAmicizia.remove(0);
	}
	
	public ArrayList<Utente> getRichiesteDiAmicizia() { return richiesteAmicizia; }
	
	public ArrayList<Utente> getAmiciDi(Utente u) throws AmiciNonVisibiliException{
		if(u == null) throw new IllegalArgumentException(); //dato in input scorretto
		if(u.getVisibilitaAmicizie() == visibilitaAmicizie.SOLOAMICI && !(amici.contains(u)))
			throw new AmiciNonVisibiliException();//u non è un amico e la visibilita è riservata agli amici
		//essendo getAmici() privato ci posso accedere solo perche sono nella stessa classe
		return u.getAmici();
	}
}
