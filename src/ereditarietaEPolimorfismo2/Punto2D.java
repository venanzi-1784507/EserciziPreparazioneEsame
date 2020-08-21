package ereditarietaEPolimorfismo2;

public class Punto2D {

	public int x;
	public int y;
	
	public Punto2D(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj.getClass() == this.getClass()))
			return false;
		return x == ((Punto2D)obj).x && y == ((Punto2D)obj).y;
	}
}
