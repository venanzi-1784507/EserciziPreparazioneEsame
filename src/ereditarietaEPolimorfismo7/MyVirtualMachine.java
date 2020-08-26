package ereditarietaEPolimorfismo7;

import java.util.Arrays;

public class MyVirtualMachine {

	public Procedura procedura;
	
	public MyVirtualMachine(Procedura p) {
		procedura = p;
	}
	
	public void esegui() {
		procedura.esegui();
	}
	
	public static void main(String[] args) {
		Registro eax = new Registro(Registro.Registri.EAX);
		Registro ebx = new Registro(Registro.Registri.EBX);
		Registro ecx = new Registro(Registro.Registri.ECX);
		Registro edx = new Registro(Registro.Registri.EDX);
		
		Istruzione[] codice1 = new Istruzione[] {
				new Mov(edx, new Intero(0)), 
				new Add(edx, ecx) };
		
		Procedura proc1 =new Procedura(Arrays.asList(codice1));
		
		Istruzione[] codice2 = new Istruzione[] {
				new Mov(eax, new Intero(3)),
				new Mov(ebx, new Intero(5)),
				new Mov(ecx, new Intero(8)),
				new Add(eax, ebx),
				new Cmp(eax, ecx),
				new Call(proc1) };
		
		Procedura main_proc = new Procedura(Arrays.asList(codice2));
		
		MyVirtualMachine vm = new MyVirtualMachine(main_proc);
		vm.esegui();
		
		System.out.println();
		System.out.println("contenuto finale dei registri");
		System.out.println("eax: " + eax.valore);
		System.out.println("ebx: " + ebx.valore);
		System.out.println("ecx: " + ecx.valore);
		System.out.println("edx: " + edx.valore);
	}
}
