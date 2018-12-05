package progetto;

import java.util.ArrayList;
import java.util.HashMap;
import eccezioni.PoliticaNotAddedException;
import eccezioni.PoliticaAlreadyPresentException;

public class Spettacolo {
	
	private Data data;
	private Prezzo prezzo;
	private Sala sala;
	private Opera opera;
	private ArrayList<Prenotazione> prenotazioni;
	private HashMap<Cliente,PoliticaSconto> politicheSconto;
	
	
	public Spettacolo(Data dataOra, float prezzoBiglietto, Sala salaSpettacolo, Opera opera) {
		setData(dataOra);
		setPrezzo(prezzoBiglietto);
		prenotazioni = new ArrayList<Prenotazione>();
		politicheSconto = new HashMap<Cliente,PoliticaSconto>();
	}
	
	
	/**
	 * Aggiunge una prenotazione
	 * @param prenotazione	 la prenotazione da aggiungere
	 */
	public void addPrenotazione(Prenotazione prenotazione) {
		prenotazioni.add(prenotazione.clone()); //ci vuole il clone???
	}
	
	/**
	 * Imposta una nuova data per lo spettacolo,
	 * sostituendo quella giá esistente
	 * @param data 			la nuova data dello spettacolo 
	 */
	public void setData(Data data) {
		this.data = data;
	}
	
	/**
	 * Imposta un'opera per lo spettacolo,
	 * sostituendo quella giá esistente
	 * @param opera			la nuova opea da aggiungere
	 */
	public void setOpera(Opera opera) {
		this.opera = opera.clone();
	}
	
	
	/**
	 * Imposta il prezzo per una prenotazione,
	 * sostituendo quello giá esistente
	 * @param prezzo		il prezzo della prenotazione
	 */
	public void setPrezzo(float prezzo) {
		this.prezzo.setPrezzo(prezzo);
	}
	
	
	/**
	 * Imposta una Politica di sconto relativa ad un certo tipo di Cliente.
	 * Se é giá presente una politica per un determinato tipo di Cliente, questa viene
	 * sovrascritta.
	 * @param politica								la politica di sconto da aggiungere a questo spettacolo
	 * @param tipoCliente							il tipo di Cliente per al quale si riferisce la politica
	 * @throws PoliticaNotAddedException
	 * @throws PoliticaAlreadyPresentException
	 */
	public void setPoliticaSconto(PoliticaSconto politica, Cliente tipoCliente) throws PoliticaNotAddedException, PoliticaAlreadyPresentException {
		if (politicheSconto.putIfAbsent(tipoCliente, politica) != null) {
			if (politicheSconto.get(tipoCliente) == null) {
				throw new PoliticaNotAddedException(); //lancia una finestra di avviso
			}
			throw new PoliticaAlreadyPresentException(); //sostituisce la politica gia presente
		}
	}
	
	/**
	 * Imposta una sala per questo spettacolo,
	 * sostituendo quella giá esistente
	 * @param sala			la sala per lo spettacolo
	 */
	public void setSala(Sala sala) {
		this.sala = sala.clone();
	}
	
	/**
	 * Restituisce la data dello spettacolo.
	 * @return la data dello spettacolo
	 */
	public Data getData() {
		return data;
	}
	
	/**
	 * Restituisce l'incasso di questo spettacolo
	 * @return l'incasso
	 */
	public float getIncasso() {
		float incasso = 0;
		for(Prenotazione p : prenotazioni) {
			PoliticaSconto pol = politicheSconto.get(p.getUtentePrenotazione());
			if (pol.getStato() == true) {
				//se la politica di sconto é attiva applica lo sconto
				incasso += (float) ((100.0 - pol.getPercentualeSconto()) * prezzo.getPrezzo());
			} else {
				incasso += prezzo.getPrezzo();
			}
		}
		return incasso;
	}
	
	/**
	 * Restituisce l'opera di questo spettacolo
	 * @return l'opera
	 */
	public Opera getOpera() {
		return opera.clone();
	}
	
	/**
	 * Restituisce i posti ancora disponibili per questo spettacolo
	 * @return i posti disponibili
	 */
	public int getPostiDisponibili() {
		return sala.getTotalePosti() - prenotazioni.size();
	}
	
	//TODO da rivedere
	/**
	 * Restituisce la prenotazione al dato indice
	 * @param index		l'indice della prenotazione
	 * @return la prenotazione
	 */
	public Prenotazione getPrenotazioneAtIndex(int index) {
		return prenotazioni.get(index).clone();
	}
	
	/**
	 * Restituisce il prezzo di una prenotazione
	 * @return il prezzo
	 */
	public float getPrezzo() {
		return prezzo.getPrezzo();
	
	}
	
	/**
	 * Restituisce la sala dello spettacolo
	 * @return la sala
	 */
	public Sala getSala() {
		return sala.clone();
		
	}
	
	/**
	 * Restituisce la PoliticaSconto relativa ad un Cliente
	 * @param tipoCliente		il cliente di cui si vuole conoscere la politica di sconto
	 * @return	la politica di sconto
	 */
	public PoliticaSconto getPoliticaSconto(Cliente tipoCliente) {
		return politicheSconto.get(tipoCliente);
	}

}
