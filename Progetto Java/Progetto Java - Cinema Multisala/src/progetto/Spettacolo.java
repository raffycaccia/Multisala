package progetto;

import java.util.ArrayList;
import java.util.Calendar;

public class Spettacolo {
	
	private Calendar data;
	private Prezzo prezzo;
	private PoliticaSconto polSconto;
	private Sala sala;
	private Opera opera;
	private ArrayList<Prenotazione> prenotazioni;
	//private ArrayList<PoliticaSconto>
	
	
	public Spettacolo(Data dataOra, Prezzo prezzoBiglietto, PoliticaSconto polSconto, Sala salaSpettacolo, Opera opera) {
		setData(dataOra);
		setPrezzo(prezzoBiglietto);
		prenotazioni = new ArrayList<Prenotazione>();
		
	}
	
	//TODO metodi da scrivere
	
	public void addPrenotazione(Prenotazione prenotazione) {
		prenotazioni.add(prenotazione); //Ci vuole il clone???
	}
	
	public void setData(Data data) {
		
	}
	public void setOpera(Opera opera) {
		
	}
	public void setPrezzo(Prezzo prezzo) {
		
	}
	public void setSconto(PoliticaSconto politica) {
		
	}
	public void setSala(Sala sala) {
		
	}
	
	public Calendar getData() {
		return data;
	}
	
	public float getIncasso() {
		float incasso = 0;
		for(Prenotazione p : prenotazioni) {
			switch (p.getUtentePrenotazione()) {
				case Bambino:
					
				case Pensionato:
				
				case Studente:
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
	
	public PoliticaSconto getPoliticaSconto() {
		return polSconto.clone();
		
	}

}
