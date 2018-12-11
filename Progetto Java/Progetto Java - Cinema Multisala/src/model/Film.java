package model;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Film implements Opera{
	String titolo, desc;
	int durata; //espressa in minuti
	
	private ImageIcon cover = null;
	
	/**
	 * Costruttore, inizializza le variabili del Film
	 * @param titolo 	il titolo del film
	 * @param desc 		descrizione del film
	 * @param durata 	durata del Film espressa in minuti
	 */
	public Film(String titolo, String desc, int durata){
		this.titolo=titolo;
		this.desc=desc;
		this.durata=durata;
	}
	
	public Film(String titolo, String desc, int durata, ImageIcon cover){
		this.titolo=titolo;
		this.desc=desc;
		this.durata=durata;
		this.cover = cover;
	}
	
	//metodi di get
	
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
	public String getDescrizione() {
		return desc;
	}
	

	/**
	 * Questo metodo ritorna la durata espressa in minuti del Film
	 * @return int
	 */
	public int getDurata() {
		return durata;
	}
	
	//metodi di set
	
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
	
	/**
	 * 
	 * 
	 * 
	 */
	
	public String toString() {
		return getClass().getName() + "[Titolo = " + titolo + ", Descrizione = " + desc + ", Durata = " + durata + "]";
	}
	
	/**
	 * 
	 * 
	 * 
	 */
	
	public boolean equals(Object obj) {
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		Film film = (Film) obj;
		return titolo.equals(film.titolo) && desc.equals(film.desc) && durata == film.durata;
	}
	
	/**
	 * 
	 * 
	 * 
	 */
	
	public Film clone() {
		try {
			return (Film) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	
	}

	public ImageIcon getCopertina() {
		return cover;
	}
	
}
