package arrayEStringhe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Calcolatrice {

	private ArrayList<Double> memoria;
	private ArrayList<Double> memoriaSomme;
	private double valore;
	
	public Calcolatrice() {
		memoria = new ArrayList<>();
		memoriaSomme = new ArrayList<>();
		valore = 0.0;
		memoriaSomme.add(valore);
	}
	
	public void somma(double val) {
		valore += val;
		memoriaSomme.add(val);
	}
	
	public void memorizza() {
		memoria.add(valore);
	}
	
	public void azzera() {
		valore = 0.0;
		memoriaSomme = new ArrayList<Double>();
	}
	
	public boolean recupera(int indice) {
		if(memoria.size() < indice) return false;
		valore = memoria.get(indice);
		memoriaSomme = new ArrayList<Double>();
		memoriaSomme.add(valore);
		return true;
	}
	
	@Override
	public String toString() {
		return memoriaSomme.stream().map(x->x.toString()).collect(Collectors.joining("+"));
	}
	
	public static void main(String[] args) {
		Calcolatrice calc = new Calcolatrice();
		calc.somma(5); calc.somma(3);
		System.out.println(calc);
		calc.memorizza(); calc.azzera(); calc.recupera(0); calc.somma(1);
		System.out.println(calc);
		calc.memorizza(); calc.azzera(); calc.recupera(1);
		System.out.println(calc);
	}
}
