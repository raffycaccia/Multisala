package interfacciaGrafica;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CarrelloPanel extends JPanel{
	JPanel cart_element = new JPanel();

	public CarrelloPanel() {
		initGui();
	}

	private void initGui() {
		this.removeAll();
		this.setLayout(new BorderLayout(20, 30)); 

		JLabel cartimage = new JLabel(new ImageIcon("image/carrello/immagine.png"));
		JLabel button_buy = new JLabel(new ImageIcon("image/carrello/pulsante.png"));

		this.add(cart_element,BorderLayout.CENTER);
		this.add(cartimage,BorderLayout.NORTH);
		this.add(button_buy,BorderLayout.SOUTH);

		this.setVisible(true);
	}

	public void addPostoCarrello() {

	}
	
	public void removePostoCarrello() {

	}

}
