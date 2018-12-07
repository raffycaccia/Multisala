package view;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JPanel;

import model.Spettacolo;

public class OperaListPanel extends JPanel {
	

	public OperaListPanel (ArrayList<Spettacolo> arrSpettacoli) {
		
		setBackground(Color.white);

		for (Spettacolo spet : arrSpettacoli) {
			add(new ListEntry(spet));
		}
		
	}

}
