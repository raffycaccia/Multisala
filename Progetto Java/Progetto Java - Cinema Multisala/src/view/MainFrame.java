package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.CompoundBorder;

import model.ResourceLoader;
import model.Sala;
import model.Spettacolo;

public class MainFrame extends JFrame {
	
	public MainFrame(ArrayList<Spettacolo> arrSpettacoli, ArrayList<Sala> arrSale) {
		//Carica i custom font
		ResourceLoader.loadFonts();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Stile e Layout frame
		setTitle("Progetto: Cinema Multisala");
		setLayout(new BorderLayout());
		setSize(1400, 900);
		setBackground(Color.white);
		CompoundBorder menuBorder = new CompoundBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.black),
						BorderFactory.createMatteBorder(1, 1, 1, 0, new Color(90,90,90)));
		//Creo pannello menu e programmazione
		JPanel progSet = new ProgrammaSettimanalePanel(arrSpettacoli, arrSale);
		MenuPanel navMenu = new MenuPanel();
		//Aggiungo pannelli al frame
		add(navMenu, BorderLayout.WEST);
		add(progSet, BorderLayout.CENTER);
		//Se ci sono spettacoli aggiungi scrollBar al pannello programmazione
		if ((arrSpettacoli != null) && arrSpettacoli.size() > 0) {
			JScrollPane scrollBar = new JScrollPane(progSet);
			scrollBar.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
			scrollBar.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
			scrollBar.setBorder(BorderFactory.createEmptyBorder());
			add(scrollBar);
		}


	}

	
}
