package progetto;

public class PoliticaSconto {
	
	private float percentuale;
	private boolean politicaAttiva;
	
	public PoliticaSconto(boolean stato, float percentuale) {
		this.politicaAttiva = stato;
		this.percentuale = percentuale;
	}


	public void setPoliticaSconto(boolean stato, float percentuale) {
		this.politicaAttiva = stato;
		this.percentuale = percentuale;
	}
	
	public void setActive() {
		this.politicaAttiva = true;
	}
	
	
	public void setDisabled() {
		this.politicaAttiva = false;
	}
	
	public void setPercentualeSconto(float percentuale) {
		this.percentuale = percentuale;
	}
	
	public float getPercentualeSconto() {
		return this.percentuale;
	}

}
