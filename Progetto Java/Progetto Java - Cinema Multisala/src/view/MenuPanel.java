package view;

import java.awt.Color;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

import model.ResourceLoader;
import model.Utente;

public class MenuPanel extends JLayeredPane {

	private Utente status = Utente.CLIENTE;
		
	public MenuPanel() {
		
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		setSize(100, 800);
		//setPreferredSize(new Dimension(200, 800));
		setBackground(Color.DARK_GRAY);
		setOpaque(true);
		JLabel header = new JLabel("Multisala");
		header.setFont(ResourceLoader.HeaderFont);
		header.setForeground(Color.white);
		add(header);
		
		
	}
	
	// per ora li metto qua
	public void setClientView() {
		status = Utente.CLIENTE;
	}
	
	public void setGestoreView() {
		status = Utente.GESTORE;
	}
}
