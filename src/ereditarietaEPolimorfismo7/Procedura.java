package ereditarietaEPolimorfismo7;

import java.util.ArrayList;
import java.util.List;

public class Procedura {

	public ArrayList<Istruzione> istruzioni;
	
	public Procedura(List<Istruzione> istr) {
		istruzioni = new ArrayList<>(istr);
	}
	
	public void esegui() {
		for(Istruzione i: istruzioni) {
			System.out.println(i.toString());
			i.esegui();
		}
	}
}
