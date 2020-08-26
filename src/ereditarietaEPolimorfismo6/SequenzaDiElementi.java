package ereditarietaEPolimorfismo6;

import java.util.ArrayList;

public class SequenzaDiElementi implements Elemento{

	ArrayList<Elemento> elementi;
	
	public SequenzaDiElementi(Elemento... elem) {
		elementi = new ArrayList<>();
		for(Elemento e: elem) elementi.add(e);
	}
	
	@Override
	public String toString() {
		String out =  "";
		for(Elemento e: elementi) out += e.toString();
		return out;
	}
}
