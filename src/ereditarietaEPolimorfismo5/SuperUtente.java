package ereditarietaEPolimorfismo5;

import java.util.ArrayList;

public class SuperUtente extends Utente{

	public SuperUtente(String nome, String cognome, visibilita vis) {
		super(nome, cognome, vis);
	}

	@Override
	public ArrayList<Utente> getAmiciDi(Utente u) throws AmiciNonVisibiliException{
		if(u == null) throw new IllegalArgumentException(); //dato un input scorretto
		return u.getAmici();
	}
}
