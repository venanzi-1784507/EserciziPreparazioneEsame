package ereditarietaEPolimorfismo2;

public class CellaLibera extends Cella{

	public static final String RAPPR_CELLA_LIBERA = " ";
	public static final String RAPPR_CELLA_LIBERA_CON_PALLINA = ".";
	protected boolean pallina;
	
	public void setPallina(boolean b) { pallina = b; }
	public boolean getPallina() { return pallina; }
	
	public CellaLibera() {
		pallina = true;
	}
	
	@Override
	public String toString() {
		if(pallina)
			return RAPPR_CELLA_LIBERA_CON_PALLINA;
		return RAPPR_CELLA_LIBERA;
	}
}
