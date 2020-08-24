package ereditarietaEPolimorfismo4;

import java.util.ArrayList;
import java.util.List;

public abstract class Filtro {

	protected ArrayList<Integer> listaDiInteri;
	
	public Filtro() {
		this(new ArrayList<Integer>());
	}
	
	public Filtro(List<Integer> l) {
		listaDiInteri = new ArrayList<>(l);
	}
	
	public abstract List<Integer> filtra();
	
	public abstract List<Integer> filtra(List<Integer> l);
}
