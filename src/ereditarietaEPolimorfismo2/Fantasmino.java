package ereditarietaEPolimorfismo2;

public class Fantasmino extends Actor{

	public Fantasmino(GiocoDelPacMan gdpm, int x, int y) {
		super(gdpm, x, y);
	}

	public static final String RAPPR_FANTASMINO = "F";
	
	@Override
	public String toString() {
		return RAPPR_FANTASMINO;
	}
}
