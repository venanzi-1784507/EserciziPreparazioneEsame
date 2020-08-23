package ereditarietaEPolimorfismo3;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Treno {
	
	//aggiungi array di vagoni come ArrayList<Vagoni>
	private ArrayList<Vagone> vagoni;
	
	public Treno(Locomotiva l) {
		vagoni = new ArrayList<>();
		vagoni.add(l);
	}

	public void aggiungiVagone(Vagone v) {
		vagoni.add(v);
	}
	
	public Treno dividiTreno(Locomotiva loc, int pos) {
		if(pos >= vagoni.size())
			throw new IndexOutOfBoundsException();
		//crea un nuovo treno con loc in input
		Treno t = new Treno(loc);
		for(int i=pos; i<vagoni.size(); i++)
			t.aggiungiVagone(vagoni.get(i));
		vagoni = new ArrayList<>(vagoni.subList(0, pos));
		return t;
	}
	
	@Override
	public String toString() {
		String out = vagoni.stream().map(x-> x.getClass().getSimpleName()).collect(Collectors.joining("--"));
		return out;
	}
	
	public static void main(String[] args) {
		Treno t = new Treno(new Locomotiva("latina"));
		VagoneLetto vl = new VagoneLetto("latina");
		VagoneMerci vm = new VagoneMerci("latina");
		VagonePasseggeri vp = new VagonePasseggeri("latina");
		
		System.out.println(t);
		
		t.aggiungiVagone(vl);
		
		System.out.println(t);
		
		t.aggiungiVagone(vm);
		t.aggiungiVagone(vp);
		
		System.out.println(t);
		
		t.dividiTreno(new Locomotiva("bressanone"), 2);
		
		System.out.println(t);
	}
}
