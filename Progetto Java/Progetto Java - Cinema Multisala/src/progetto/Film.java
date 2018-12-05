package progetto;

public class Film {
	String titolo, desc;
	int durata; //espressa in minuti
	
	/**
	 * Costruttore, inizializza le variabili del Film
	 * @param titolo il titolo del film
	 * @param desc descrizione del film
	 * @param durata durata del Film espressa in minuti
	 */
	Film(String titolo, String desc, int durata){
		this.titolo=titolo;
		this.desc=desc;
		this.durata=durata;
	}
	
	
	/**
	 * Questo metodo ritorna il titolo del film
	 * @return String
	 */
	public String getTitolo() {
		return titolo;
	}
	
	/**
	 * Questo metodo ritorna la descrizione del film
	 * @return String
	 */
	public String GetDescrizione() {
		return desc;
	}
	
	
	/**
	 * Questo metodo modifica il titolo del film
	 * @param newtitolo il nuovo titolo del film
	 */
	public void setTitolo(String newtitolo) {
		titolo=newtitolo;
	}
	
	/**
	 * Questo metodo modifica la descrizione del film
	 * @param newDesc la nuova descrizione del film
	 */
	public void setDescrizione(String newDesc) {
		desc=newDesc;
	}
	
}
