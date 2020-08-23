package ereditarietaEPolimorfismo3;

import java.util.ArrayList;

	public class VagoneMerci extends Vagone{

		public static final int POSTI_POSSIBILI = 0;
	
		public VagoneMerci(String destinazione) {
			this.destinazione = destinazione;
			this.postiDisponibili = POSTI_POSSIBILI;
			passeggeri = new ArrayList<Passeggero>();
		}
}
