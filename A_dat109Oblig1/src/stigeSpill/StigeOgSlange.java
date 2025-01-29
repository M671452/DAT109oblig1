package stigeSpill;

public class StigeOgSlange {
	
	public static void main(String[] args) {
		String[] spillerNavn = {"Alice", "Bob"};
		Spill spill = new Spill(spillerNavn);
		
		while (!spill.spilletErOver()) {
			spill.spillTur();
		}
	}
}
