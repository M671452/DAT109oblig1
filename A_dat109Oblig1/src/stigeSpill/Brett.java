package stigeSpill;

public class Brett {
	
	private static final int SIZE = 100;
	private int[] brett;
	
	public Brett() {
		brett = new int[SIZE + 1];
		initialisereBrett();
	}

	private void initialisereBrett() {
		for (int i = 1; i <= SIZE; i++) {
			brett[i] = i;
		}
		
		// Definerer some slanger
        brett[16] = 6;
        brett[47] = 26;
        brett[49] = 11;
        brett[56] = 53;
        brett[62] = 19;
        brett[64] = 60;
        brett[87] = 24;
        brett[93] = 73;
        brett[95] = 75;
        brett[98] = 78;
        
        // Definerer some stiger
        brett[2] = 38;
        brett[7] = 14;
        brett[8] = 31;
        brett[15] = 26;
        brett[21] = 82;
        brett[28] = 84;
        brett[36] = 44;
        brett[51] = 67;
        brett[71] = 91;
        brett[78] = 98;
		
	}
	
	public int getNyPosisjon(int posisjon) {
		return brett[posisjon];
	}
	
	

}
