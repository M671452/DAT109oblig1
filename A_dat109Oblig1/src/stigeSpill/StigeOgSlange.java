package stigeSpill;

public class StigeOgSlange {
	
	public static void main(String[] args) {
		String[] spillerNavn = {"Alice", "Bob", "Charlie", "Dave"};
		Spill spill = new Spill(spillerNavn);
		
		while (!spill.spilletErOver()) {
			spill.spillTur();
		}
	}
}

/*
1. Start PostgreSQL og pgAdmin**
- Åpne **pgAdmin** og logg inn på PostgreSQL-serveren din.

---

2. Opprett en ny database**
1. **Høyreklikk på "Databases"** i venstre panel i pgAdmin.
2. Klikk på **"Create" → "Database"**.
3. Gi databasen navnet `stigespill` og klikk **"Save"**.

---

3. Opprett en tabell for brettet**
1. Klikk på **"stigespill"**-databasen i venstre panel.
2. Klikk på **"Query Tool"** og kjør følgende SQL-spørring for å opprette en tabell for slanger og stiger:

```sql
CREATE TABLE brett (
    id SERIAL PRIMARY KEY,
    start INT NOT NULL,
    slutt INT NOT NULL
);
```

---

4. Sett inn data for slanger og stiger**
Kjør følgende SQL-spørring for å legge inn noen eksempler på slanger og stiger:

```sql
INSERT INTO brett (start, slutt) VALUES
(16, 6), (47, 26), (49, 11), (56, 53), (62, 19), 
(64, 60), (87, 24), (93, 73), (95, 75), (98, 78), 
(2, 38), (7, 14), (8, 31), (15, 26), (21, 82), 
(28, 84), (36, 44), (51, 67), (71, 91), (78, 98);
```

---

5. Oppdater JDBC-tilkoblingen i koden**
Endre JDBC URL-en i `lastInnFraDatabase()`-metoden i **Brett**-klassen til:

```java
String url = "jdbc:postgresql://localhost:5432/stigespill";
String bruker = "postgres";  // Sett til din PostgreSQL-bruker
String passord = "ditt_passord";  // Sett til ditt PostgreSQL-passord
```

---

6. Kjør programmet i Eclipse**
- Sørg for at du har lagt til **PostgreSQL JDBC-driveren** i prosjektet:
  1. Last ned `postgresql-<versjon>.jar` fra [JDBC Download](https://jdbc.postgresql.org/)
  2. Legg til JAR-filen i **Eclipse** (`Build Path` → `Add External JARs`).
- Kjør **main-metoden** i `SlangerOgStiger.java`.


*/