package ereditarietaEPolimorfismo6;

public class ElementoTesto implements Elemento{

	private String testo;
	
	public ElementoTesto(String testo) {
		this.testo = testo;
	}
	
	@Override
	public String toString() {
		return testo;
	}
}
