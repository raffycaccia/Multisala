package progetto;

public class Film {
	String titolo, desc;
	
	/*
	 * Costruttore, inizializza le variabili del Film
	 */
	Film(String titolo, String desc){
		this.titolo=titolo;
		this.desc=desc;
	}
	
	
	/*
	 * ritorna il titolo del Film
	 */
	public String getTitolo() {
		return titolo;
	}
	
	/*
	 * ritorna la descrizione del Film
	 */
	public String GetDescrizione() {
		return desc;
	}
	
}
