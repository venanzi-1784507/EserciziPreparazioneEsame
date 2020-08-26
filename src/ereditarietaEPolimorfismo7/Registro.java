package ereditarietaEPolimorfismo7;

public class Registro extends Operando{

	public static enum Registri { EAX, EBX, ECX, EDX}
	
	public Registri reg;
	
	public Registro(Registri r) {
		reg = r;
	}
}
