package progetto;

import java.util.ArrayList;

public class Sala implements Cloneable {
	ArrayList<Posto> posti = new ArrayList<Posto>();
	int num_sala;
	
	
	/*
	 * Metodo che ritorna il numero di posti della sala
	 * @return ritorna il numero di posti della sala
	 */
	public int getTotalePosti() {
		return posti.size();
	}
	
	
	/*
	 * Metodo che ritorna un Posto in base ad un indice (numero del posto)
	 * @param numero del posto da ritornare
	 * @return ritorna un Posto (oggetto di tipo Posto)
	 */
	public Posto getPosto(int ind) {
		return posti.get(ind);
	}
	
	
	public Sala clone() {
		try {
			return (Sala) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}

}
