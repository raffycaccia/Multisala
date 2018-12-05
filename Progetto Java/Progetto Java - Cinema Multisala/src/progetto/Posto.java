package progetto;

import javax.swing.JButton;

public class Posto extends JButton{
	//TODO si devono rifare tutti i commenti
	int id;
	private boolean disponibile,indisponibile,prenotato,venduto;

	Posto(int id){
		this.id=id;
	}

	//metodi di get
	
	/**
	 * 
	 * @return
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * 
	 * @return
	 */
	public boolean isDisponibile() {
		return disponibile;
	}
	
	/**
	 * 
	 * @return
	 */
	public boolean isIndisponibile() {
		return indisponibile;
	}

	/**
	 * 
	 * @return
	 */
	public boolean isPrenotato() {
		return prenotato;
	}

	/**
	 * 
	 * @return
	 */
	public boolean isVenduto() {
		return venduto;
	}


	//metodi di set

	/**
	 * accetta valori true e false 
	 * @param disp
	 */
	public void setDisponibile(boolean disp) {
		this.disponibile=disp;
	}

	/**
	 * accetta valori true e false 
	 * @param 
	 */
	public void setIndisponibile(boolean indisp) {
		this.indisponibile=indisp;
	}

	/**
	 * accetta valori true e false 
	 * @param 
	 */
	public void setPrenotato(boolean pren) {
		this.prenotato=pren;
	}

	/**
	 * accetta valori true e false 
	 * @param 
	 */
	public void setVenduto(boolean vend) {
		this.venduto=vend;
	}
	
}
