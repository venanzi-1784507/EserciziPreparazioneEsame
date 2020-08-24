package ereditarietaEPolimorfismo4;

import java.util.List;
import java.util.stream.Collectors;

public class FiltroPrimo extends Filtro{

	public FiltroPrimo() {
		super();
	}
	
	public FiltroPrimo(List<Integer> l) {
		super(l);
	}
	
	@Override
	public List<Integer> filtra() {
		return filtra(listaDiInteri);
	}

	@Override
	public List<Integer> filtra(List<Integer> l) {
		if(l.isEmpty()) return l;
		int primo = l.get(0);
		return l.stream().filter(x->x!=primo).collect(Collectors.toList());
	}

}
