package ereditarietaEPolimorfismo;

public class Alieno extends Actor implements Enemy{

	private static final String ALIENO_RAPPRESENTAZIONE = "A";
	
	public Alieno(float x, float y) {
		posizione = new Punto2D(x, y);
	}
	
	public void prossimoPasso() { posizione.setX(posizione.getX()-1); }
	
	@Override
	public String toString() {
		return ALIENO_RAPPRESENTAZIONE;
	}
}
