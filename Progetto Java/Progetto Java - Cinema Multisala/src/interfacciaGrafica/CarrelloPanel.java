package interfacciaGrafica;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import eccezioni.PostoIndisponibileException;
import progetto.Posto;

public class CarrelloPanel extends JPanel{
	JPanel cart_element = new JPanel();
	ArrayList<PoltroneInCarrello> poltrone = new ArrayList<>();

	public CarrelloPanel() {
		initGui();
	}

	private void initGui() {
		
		this.removeAll();
		this.setLayout(new BorderLayout(20, 30)); 

		JLabel cartimage = new JLabel(new ImageIcon("image/carrello/immagine.png"));
		JButton button_buy = new JButton(new ImageIcon("image/carrello/pulsante.png"));

		this.add(cart_element,BorderLayout.CENTER);
		this.add(cartimage,BorderLayout.NORTH);
		this.add(button_buy,BorderLayout.SOUTH);
		
		button_buy.addActionListener(AcquistaClick());
		button_buy.setBorderPainted(false);
		button_buy.setContentAreaFilled(false);
		
		this.setVisible(true);
	}
	
	/**
	 * metodo che aggiorna il carrello
	 */
	private void refresh() {
		cart_element.removeAll();
		for(int i=0; i<poltrone.size();i++) {
			cart_element.add(poltrone.get(i));
		}
	}
	
	/**
	 * Metodo che aggiunge una poltrona al carrello
	 */
	public void addPostoCarrello(Posto posto) {
		poltrone.add(new PoltroneInCarrello(posto));
		refresh();
	}
	
	/**
	 * Metodo che rimuove una poltrona al carrello
	 * 	qui va fatta anche la ricercaa!!
	 */
	public void removePostoCarrello() {
		//ciclo
		refresh();
	}
	
	
	private ActionListener  AcquistaClick() {
		ActionListener evento = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "PROVA EVENTO");
			}
				
			};
		
		return evento;
	}

}
