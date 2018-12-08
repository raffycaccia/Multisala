package view;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

import model.Spettacolo;

public class OperaListPanel extends JPanel {
	

	public OperaListPanel (ArrayList<Spettacolo> arrSpettacoli) {
		
		setBackground(Color.white);
		
		setLayout(new GridLayout(0,2));

		for (Spettacolo spet : arrSpettacoli) {
			add(new ListEntry(spet));
		}
		
	}

}
