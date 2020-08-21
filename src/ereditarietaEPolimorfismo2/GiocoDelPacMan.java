package ereditarietaEPolimorfismo2;

import java.util.ArrayList;
import java.util.Random;

public class GiocoDelPacMan {

	private Random random;
	private PacMan pacMan;
	private ArrayList<Fantasmino> fantasmini;
	private Cella[][] tabellone;
	private int tabellaLength;
	
	public GiocoDelPacMan(int n) {
		random = new Random();
		tabellaLength = n;
		tabellone = new Cella[n][n];
		initTabellone();
		pacMan = new PacMan(this, 0, 0);
		fantasmini = new ArrayList<>();
		//qui dovrei fornire nel costruttore dei fantasmini una posizione che non corrispoinda ad un muro
		//a pacman o ad un proprio compagno
		initFantasmini();
	}
	
	private void initTabellone() {
		for(int i=0; i<tabellaLength; i++) {
			for(int k=0; k<tabellaLength; k++) {
				if(random.nextInt(100)<20)
					tabellone[i][k] = new CellaMuro();//impostaMuro(i, k);// 
				else
					tabellone[i][k] = new CellaLibera();
			}
		}
		//la cella (0,0) e' la cella dove spawna pacman
		tabellone[0][0] = new CellaLibera();
		//altrimenti pacman parte gia' con un punto
		((CellaLibera)tabellone[0][0]).setPallina(false);
	}
	
	private void initFantasmini() {
		int count = 0;
		int randX, randY;
		while(count <=1) {
			randX = random.nextInt(tabellaLength);
			randY = random.nextInt(tabellaLength);
			if(tabellone[randX][randY].getClass()==CellaLibera.class) {
				count++;
				fantasmini.add(new Fantasmino(this, randX, randY));
				((CellaLibera)tabellone[randX][randY]).setPallina(false);
			}
		}
	}
	
	public void impostaMuro(int x, int y) {
		//impostare nella cella x,y del tabellone un muro
		//prevedere e gestire eventuali eccezioni
		tabellone[x][y] = new CellaMuro();
	}
	
	public void esegui() {
		//play del gioco con tanto di input (sarebbe un while(true))
		//con input del player e update dei fantasmini
		while(true) {
			//update
			pacMan.sposta();
			fantasmini.forEach(x->x.sposta());
			controllaPosizioni();
			
			//draw
			System.out.println(this.toString());
		}
	}
	
	public int getPunteggio() {
		return pacMan.getPunteggio();
	}
	
	public void termina() {
		System.exit(0);
	}
	
	public boolean controlloPuntoValido(int x, int y) {
		return (x>=0 && x<tabellaLength) && (y>=0 && y<tabellaLength);
	}
	
	/**
	 * 
	 * @param p2d
	 * @return ritorna true se la cella e' libera
	 */
	public boolean controllaCellaLibera(Punto2D p2d) {
		return tabellone[p2d.x][p2d.y].getClass()==CellaLibera.class;
	}
	
	public boolean controllaPallinaNellaCella(Punto2D p2d) {
		return ((CellaLibera)tabellone[p2d.x][p2d.y]).getPallina();
	}
	
	public void mangiaPallina(Punto2D p2d) {
		((CellaLibera)tabellone[p2d.x][p2d.y]).setPallina(false);
	}
	
	public void controllaPosizioni() {
		//se un fantasmino e pacMan si trovano sulla stessa posizione chiamare termina()
		for(Fantasmino f: fantasmini) {
			if(f.posizione.equals(pacMan.posizione))
				termina();
		}
	}
	
	@Override
	public String toString() {
		//le celle su cui si trovano pacman ed i fantasmini sono celle libere seneza pallina
		//prima disegno tutte le celle poi pacman ed i fantasmini
		StringBuilder[] sbArray = new StringBuilder[tabellaLength];
		for(int i=0; i<tabellaLength; i++) {
			sbArray[i] = new StringBuilder();
			for(int k=0; k<tabellaLength; k++) {
				sbArray[i].append(tabellone[i][k]);
			}
			sbArray[i].append("\n");
		}
		//aggiungere pacman 
		sbArray[pacMan.posizione.x].replace(pacMan.posizione.y, pacMan.posizione.y+1, pacMan.toString());
		for(Fantasmino f: fantasmini)
			sbArray[f.posizione.x].replace(f.posizione.y, f.posizione.y+1, f.toString());
		String out = "";
		for(int i=0; i<tabellaLength; i++)
			out += sbArray[i].toString();
		//aggiungi il punteggio
		out += "Punti: "+pacMan.getPunteggio()+"\n\n";
		return out;
	}
	
	public static void main(String[] args) {
		GiocoDelPacMan gp = new GiocoDelPacMan(10);
		gp.esegui();
	}
}
