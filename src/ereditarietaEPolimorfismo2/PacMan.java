package ereditarietaEPolimorfismo2;

public class PacMan extends Actor{

	public static final String RAPPR_PACMAN = "P";
	private int punteggio;
	
	public PacMan(GiocoDelPacMan gdpm, int x, int y) {
		super(gdpm, x, y);
	}

	public int getPunteggio() { return punteggio; }
	
	@Override
	public boolean sposta() {
		boolean mangiato = super.sposta();
		//se il metodo di actor ritorna true aumentare il punteggio
		if(mangiato) punteggio++;
		return mangiato;
	}
	
	@Override
	public String toString() {
		return RAPPR_PACMAN;
	}
}
