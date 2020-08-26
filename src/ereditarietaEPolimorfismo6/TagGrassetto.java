package ereditarietaEPolimorfismo6;

public class TagGrassetto extends Tag{
	
	public static final String TAG_APERTO = "<b>";
	public static final String TAG_CHIUSO = "</b>";

	public TagGrassetto(Elemento e) {
		super(e);
	}

	@Override
	public String toString() {
		return TAG_APERTO + elemento.toString() + TAG_CHIUSO;
	}
}
