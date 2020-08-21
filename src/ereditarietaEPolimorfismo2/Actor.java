package ereditarietaEPolimorfismo2;

import java.util.Random;

public abstract class Actor {

	protected Random random;
	protected GiocoDelPacMan gDPM;
	protected Punto2D posizione;
	
	public Actor(GiocoDelPacMan gdpm, int x, int y) {
		gDPM = gdpm;
		posizione = new Punto2D(x, y);
		random = new Random();
	}
	
	public boolean sposta() {
		//cambia la posizione dell'actor in una posizione casuale ma valida
		//la cella deve essere contigua alla corrente posizione del personaggio
		//non deve contenere un muro,
		//se contiene una pallina questa viene mangiata e nel caso dell'actor pacman
		//deve incrementare il punteggio
		//se la cella è occupata da un fantasmino il gioco termina
		//in pratica prima di spostare 
		//ritorna true se ha mangiato una pallina
		Punto2D p2d;
		cellaLibera:
		while(true) {
			p2d = getPuntoValido();
			if(gDPM.controllaCellaLibera(p2d))
				break cellaLibera;
		}
		//sposto l'actor in quella posizione
		posizione = p2d;
		//controllo se la cella contiene una pallina, nel caso la tolgo e ritorno true
		if(gDPM.controllaPallinaNellaCella(p2d)) {
			gDPM.mangiaPallina(p2d); //tolgo la pallina
			return true;
		}
		return false;
		
	}
	
	protected Punto2D getPuntoValido() {
		Punto2D p2d;
		int randInt;
		int newX = -1, newY = -1;
		while(!gDPM.controlloPuntoValido(newX, newY)) {
			randInt= random.nextInt(4);
			switch(randInt) {
				case 0:
					//su
					newX = posizione.x-1;
					newY = posizione.y;
					break;
				case 1:
					//destra
					newX = posizione.x;
					newY = posizione.y+1;
					break;
				case 2:
					//giu
					newX = posizione.x+1;
					newY = posizione.y;
					break;
				case 3:
					//sinistra
					newX = posizione.x;
					newY = posizione.y-1;
					break;
			}
		}
		p2d = new Punto2D(newX, newY);
		return p2d;
	}
}
