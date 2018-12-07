package model;

//TODO descrizione classe
/**
 * PoliticaSconto
 *
 */

public class PoliticaSconto implements Cloneable {
	
	//Dichiarazione variabili d'istanza
	
	private float percentuale;
	private boolean politicaAttiva;
	
	
	//Costruttore
	
	/**
	 	Costruisce una politica di sconto con uno stato
	 	e una determinata percentuale di sconto.
	 	@param stato		indica se la politica é attiva o meno
	 	@param percentuale 	la percentuale di sconto di questa politica
	 */
	public PoliticaSconto(boolean stato, float percentuale) {
		this.politicaAttiva = stato;
		this.percentuale = percentuale;
	}
	
	//Metodi modificatori
	
	/**
	 	Modifica una politica di sconto con un nuovo stato
	 	e una determinata percentuale di sconto.
	 	@param stato		indica se la politica é attiva o meno
	 	@param percentuale 	la percentuale di sconto di questa politica
	 */
	public void setPoliticaSconto(boolean stato, float percentuale) {
		this.politicaAttiva = stato;
		this.percentuale = percentuale;
	}

	/**
	 * Modifica la percentuale di sconto.
	 * @param percentuale 	la percentuale di sconto di questa politica
	 */
	public void setPercentualeSconto(float percentuale) {
		this.percentuale = percentuale;
	}
	
	/**
	 * Attiva la politica di sconto.
	 */
	public void setActive() {
		this.politicaAttiva = true;
	}
	
	/**
	 * Disabilita la politica di sconto.
	 */
	public void setDisabled() {
		this.politicaAttiva = false;
	}
	
	//Metodi d'accesso
	
	/**
	 * Restituisce la percentuale di sconto della politica.
	 * @return la percentuale di sconto
	 */
	public float getPercentualeSconto() {
		return percentuale;
	}
	
	/**
	 * Restituisce lo stato di validita della politica.
	 * @return lo stato di validita della politica di sconto
	 */
	public boolean getStato() {
		return politicaAttiva;
	}
	
	//Clone
	
	/**
	 * Restituisce un clone dell'oggetto.
	 * @return il clone dell'oggetto
	 */
	public PoliticaSconto clone() {
		try {
			return (PoliticaSconto) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}
}
