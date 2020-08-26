package ereditarietaEPolimorfismo6;

public abstract class Tag implements Elemento{

	protected Elemento elemento;
	
	public Tag(Elemento e) {
		elemento = e;
	}
	
	public String getTagName() { return Class.class.getSimpleName(); }
	
	public Elemento getElementoInterno() { return elemento; }
	
	@Override
	public String toString() {
		return "<tag>" + elemento.toString() + "</tag";
	}
}
