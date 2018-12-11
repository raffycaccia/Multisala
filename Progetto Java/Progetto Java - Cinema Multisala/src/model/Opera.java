package model;

import java.awt.Image;

import javax.swing.ImageIcon;

//TODO rivedere descrizione interfaccia

/**
 * Un oggetto che implementa Opera é un possibile spettacolo.
 *
 */
public interface Opera extends Cloneable{
	
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
	
	ImageIcon getCopertina();

	Opera clone();
}
