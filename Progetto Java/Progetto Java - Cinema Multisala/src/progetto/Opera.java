package progetto;

//TODO rivedere descrizione interfaccia

/**
 * Un oggetto che implementa Opera é un possibile spettacolo.
 *
 */
public interface Opera {
	
	/**
	 * Restituisce la descrizione dell'opera.
	 * @return	la descrizione dell'opera
	 */
	String getDescrizione();
	
	/**
	 * Restituisce il titolo dell'opera.
	 * @return	il titolo dell'opera
	 */
	String getTitolo();
	
	/**
	 * Restituisce la durata (in minuti) dell'opera.
	 * @return 	la durata in minuti
	 */
	int getDurata();
	
	//getCopertina();
}
