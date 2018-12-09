package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.ResourceLoader;
import model.Sala;
import model.Spettacolo;

@SuppressWarnings("serial")
public class ProgrammaSettimanalePanel extends JPanel {

	//private static final int PANEL_SIZE = 400;

	public ProgrammaSettimanalePanel(ArrayList<Spettacolo> arrSpettacoli, ArrayList<Sala> arrSale) {
		
		//Stile e layout pannello
		setBackground(Color.white);
		setLayout(new BorderLayout());
		setBorder(new EmptyBorder(32, 32, 32, 32));

		//Crea header e lista
		createHeader(arrSale);
		createListPanel(arrSpettacoli, arrSale);



	}

	private void createHeader(ArrayList<Sala> arrSale) {
		//Crea pannello che conterrá l'header
		JPanel header = new JPanel();
		//Stile e Layout pannello
		header.setOpaque(false);
		header.setLayout(new BorderLayout());
		//Header label
		JLabel headerLbl = new JLabel("Programma Settimanale");
		TextStyler.setNavHeaderStyle(headerLbl);
		headerLbl.setBorder(new EmptyBorder(0,8,0,0));
		//Aggiunge la label al pannello dell'header
		header.add(headerLbl, BorderLayout.WEST);
		//Aggiunge il pannello dell'header al pannello della programmazione
		add(header, BorderLayout.NORTH);
		//Se esistono sale crea filtro sala e il subheader
		if ((arrSale != null) && arrSale.size() > 0) {
			//Crea selettore sala
			JComboBox<String> selectSala = new JComboBox<String>();
			selectSala.addItem("Tutte le sale");
			for (Sala s : arrSale) {
				selectSala.addItem(s.getNome());
			}
			//Dimensione selettore
			selectSala.setMaximumSize(new Dimension(10,30));
			//Distanzia il subheader dall'header
			header.add(Box.createVerticalStrut(25), BorderLayout.SOUTH);
			//Aggiunge il selettore sala al pannello dell'header
			header.add(selectSala, BorderLayout.EAST);
			//Crea subheader
			addSubHeader();
			return;
		}
		//Distanzia la lista se non c'é il subheader
		header.add(Box.createVerticalStrut(40), BorderLayout.SOUTH);

	}

	private void addSubHeader() {
		//Crea pannello subheader
		JPanel subHeader = new JPanel();
		//Stile e layout pannello
		subHeader.setOpaque(false);
		subHeader.setLayout(new BorderLayout());
		subHeader.setBorder(new EmptyBorder(0,2,0,0));
		//Aggiunge subheader al pannello della programmazione
		add(subHeader, BorderLayout.CENTER);
		//Crea checkbox per visualizzare solo le prossime proiezioni
		JCheckBox visualizzaProssimi = new JCheckBox("Solo prossimi spettacoli".toUpperCase());
		//visualizzaProssimi.setForeground(new Color(1,122,255));
		visualizzaProssimi.setForeground(TextStyler.TITLE_COLOR);
		visualizzaProssimi.setFont(ResourceLoader.TitleFont.deriveFont(13f));
		visualizzaProssimi.setPreferredSize(new Dimension(300,30));
		//Aggiunge la checkbox al subheader
		subHeader.add(visualizzaProssimi, BorderLayout.WEST);
		//Crea selettore filtri
		JComboBox<String> ordine = new JComboBox<String>();
		ordine.setName("Ordine");
		ordine.addItem("Cronologico");
		ordine.addItem("Sala crescente");
		ordine.addItem("A-Z");
		ordine.setVisible(false);
		//Aggiunge selettore filtri al pannello subheader
		subHeader.add(ordine, BorderLayout.EAST);
		//Distanzia subheader dalla lista degli spettacoli
		subHeader.add(Box.createVerticalStrut(10), BorderLayout.SOUTH);
		//Comportamento checkbox
		visualizzaProssimi.addActionListener((ActionEvent)->{
			if (visualizzaProssimi.isSelected()) {
				ordine.setVisible(true);
			} else {
				ordine.setVisible(false);
			}
		});
	}

	private void createListPanel(ArrayList<Spettacolo> arrSpettacoli, ArrayList<Sala> arrSale) {
		//Se ci sono spettacoli crea il pannello con la lista
		if ((arrSpettacoli != null) && arrSpettacoli.size() > 0) {
			add(new OperaListPanel(arrSpettacoli), BorderLayout.SOUTH);
		} else {
			JLabel noSpettacoliLbl = new JLabel("Non ci sono spettacoli per questa settimana.");
			add(noSpettacoliLbl, BorderLayout.CENTER);
		}
	}

}

