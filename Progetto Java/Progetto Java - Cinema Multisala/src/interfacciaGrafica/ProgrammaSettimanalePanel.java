package interfacciaGrafica;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import progetto.Spettacolo;

public class ProgrammaSettimanalePanel extends JPanel {
	
	private static final int PANEL_SIZE = 400;
	
	public ProgrammaSettimanalePanel(ArrayList<Spettacolo> arrSpettacoli) {

		JLabel header = new JLabel("Programma Settimanale");
		header.setFont(ResourceLoader.HeaderFont);
		header.setForeground(new Color(170, 170, 170));
		add(header);
		//setSize(PANEL_SIZE, PANEL_SIZE);
		setBackground(Color.white);
		//setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		for (Spettacolo spet : arrSpettacoli) {
			add(new ListEntry(spet));
		}
		
		
		
		
	}
	
}
	
