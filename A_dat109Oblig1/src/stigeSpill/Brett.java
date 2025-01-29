package stigeSpill;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Brett {
	
	private static final int SIZE = 100;
	private int[] ruter;
	
	public Brett() {
		ruter = new int[SIZE + 1];
		initialiserBrett();
	}

	private void initialiserBrett() {
		for (int i = 1; i <= SIZE; i++) {
			ruter[i] = i;
		}
		lastInnFraDatabase();
	}

	// KOBLING TIL DATABASE ER HER 
	private void lastInnFraDatabase() {
		String url = "jdbc:mysql://localhost:3306/stigespill";
		String bruker = "brukenavn";
		String passord = "passord";
		
		try (Connection conn = DriverManager.getConnection(url, bruker, passord);
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery("SELECT * FROM brett")) {
			      
			    while (rs.next()) {
			    	int start = rs.getInt("start");
			    	int slutt = rs.getInt("slutt");
			    	ruter[start] = slutt;
			    }
	     } catch (SQLException e) {
	    	 e.printStackTrace();
	     }
	}
	
	public int getNyPosisjon(int posisjon) {
		if (ruter[posisjon] > posisjon) {
			System.out.println("Stige! Flytter fra " + posisjon + " til " + ruter[posisjon]);
		} else if (ruter[posisjon] < posisjon) {
			System.out.println("Slange! Sklir fra " + posisjon + " til " + ruter[posisjon]);
		}
		return ruter[posisjon];
	}
}
