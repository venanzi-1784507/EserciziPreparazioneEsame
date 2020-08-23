package ereditarietaEPolimorfismo3;

public class Passeggero {

	private String nome, cognome;
	private int eta;
	
	public Passeggero(String nome, String cognome, int eta) {
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
	}
	
	public String getNome() { return nome; }
	public String getCognome() { return cognome; }
	public int getEta() { return eta; }
	
	@Override
	public String toString() {
		return getNome();
	}
}
