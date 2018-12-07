package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import model.ResourceLoader;
import model.Sala;
import model.Spettacolo;

public class MainFrame extends JFrame {
	
	public MainFrame(ArrayList<Spettacolo> arrSpettacoli, ArrayList<Sala> arrSale) {
		ResourceLoader.loadFonts();
		
		JPanel progSet = new ProgrammaSettimanalePanel(arrSpettacoli, arrSale);

		setLayout(new BorderLayout());
		MenuPanel navMenu = new MenuPanel();
		add(navMenu, BorderLayout.WEST);
		
		add(progSet, BorderLayout.CENTER);
		
		if ((arrSpettacoli != null) && arrSpettacoli.size() > 0) {
			JScrollPane scrollBar = new JScrollPane(progSet);
			scrollBar.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
			scrollBar.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
			add(scrollBar);
		}
		
		setSize(1400, 900);
		setBackground(Color.white);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	
}
