package ereditarietaEPolimorfismo7;

public abstract class Istruzione {

	public Operando[] operandi;
	
	public Istruzione(Registro op1, Operando op2) {
		operandi = new Operando[] {op1, op2};
	}
	
	public abstract void esegui();
}
