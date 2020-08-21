package arrayEStringhe;

import java.util.Arrays;
import java.util.Random;

public class EstrazioneDelLotto {

	private Random random = new Random();
	private final int ESTRAI_BOUND = 91;
	
	private int[] estrazioni;
	
	public EstrazioneDelLotto() {
		estrazioni = new int[5];
	}
	
	public int[]  estrai() {
		for(int i=0; i<5; i++)
			estrazioni[i] = random.nextInt(ESTRAI_BOUND);
		return estrazioni;
	}
	
	@Override
	public String toString() {
		return Arrays.toString(estrazioni);
	}
	
	public int numeriContenuti(int n1) {
		for(int i: estrazioni) {
			if(i == n1) return 1;
		}
		return 0;
	}
	
	public int numeriContenuti(int n1, int n2) {
		return numeriContenuti(n1) + numeriContenuti(n2);
	}
	
	public int numeriContenuti(int n1, int n2, int n3) {
		return numeriContenuti(n1, n2) + numeriContenuti(n3);
	}
	
	public int numeriContenuti(int n1, int n2, int n3, int n4) {
		return numeriContenuti(n1, n2, n3) + numeriContenuti(n4);
	}
	
	public int numeriContenuti(int n1, int n2, int n3, int n4, int n5) {
		return numeriContenuti(n1, n2, n3, n4) + numeriContenuti(n5);
	}
	
	public int numeriContenuti(int n1, int n2, int n3, int n4, int n5, int n6) {
		return numeriContenuti(n1, n2, n3, n4, n5) + numeriContenuti(n6);
	}
	
	public int numeriContenuti(int n1, int n2, int n3, int n4, int n5, int n6, int n7) {
		return numeriContenuti(n1, n2, n3, n4, n5, n6) + numeriContenuti(n7);
	}
	
	public int numeriContenuti(int n1, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
		return numeriContenuti(n1, n2, n3, n4, n5, n6, n7) + numeriContenuti(n8);
	}
	
	public int numeriContenuti(int n1, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9) {
		return numeriContenuti(n1, n2, n3, n4, n5, n6, n7, n8) + numeriContenuti(n9);
	}
	
	public int numeriContenuti(int n1, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10) {
		return numeriContenuti(n1, n2, n3, n4, n5, n6, n7, n8, n9) + numeriContenuti(n10);
	}
	
	public boolean vincita(int n1, int n2) {
		return numeriContenuti(n1, n2) >=2;
	}
	
	public boolean vincita(int n1, int n2, int n3) {
		return numeriContenuti(n1, n2, n3) >=2;
	}
	
	public boolean vincita(int n1, int n2, int n3, int n4) {
		return numeriContenuti(n1, n2, n3, n4) >=2;
	}
	
	public boolean vincita(int n1, int n2, int n3, int n4, int n5) {
		return numeriContenuti(n1, n2, n3, n4, n5) >=2;
	}
	
	public boolean vincita(int n1, int n2, int n3, int n4, int n5, int n6) {
		return numeriContenuti(n1, n2, n3, n4, n5, n6) >=2;
	}
	
	public boolean vincita(int n1, int n2, int n3, int n4, int n5, int n6, int n7) {
		return numeriContenuti(n1, n2, n3, n4, n5, n6, n7) >=2;
	}
	
	public boolean vincita(int n1, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
		return numeriContenuti(n1, n2, n3, n4, n5, n6, n7, n8) >=2;
	}
	
	public boolean vincita(int n1, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9) {
		return numeriContenuti(n1, n2, n3, n4, n5, n6, n7, n8, n9) >=2;
	}
	
	public boolean vincita(int n1, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10) {
		return numeriContenuti(n1, n2, n3, n4, n5, n6, n7, n8, n9, n10) >=2;
	}
	
	public int getTotaleNumeriEstratti() {
		return Arrays.stream(estrazioni).sum();
	}
	
	public static void main(String[] args) {
		EstrazioneDelLotto edl = new EstrazioneDelLotto();
		edl.estrai();
		System.out.println(edl);
		
		System.out.println(edl.getTotaleNumeriEstratti());
		
		System.out.println(edl.vincita(88, 73, 48, 11, 39, 17, 33, 66, 90, 0));
	}
}
