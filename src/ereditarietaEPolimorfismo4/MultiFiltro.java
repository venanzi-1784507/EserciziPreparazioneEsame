package ereditarietaEPolimorfismo4;

import java.util.ArrayList;
import java.util.List;

public class MultiFiltro extends Filtro{

	private ArrayList<Filtro> filtri;
	
	public MultiFiltro(List<Filtro> l) {
		super();
		filtri = new ArrayList<>(l);
	}
	
	public MultiFiltro(List<Filtro> lf, List<Integer> li) {
		super(li);
		filtri = new ArrayList<>(lf);
	}
	
	@Override
	public List<Integer> filtra() {
		return filtra(listaDiInteri);
	}

	@Override
	public List<Integer> filtra(List<Integer> l) {
		//se una delle due liste è vuota ritornare la medesima lista di interi
		if(l.isEmpty() || filtri.isEmpty()) return l;
		ArrayList<Integer> ali = new ArrayList<>(l);
		for(Filtro f: filtri)
			ali = new ArrayList<>(f.filtra(ali));
		return ali;
	}
	
	public static void main(String[] args) {
		Filtro f1 = new FiltroIntero(List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9), 4);
		Filtro f2 = new FiltroPrimo(List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
		Filtro f3 = new FiltroDispari(List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)); 
		Filtro f4 = new MultiFiltro(List.of(f1,  f2 , f3), List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
		
		//filtro intero elimina l'elemento ad indice 4
		System.out.println(f1.filtra().toString());
		//filtro primo elimina il primo elemento della lista e le sue occorrenze
		System.out.println(f2.filtra().toString());
		//filtro dispari elimina tutti gli elementi in posizione dispari 
		//nella lista il primo elemento ha indice 0(zero)
		System.out.println(f3.filtra().toString());
		//multri filtro esegue in sequenza i filtri dati in input nel costruttore
		System.out.println(f4.filtra().toString());
	}

}
