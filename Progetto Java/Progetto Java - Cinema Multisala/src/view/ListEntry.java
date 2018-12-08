package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JTextArea;

import model.ResourceLoader;
import model.Spettacolo;

public class ListEntry extends JLayeredPane {
	
	public static final int PANEL_WIDTH = 400;
	public static final int PANEL_HEIGHT = (int) ((PANEL_WIDTH) * 1.6f);
	
	public static final int DESC_WIDTH = PANEL_WIDTH - 80;
	public static final int DESC_HEIGHT = 180;
	
	public static final int TITLE_WIDTH = PANEL_WIDTH - 60;
	public static final int TITLE_HEIGHT = 30;
	
	public static final int DURATA_WIDTH = 100;
	public static final int DURATA_HEIGHT = 30;
	
	public static final int GIORNO_WIDTH = 100;
	public static final int GIORNO_HEIGHT = 30;

	public static final int INFO_WIDTH = 400;
	public static final int INFO_HEIGHT = 30;
	
	public ListEntry(Spettacolo spet) {
		//Setta le dimensioni dell'entry
		setPreferredSize(new Dimension(PANEL_WIDTH,PANEL_HEIGHT));
		//Crea bordo
		RettangoloArrotondato rettangoloDecorativo = new RettangoloArrotondato();
		rettangoloDecorativo.setBounds(0,0,PANEL_WIDTH,PANEL_HEIGHT + 200);
		//Label titolo
		JLabel titolo = new JLabel(spet.getOpera().getTitolo());
		TextStyler.setTitleStyle(titolo);
		titolo.setBounds(30, 30, TITLE_WIDTH, TITLE_HEIGHT);
		//Label descrizione
		JTextArea desc = new JTextArea(spet.getOpera().getDescrizione());
		TextStyler.setDescriptionStyle(desc);
		desc.setBounds(30, 70, DESC_WIDTH, DESC_HEIGHT);
		//Label durata
		JLabel durata = new JLabel(spet.getOpera().getDurata() + " MINUTI");
		TextStyler.setDescriptionStyle(durata);
		durata.setBounds(30, 250, DURATA_WIDTH, DURATA_HEIGHT);
		//Label data
		String data = (spet.getData().getGiorno() + "/" + spet.getData().getMese());
		JLabel dataLbl = new JLabel(data);
		TextStyler.setDataStyle(dataLbl);
		dataLbl.setBounds(50, 300, GIORNO_WIDTH, GIORNO_HEIGHT);
		//Label orario
		String orario = "INIZIA ALLE: " + spet.getData().getOra() + ":" + spet.getData().getMinuto();
		String sala = "SALA " + spet.getSala().getNome();
		JLabel infoLbl = new JLabel(orario + ", " + sala);
		TextStyler.setInfoStyle(infoLbl);
		infoLbl.setBounds(50, 400, INFO_WIDTH, INFO_HEIGHT);
		//Aggiunge i components al panel dell'entry
		add(titolo, 1);
		add(desc,1);
		add(durata, 1);
		add(dataLbl, 1);
		add(infoLbl, 1);
		add(rettangoloDecorativo, 2);
	}

}
