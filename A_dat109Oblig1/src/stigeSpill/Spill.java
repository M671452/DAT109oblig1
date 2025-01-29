package stigeSpill;

public class Spill {
	private Spiller[] spillere;
	private Brett brett;
	private Terning terning;
	private int naavarendeSpiller;
	
	public Spill(String[] spillerNavn) {
		spillere = new Spiller[spillerNavn.length];
		for (int i = 0; i < spillerNavn.length; i++) {
			spillere[i] = new Spiller(spillerNavn[i]);
		}
		
		brett = new Brett();
		terning = new Terning();
		naavarendeSpiller = 0;
		
	}
	
	public void spillTur() {
		Spiller spiller = spillere[naavarendeSpiller];
		int trill = terning.trill();
		System.out.println(spiller.getNavn() + " trillet " + trill);
		
		int nyPosisjon = spiller.getPosisjon() + trill;
		if (nyPosisjon > 100) {
			System.out.println(spiller.getNavn() + " skal være i " + spiller.getPosisjon());
		} else {
			nyPosisjon = brett.getNyPosisjon(nyPosisjon);
			spiller.setPosisjon(nyPosisjon);
			System.out.println(spiller.getNavn() + " flytter til " + nyPosisjon);
		}
		
		if (nyPosisjon == 100) {
			System.out.println(spiller.getNavn() + " vinner spillet!");
			return;
		}
		
		naavarendeSpiller = (naavarendeSpiller + 1) % spillere.length;
	}
	
	public boolean spilletErOver() {
		for (Spiller spiller : spillere) {
			if (spiller.getPosisjon() == 100) {
				return true;
			}
		}
		return false;
	}
}
