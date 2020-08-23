package ereditarietaEPolimorfismo3;

import java.util.ArrayList;

public class Locomotiva extends Vagone{
		
	public static final int POSTI_POSSIBILI = 0;
		
	/**
	 * costruttore della classe
	 * @param destinazione stringa relativa all'indirizzo di destinazione
	 */
	public Locomotiva(String destinazione) {
		this.destinazione = destinazione;
		this.postiDisponibili = POSTI_POSSIBILI;
		passeggeri = new ArrayList<Passeggero>();
	}
	
//	public static void main(String[] args) {
//		VagoneLetto vl = new VagoneLetto("sassari");
////		Vagone vl = new VagoneMerci("sassari");
//		try {
//			vl.occupa(new Passeggero("luca", "ignoto", 18));
////			vl.occupa(null);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
}
