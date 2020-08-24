package ereditarietaEPolimorfismo4;

import java.util.ArrayList;
import java.util.List;

public class FiltroDispari extends Filtro{

	public FiltroDispari() {
		super();
	}
	
	public FiltroDispari(List<Integer> l) {
		super(l);
	}
	
	@Override
	public List<Integer> filtra() {
		return filtra(listaDiInteri);
	}

	@Override
	public List<Integer> filtra(List<Integer> l) {
		if(l.size()==0) return l;
		//eliminare tutte le occorrenze in posizione dispari della lista
		//quindi sara' necessario fare un for alla rovescia per eliminare gli elementi giusti
		ArrayList<Integer> out = new ArrayList<>(l);
		for(int i=out.size()-1; i>=0; i--)
			if(i%2==1) out.remove(i);
		
		return out;
	}

}
