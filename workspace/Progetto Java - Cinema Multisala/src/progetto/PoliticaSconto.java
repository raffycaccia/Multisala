package progetto;

public class PoliticaSconto {
	
	//Dichiarazione variabili d'istanza
	private float percentuale;
	private boolean politicaAttiva;
	
	
	//Costruttore
	/**
	 	Costruisce una politica di sconto con uno stato
	 	e una determinata percentuale di sconto.
	 	@param stato: Indica se la politica é attiva o meno
	 	@param percentuale: La percentuale di sconto di questa politica
	 */
	public PoliticaSconto(boolean stato, float percentuale) {
		this.politicaAttiva = stato;
		this.percentuale = percentuale;
	}
	
	//Metodi modificatori
	
	public void setPoliticaSconto(boolean stato, float percentuale) {
		this.politicaAttiva = stato;
		this.percentuale = percentuale;
	}

	public void setPercentualeSconto(float percentuale) {
		this.percentuale = percentuale;
	}
	
	public void setActive() {
		this.politicaAttiva = true;
	}
	
	public void setDisabled() {
		this.politicaAttiva = false;
	}
	
	//Metodi d'accesso
	
	public float getPercentualeSconto() {
		return percentuale;
	}
	
	public boolean getStato() {
		return politicaAttiva;
	}

}
