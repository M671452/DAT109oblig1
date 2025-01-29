package stigeSpill;

public class Spiller {
	
	private String navn;
	private int posisjon;
	
	public Spiller(String navn) {
		this.navn = navn;
		this.posisjon = 1;
		
	}

	public String getNavn() {
		return navn;
	}

	public int getPosisjon() {
		return posisjon;
	}

	public void setPosisjon(int posisjon) {
		this.posisjon = posisjon;
	}

}
