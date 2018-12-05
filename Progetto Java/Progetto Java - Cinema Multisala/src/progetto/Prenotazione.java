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
	private final Posto postoScelto;
	
	public Prenotazione(Calendar dataPrenotazione, Opera operaPrenotata, Cliente utentePrenotazione, Posto postoScelto) {
		this.dataPrenotazione = dataPrenotazione;
		this.operaPrenotata = operaPrenotata;
		this.utentePrenotazione = utentePrenotazione;
		this.postoScelto = postoScelto;
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
	 * @return il posto della prenotazione
	 */
	public Posto getPosto() {
		return postoScelto;
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
