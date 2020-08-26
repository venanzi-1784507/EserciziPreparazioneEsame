package ereditarietaEPolimorfismo7;

public class Cmp extends Istruzione{

	public Cmp(Registro op1, Operando op2) {
		super(op1, op2);
	}

	@Override
	public void esegui() {
		operandi[0].valore = Integer.compare(operandi[0].valore, operandi[1].valore) ;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " " + 
					((Registro)operandi[0]).reg.toString() + " " + 
						operandi[1].toString();
	}
}
