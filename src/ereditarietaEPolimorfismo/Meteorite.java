package ereditarietaEPolimorfismo;

public class Meteorite extends Actor implements Enemy{

	private static final String METEORITE_RAPPRESENTAZIONE = "M";
	
	public Meteorite(float x, float y) {
		posizione = new Punto2D(x, y);
	}
	
	@Override
	public void prossimoPasso() { 
		posizione.setX(posizione.getX()-1);
		posizione.setY(posizione.getY()+1);
	}
	
	@Override
	public String toString() {
		return METEORITE_RAPPRESENTAZIONE;
	}
}
