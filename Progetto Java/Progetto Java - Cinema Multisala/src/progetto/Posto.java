package progetto;

import javax.swing.JComponent;

public class Posto extends JButton{

	/**
	 * stati:
	 * 	utilizzabili
	 * 	indisponibili
	 * 	prenotati
	 * 	venduti
	 */
	int status;
	
	
	Posto(){
		
	}
	
	public int getStatus() {
		return status;
	}
	
}
