package ereditarietaEPolimorfismo3;

import java.util.ArrayList;

public class VagonePasseggeri extends Vagone{

	public static final int POSTI_POSSIBILI = 50;
	
	public VagonePasseggeri(String destinazione) {
		this.destinazione = destinazione;
		this.postiDisponibili = POSTI_POSSIBILI;
		passeggeri = new ArrayList<Passeggero>();
	}
}
