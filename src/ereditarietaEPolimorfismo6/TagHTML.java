package ereditarietaEPolimorfismo6;

public class TagHTML extends Tag{

	public static final String TAG_APERTO = "<html>";
	public static final String TAG_CHIUSO = "</html>";
	
	public TagHTML(Elemento e) {
		super(e);
	}

	@Override
	public String toString() {
		return TAG_APERTO + elemento.toString() + TAG_CHIUSO;
	}
}
