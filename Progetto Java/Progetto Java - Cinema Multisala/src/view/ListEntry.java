package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.time.DayOfWeek;
import java.time.Month;
import java.time.format.TextStyle;

import javax.swing.ImageIcon;
import javax.swing.JButton;
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
	
	public static final int MESE_WIDTH = 100;
	public static final int MESE_HEIGHT = 30;
	
	public static final int TITLE_WIDTH = PANEL_WIDTH - MESE_WIDTH - 30;
	public static final int TITLE_HEIGHT = 30;
	
	public static final int DURATA_WIDTH = 100;
	public static final int DURATA_HEIGHT = 30;
	
	public static final int GIORNO_WIDTH = 100;
	public static final int GIORNO_HEIGHT = 30;
	
	public static final int INFO_WIDTH = 400;
	public static final int INFO_HEIGHT = 30;
	
	public static final int PRENOTABTN_WIDTH = 88;
	public static final int PRENOTABTN_HEIGHT = 30;
	
	public ListEntry(Spettacolo spet) {
		//Setta le dimensioni dell'entry
		setPreferredSize(new Dimension(PANEL_WIDTH,PANEL_HEIGHT));
		//Crea bordo
		RettangoloArrotondato rettangoloDecorativo = new RettangoloArrotondato();
		rettangoloDecorativo.setBounds(0,0,PANEL_WIDTH,PANEL_HEIGHT);
		//Label titolo
		JLabel titolo = new JLabel(spet.getOpera().getTitolo());
		TextStyler.setTitleStyle(titolo);
		titolo.setBounds(32, 32, TITLE_WIDTH, TITLE_HEIGHT);
		//Label descrizione
		JTextArea desc = new JTextArea(spet.getOpera().getDescrizione());
		TextStyler.setDescriptionStyle(desc);
		desc.setBounds(32, 450, DESC_WIDTH, DESC_HEIGHT);
		//Label durata
		JLabel durata = new JLabel(spet.getOpera().getDurata() + " MINUTI");
		TextStyler.setDescriptionStyle(durata);
		durata.setBounds(32, 410, DURATA_WIDTH, DURATA_HEIGHT);
		//Label mese
		String mese = (Month.of(spet.getData().getMese()).getDisplayName(TextStyle.SHORT, getLocale()).toUpperCase());
		JLabel meseLbl = new JLabel(mese);
		TextStyler.setDataStyle(meseLbl);
		meseLbl.setBounds(PANEL_WIDTH - 60, 25, GIORNO_WIDTH, GIORNO_HEIGHT);
		//Label giorno
		JLabel giornoLbl = new JLabel(spet.getData().getGiorno() + "");
		TextStyler.setDataStyle(giornoLbl);
		giornoLbl.setBounds(PANEL_WIDTH - 50, 45, GIORNO_WIDTH, GIORNO_HEIGHT);
		//Label orario
		String orario = "INIZIA ALLE: " + spet.getData().getOra() + ":" + spet.getData().getMinuto();
		String sala = "SALA " + spet.getSala().getNome();
		JLabel infoLbl = new JLabel(orario + ", " + sala);
		TextStyler.setInfoStyle(infoLbl);
		infoLbl.setBounds(32, 390, INFO_WIDTH, INFO_HEIGHT);
		//Tasto prenota
		JButton prenotaBtn = new JButton("PRENOTA", new ImageIcon("image/buttonIcon/prenota.png"));
		ButtonStyler.setIconButtonStyle(prenotaBtn);
		prenotaBtn.setBounds(PANEL_WIDTH - PRENOTABTN_WIDTH - 25, PANEL_HEIGHT - PRENOTABTN_HEIGHT - 25, PRENOTABTN_WIDTH, PRENOTABTN_HEIGHT);
		//Aggiunge i components al panel dell'entry
		add(prenotaBtn,1);
		add(titolo, 2);
		add(desc, 3);
		add(durata, 4);
		add(meseLbl, 5);
		add(giornoLbl,6);
		add(infoLbl, 7);
		add(rettangoloDecorativo, 8);
	}

}
