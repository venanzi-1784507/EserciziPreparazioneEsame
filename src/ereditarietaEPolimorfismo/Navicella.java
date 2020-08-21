package ereditarietaEPolimorfismo;

public class Navicella extends Actor{

	private static final String NAVICELLA_RAPPRESENTAZIONE = "N";
	
	private boolean laser;
	
	public Navicella() {
		posizione = new Punto2D(0,2);
		laser = false;
	}
	
	public void su() { posizione.setY(posizione.getY()+1); }
	public void giu() { posizione.setY(posizione.getY()-1); }
	
	public void shot() { laser = true; }
	
	public void stopShooting() { laser = false; }
	
	public boolean isShooting() { return laser; }
	
	@Override
	public String toString() {
		return NAVICELLA_RAPPRESENTAZIONE;
	}
}
