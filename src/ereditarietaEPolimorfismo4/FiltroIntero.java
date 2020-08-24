package ereditarietaEPolimorfismo4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FiltroIntero extends Filtro{

	private int interoDaFiltrare;
	
	public int getInteroDaFiltrare() { return interoDaFiltrare; }
	
	public FiltroIntero(int filtro) {
		this(new ArrayList<Integer>(), filtro);
	}
	
	public FiltroIntero(List<Integer> l, int filtro) {
		super(l);
		interoDaFiltrare = filtro;
	}
	
	@Override
	public List<Integer> filtra() {
		return filtra(listaDiInteri);
		//return listaDiInteri.stream().filter(x-> x!=interoDaFiltrare).collect(Collectors.toList());
	}

	@Override
	public List<Integer> filtra(List<Integer> l) {
		return l.stream().filter(x-> x!=interoDaFiltrare).collect(Collectors.toList());
	}

}
