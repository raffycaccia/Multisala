package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.ArrayList;

import javax.sound.sampled.ReverbType;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import model.DatabaseLoader;
import model.ResourceLoader;
import model.Sala;
import model.Spettacolo;
import view.Tema.Stile;

@SuppressWarnings("serial")
public class MainFrame extends JFrame {
	
	private JPanel pannelloDestro = null;

	public MainFrame() {

		setup();
		
		ArrayList<Spettacolo> arrSpettacoli = DatabaseLoader.caricaSpettacoli();
		ArrayList<Sala> arrSale = DatabaseLoader.caricaSale();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Stile e Layout frame
		setTitle("Progetto: Cinema Multisala");
		setLayout(new BorderLayout());
		setSize(1400, 900);
		setBackground(Color.white);
		//Creo pannello menu e programmazione
		pannelloDestro = new ProgrammazioneSettimanalePanel(arrSpettacoli, arrSale);
		TabBarPanel navMenu = new TabBarPanel();
		//Aggiungo pannelli al frame
		add(navMenu, BorderLayout.WEST);
		add(pannelloDestro, BorderLayout.CENTER);
		//setSelezionePostoPanel(arrSpettacoli.get(1));
		//Se ci sono spettacoli aggiungi scrollBar al pannello programmazione
		if ((arrSpettacoli != null) && arrSpettacoli.size() > 0) {
			JScrollPane scrollBar = new JScrollPane(pannelloDestro);
			scrollBar.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
			scrollBar.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
			scrollBar.setBorder(BorderFactory.createEmptyBorder());
			add(scrollBar);
		}


	}

	private void setup() {
		//Carica i custom font
		ResourceLoader.loadFonts();
		//Imposta il Tema
		new Tema(Stile.Scuro);
	}
	
	public void setSelezionePostoPanel(Spettacolo spet) {
		System.out.println("setto sel posto");
		pannelloDestro.removeAll();
		revalidate();
		//pannelloDestro.revalidate();
		System.out.println(pannelloDestro.equals(null));
		ArrayList<Spettacolo> arrSpettacoli = DatabaseLoader.caricaSpettacoli();
		pannelloDestro = new SelezionePostoPanel(arrSpettacoli.get(1));
		pannelloDestro.setVisible(true);
		pannelloDestro.revalidate();
		pannelloDestro.repaint();
		//pannelloDestro.add(new SelezionePostoPanel(spet));
		revalidate();
	}


}
