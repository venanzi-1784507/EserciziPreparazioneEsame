package ereditarietaEPolimorfismo3;

import java.util.ArrayList;

public abstract class Vagone {
	
	protected String destinazione;
	protected int postiDisponibili;
	protected ArrayList<Passeggero> passeggeri;
	
	public int getNumeroPostiLiberi() { return postiDisponibili; }
	
	
	public void occupa(Passeggero p) throws VagonePienoException, NonAssonnatoException {
		//se p è valido e ci sono posti disponibili chiamo registraPasseggero() per gestire la registrazione
		if(p==null)//eccezione
			throw new IllegalArgumentException();
		if(postiDisponibili<=0)//eccezione
			throw new VagonePienoException();
		registraPasseggero(p);
		//reduce the amount of free seats
		postiDisponibili--;
	}
	
	/**
	 * salva il passeggero in input nel registro del vagone
	 * @param p passeggero da inserire all'interno del registro del vagone
	 */
	protected void registraPasseggero(Passeggero p) {
		//registro il passeggiero
		passeggeri.add(p);
		System.out.println("Passeggero " + p.getNome() + " registrato.");
	}
}
