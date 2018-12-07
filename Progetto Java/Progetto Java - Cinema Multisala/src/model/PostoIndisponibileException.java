package model;

import javax.swing.JOptionPane;

public class PostoIndisponibileException extends RuntimeException{
	
	public PostoIndisponibileException() {
		JOptionPane.showMessageDialog(null, "Posto non selezionabile", "ERRORE", 2);
	}
}
