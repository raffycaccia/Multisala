package progetto;

import java.util.Calendar;

public class Spettacolo {
	
	private Calendar data;
	private Prezzo prezzo;
	private PoliticaSconto polSconto;
	private Sala sala;
	private Opera opera;
	
	
	public Spettacolo(Data dataOra, Prezzo prezzoBiglietto, PoliticaSconto polSconto, Sala salaSpettacolo, Opera opera) {
		setData(dataOra);
		setPrezzo(prezzoBiglietto);
		
	}
	
	//TODO metodi da scrivere
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
		return;
	}
	
	public Opera getOpera() {
		return opera.clone();
	}
	
	public int getPostiDisponibili() {
		return sala.getTotalePosti() - numPrenotazioni;
		
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
