package ereditarietaEPolimorfismo;

import java.util.ArrayList;
import java.util.Random;

public class SparaTutto {

	private Sfondo[][] tabellone;
	private Navicella player;
	private ArrayList<Enemy> enemies;
	private Random random;
	
	public SparaTutto() {
		random = new Random();
		tabellone = new Sfondo[5][10];
		player = new Navicella();
		player.shot();
		enemies = new ArrayList<>();
		initTabellone();
		initEnemies();
		//aggiunta randomica di 3 stelle nella matrice tabellone
	}
	
	private void initTabellone() {
		int stelleCounter = 3;
		for(int i=0; i<tabellone.length; i++) {
			for(int k=0; k<tabellone[i].length; k++) {
				if(stelleCounter >0 && random.nextBoolean()) {
					tabellone[i][k] = new Stella();
					stelleCounter--;
				}
				else
					tabellone[i][k] = new Vuoto();
			}
		}
	}
	
	private void initEnemies() {
		enemies.add(new Alieno(9, 3));
		enemies.add(new Meteorite(tabellone[0].length-1, 0));
	}
	
	private void prossimoPasso() {
		for(Enemy e: enemies)
			e.prossimoPasso();
	}
	
	@Override
	public String toString() {
		ArrayList<StringBuilder> sbArray = new ArrayList<>();
		for(int r=0; r<tabellone.length; r++) {
			sbArray.add(new StringBuilder());
			for(int c=0; c<tabellone[r].length; c++) {
				sbArray.get(r).append(tabellone[r][c]);
			}
		}
		
		//inserire nello StringBuilder il player e i nemici
		sbArray.get((int)player.posizione.getY())
					.replace((int)player.posizione.getX(), (int)player.posizione.getX()+1, player.toString());
		//se il player sta sparando disegnare il laser
		if(player.isShooting()) {
			for(int i=0; i<tabellone[0].length; i++) {
				if(sbArray.get((int)player.posizione.getY()).substring(i, i+1).equals(Vuoto.VUOTO_RAPPRESENTAZIONE))
					sbArray.get((int)player.posizione.getY()).replace(i, i+1, "-");
			}
		}
		for(Enemy e: enemies) {
			sbArray.get((int)((Actor)e).posizione.getY())
			.replace((int)((Actor)e).posizione.getX(), (int)((Actor)e).posizione.getX()+1, e.toString());
		}
		
		//creare la stringa
		String out = "";
		for(StringBuilder sb: sbArray)
			out += sb.toString() +"\n";
		return out;
	}
	
	public static void main(String[] args) {
		SparaTutto st = new SparaTutto();
		System.out.println(st);
	}
}
