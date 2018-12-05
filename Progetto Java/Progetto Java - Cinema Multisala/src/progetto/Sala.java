package progetto;

import java.util.ArrayList;

public class Sala implements Cloneable {
	ArrayList<Posto> posti = new ArrayList<Posto>();
	int num_sala,righe,colonne;


	/**
	 * costruttore utilizzato per la creazione di una nuova sala
	 * @param id
	 * @param righe
	 * @param colonne
	 */
	public Sala(int id,int righe, int colonne) {
		this.num_sala=id;
		this.righe=righe;
		this.colonne=colonne;
	}


	/**
	 * costruttore da utilizzare per la creazione di 
	 * una sala conoscendo già lo stato die posti
	 * @param righe
	 * @param colonne
	 * @param posti
	 */
	public Sala(int righe,int colonne, ArrayList<Posto> posti ) {
		this.righe=righe;
		this.colonne=colonne;
		this.posti=posti;
	}

	/**
	 * Metodo che ritorna il numero di posti della sala
	 * @return ritorna il numero di posti della sala
	 */
	public int getTotalePosti() {
		return posti.size();
	}

	/**
	 * Metodo che ritorna il numero della sala
	 * @return ritorna il numero della sala
	 */
	public int getNumeroSala() {
		return num_sala;
	}
	
	/**
	 * ritorna il numero di righe (per i posti)
	 * @return
	 */
	public int getRighe() {
        return righe;
    }
	
	/**
	 * ritorna il numero di colonne (per i posti)
	 * @return
	 */
    public int getColonne() {
        return colonne;
    }
    
    /**
     * metodo che ritorna l'arraylist dei posti della sala;
     * @return posti
     */
    public ArrayList<Posto> getPosti() {
        return posti;
    }
	
	/**
	 * 
	 */
	public Sala clone() {
		try {
			return (Sala) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}

}
