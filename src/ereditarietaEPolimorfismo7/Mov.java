package ereditarietaEPolimorfismo7;

public class Mov extends Istruzione{

	public Mov(Registro op1, Operando op2) {
		super(op1, op2);
	}
	
	@Override
	public void esegui() {
		//il primo operando è sicuramente un registro, il secondo non è detto. ma non mi interessa
		//tanto io voglio solo il valore 
		operandi[0].valore = operandi[1].valore;
		
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " " + 
					((Registro)operandi[0]).reg.toString() + " " + 
						operandi[1].toString();
	}
}
