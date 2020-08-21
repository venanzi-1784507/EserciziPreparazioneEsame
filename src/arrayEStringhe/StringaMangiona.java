package arrayEStringhe;

import java.util.ArrayList;

public class StringaMangiona {

	private String stringa;
	private int mangiateCounter;
	
	public String getStringa() { return stringa; }
	
	public StringaMangiona(String s) {
		stringa = s;
	}
	
	@Override
	public String toString() {
		return stringa;
	}
	
	public int length() {
		return stringa.length();
	}
	
	public Character getCarattere(int posizione) {
		return stringa.charAt(posizione);
	}
	
	public void mangiaLettera(char c) {
		ArrayList<Character> lettersToKeep = new ArrayList<>();
		for(String ch: stringa.split("")) {
			if(ch.charAt(0) != c) lettersToKeep.add(ch.charAt(0));
		}
		String nuovaStringa = "";
		for(Character ch: lettersToKeep) nuovaStringa += ch;
		mangiateCounter += stringa.length() - nuovaStringa.length();
		stringa = nuovaStringa;
	}
	
	public void slurp() {
		mangiateCounter += stringa.length();
		stringa = "";
	}
	
	public void mangiaStringaMangiona(StringaMangiona sm) {
		for(char c: sm.getStringa().toCharArray())
			mangiaLettera(c);
	}
	
	public int getTotaleMangiate() {
		return mangiateCounter;
	}
	
	public static void main(String[] args) {
		StringaMangiona sm = new StringaMangiona("aiuola");
		System.out.println(sm);
		sm.mangiaLettera('a');
		System.out.println(sm);
		sm = new StringaMangiona("aiuola");
		sm.mangiaStringaMangiona(new StringaMangiona("ala"));
		System.out.println(sm);
		sm = new StringaMangiona("aabcbbb");
		sm.mangiaLettera('a');
		sm.mangiaLettera('b');
		sm.slurp();
		System.out.println(sm.getTotaleMangiate());
	}
}
