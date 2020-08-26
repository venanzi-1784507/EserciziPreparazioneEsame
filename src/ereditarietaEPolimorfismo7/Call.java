package ereditarietaEPolimorfismo7;

public final class Call extends Istruzione{

	public Procedura proc;
	
	public Call(Procedura p) {
		super(null, null);
		proc = p;
	}
	
//	public Call(Registro op1, Operando op2) {
//		super(op1, op2);
//	}

	@Override
	public void esegui() {
		proc.esegui();
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " " + proc.getClass().getSimpleName();
	}

}
