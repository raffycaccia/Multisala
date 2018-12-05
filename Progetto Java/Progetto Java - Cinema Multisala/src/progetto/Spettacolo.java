package progetto;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import eccezioni.PoliticaNotAddedException;
import eccezioni.PoliticaAlreadyPresentException;

public class Spettacolo {
	
	private Calendar data;
	private Prezzo prezzo;
	private Sala sala;
	private Opera opera;
	private ArrayList<Prenotazione> prenotazioni;
	private HashMap<Cliente,PoliticaSconto> politicheSconto;
	
	
	public Spettacolo(Calendar dataOra, Prezzo prezzoBiglietto, Sala salaSpettacolo, Opera opera) {
		setData(dataOra);
		setPrezzo(prezzoBiglietto);
		prenotazioni = new ArrayList<Prenotazione>();
		politicheSconto = new HashMap<Cliente,PoliticaSconto>();
	}
	
	//TODO metodi da scrivere
	
	public void addPrenotazione(Prenotazione prenotazione) {
		prenotazioni.add(prenotazione.clone()); //ci vuole il clone???
	}
	
	public void setData(Calendar data) {
		this.data = data;
	}
	public void setOpera(Opera opera) {
		this.opera = opera.clone();
	}
	public void setPrezzo(Prezzo prezzo) {
		this.prezzo = prezzo;
	}
	public void setPoliticaSconto(PoliticaSconto politica, Cliente tipoCliente) throws PoliticaNotAddedException, PoliticaAlreadyPresentException {
		if (politicheSconto.putIfAbsent(tipoCliente, politica) != null) {
			if (politicheSconto.get(tipoCliente) == null) {
				throw new PoliticaNotAddedException(); //lancia una finestra di avviso
			}
			throw new PoliticaAlreadyPresentException(); //sostituisce la politica gia presente
		}
	}
	public void setSala(Sala sala) {
		this.sala = sala.clone();
	}
	
	public Calendar getData() {
		return data;
	}
	
	public float getIncasso() {
		float incasso = 0;
		for(Prenotazione p : prenotazioni) {
			PoliticaSconto pol = politicheSconto.get(p.getUtentePrenotazione());
			if (pol.getStato() == true) {
				incasso += (float) ((100.0 - pol.getPercentualeSconto()) * prezzo.getPrezzo());
			} else {
				incasso += prezzo.getPrezzo();
			}
		}
		return incasso;
	}
	
	public Opera getOpera() {
		return opera.clone();
	}
	
	public int getPostiDisponibili() {
		return sala.getTotalePosti() - prenotazioni.size();
	}
	
	public Prenotazione getPrenotazioneAtIndex(int index) {
		return prenotazioni.get(index).clone();
	}
	
	public Prezzo getPrezzo() {
		return prezzo;
	
	}
	
	public Sala getSala() {
		return sala.clone();
		
	}
	
	public PoliticaSconto getPoliticaSconto(Cliente tipoCliente) {
		return politicheSconto.get(tipoCliente);
	}

}
