package view;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JPanel;

import model.Spettacolo;

@SuppressWarnings("serial")
public class OperaListPanel extends JPanel {
	

	public OperaListPanel (ArrayList<Spettacolo> arrSpettacoli) {
		
		setBackground(Color.white);
		
		setLayout(new GridLayout(0,2));

		for (Spettacolo spet : arrSpettacoli) {
			add(new ListEntry(spet));
		}
		
	}

}
