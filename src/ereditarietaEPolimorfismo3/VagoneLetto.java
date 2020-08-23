package ereditarietaEPolimorfismo3;

import java.util.ArrayList;

public class VagoneLetto extends Vagone{

	public static final int POSTI_POSSIBILI = 10;
	
	public VagoneLetto(String destinazione) {
		this.destinazione = destinazione;
		this.postiDisponibili = POSTI_POSSIBILI;
		passeggeri = new ArrayList<Passeggero>();
	}
	
	@Override
	public void occupa(Passeggero p) throws VagonePienoException,NonAssonnatoException {
		controlloPasseggero(p);
		this.occupa(p);
	}
	
//	public void occupa(PasseggeroAssonnato pa) throws VagonePienoException, NonAssonnatoException {
//		controlloPasseggero(pa);
//		super.occupa(pa);
//	}
	
	private void controlloPasseggero(Passeggero p) throws NonAssonnatoException {
		if(p.getClass() != PasseggeroAssonnato.class)
			throw new NonAssonnatoException();
	}
}
