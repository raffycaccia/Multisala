package model;

import javax.swing.ImageIcon;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class Posto extends JButton{
	//TODO si devono rifare tutti i commenti
	int id;
	private boolean disponibile,indisponibile,prenotato,venduto;

	public Posto(int id){
		this.id=id;
	}
	
	/**
	 * speriamo che funzioni l'immagine
	 * @param img
	 */
	public Posto(int id, ImageIcon img){
		this.id=id;
		this.setIcon(img);
		this.setBorderPainted(false);
		this.setContentAreaFilled(false);
		this.setSize(30, 30);	
	}

	//metodi di get
	
	/**
	 * 
	 * @return
	 */
    public int getStato() {
        if (disponibile == true) {
            return 0;
        }
        if (indisponibile == true) {
            return 1;
        }
        if (prenotato == true) {
            return 3;
        } else {
            return 4;
        }
    }
	
	/**
	 * 
	 * @return
	 */
	public int getId() {
		return id;
	}

	/**
	 * 
	 * @return
	 */
	public boolean isDisponibile() {
		return disponibile;
	}

	/**
	 * 
	 * @return
	 */
	public boolean isIndisponibile() {
		return indisponibile;
	}

	/**
	 * 
	 * @return
	 */
	public boolean isPrenotato() {
		return prenotato;
	}

	/**
	 * 
	 * @return
	 */
	public boolean isVenduto() {
		return venduto;
	}


	//metodi di set

	/**
	 * accetta valori true e false 
	 * @param disp
	 */
	public void setDisponibile(boolean disp) {
		this.disponibile=disp;
	}

	/**
	 * accetta valori true e false 
	 * @param 
	 */
	public void setIndisponibile(boolean indisp) {
		this.indisponibile=indisp;
	}

	/**
	 * accetta valori true e false 
	 * @param 
	 */
	public void setPrenotato(boolean pren) {
		this.prenotato=pren;
	}

	/**
	 * accetta valori true e false 
	 * @param 
	 */
	public void setVenduto(boolean vend) {
		this.venduto=vend;
	}
	
	public void setimage(ImageIcon img) {
		this.setIcon(img);
	}

}
