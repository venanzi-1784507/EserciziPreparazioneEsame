package ereditarietaEPolimorfismo6;

public class PaginaHTML {

	private TagHTML pagina;
	
	public PaginaHTML(TagHTML tagHTML) {
		pagina = tagHTML;
	}
	
	@Override
	public String toString() {
		return pagina.toString();
	}
	
	public static void main(String[] args) {
		PaginaHTML phtml = new PaginaHTML(
				new TagHTML(
						new TagParagrafo(
								new SequenzaDiElementi(
										new TagGrassetto(new ElementoTesto("bella")), new ElementoTesto(" pe tutti"))
								)
						)
				);
		
		System.out.println(phtml.toString());
	}
}
