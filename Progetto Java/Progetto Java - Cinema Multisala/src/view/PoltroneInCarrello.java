package view;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import model.Posto;

@SuppressWarnings("serial")
public class PoltroneInCarrello extends JPanel{
	Posto posto;
	
	public PoltroneInCarrello(Posto posto) {
		this.posto=posto;
		initGui();
	}
	
	private void initGui() {
		this.setLayout(new BorderLayout());
		ImageIcon image = (ImageIcon) posto.getIcon();
		JLabel pol_im = new JLabel(image);
		JLabel text = new JLabel();
		text.setText("  Pol. N:" + posto.getId());
		
		this.add(pol_im,BorderLayout.WEST);
		this.add(text);
		
		this.setVisible(true);
		
	}
}
