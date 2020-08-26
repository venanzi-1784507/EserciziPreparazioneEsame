package ereditarietaEPolimorfismo6;

public class TagParagrafo extends Tag{

	public static final String TAG_APERTO = "<p>";
	public static final String TAG_CHIUSO = "</p>";
	
	public TagParagrafo(Elemento e) {
		super(e);
	}

	@Override
	public String toString() {
		return TAG_APERTO + elemento.toString() + TAG_CHIUSO;
	}
}
