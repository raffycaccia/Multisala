package progetto;

import java.util.Calendar;

/**
 * Contiene i dati di una prenotazione
 *
 */
public class Prenotazione implements Cloneable {
	
	private final Calendar dataPrenotazione;
	private final Opera operaPrenotata;
	private final Cliente utentePrenotazione;
	
	public Prenotazione(Calendar dataPrenotazione, Opera operaPrenotata, Cliente utentePrenotazione) {
		this.dataPrenotazione = dataPrenotazione;
		this.operaPrenotata = operaPrenotata;
		this.utentePrenotazione = utentePrenotazione;
	}

	/**
	 * @return la data della prenotazione
	 */
	public Calendar getDataPrenotazione() {
		return dataPrenotazione;
	}

	/**
	 * @return l'opera prenotata
	 */
	public Opera getOperaPrenotata() {
		return operaPrenotata;
	}

	/**
	 * @return il tipo di utente che ha effettuato la prenotazione
	 */
	public Cliente getUtentePrenotazione() {
		return utentePrenotazione;
	}
	
	public Prenotazione clone() {
		try { 
			return (Prenotazione) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	
	

}
