package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.MouseListener;
import java.time.Month;
import java.time.format.TextStyle;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

import controller.PrenotaListener;
import model.Spettacolo;

@SuppressWarnings("serial")
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

	public static final int COVER_HEIGHT = 300;
	public static final int COVER_WIDTH = PANEL_WIDTH - 100;
	
	
	
	public ListEntry(Spettacolo spet) {
		//Setta le dimensioni dell'entry
		setPreferredSize(new Dimension(PANEL_WIDTH,PANEL_HEIGHT));
		//Crea bordo
		RettangoloArrotondato rettangoloDecorativo = new RettangoloArrotondato(8, 8, PANEL_WIDTH - 10, PANEL_HEIGHT - 10, 50, false, Tema.ENTRY_BACKGROUND_COLOR);
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
		String orario = "INIZIA ALLE " + spet.getData().getOraString() + ":" + spet.getData().getMinutoString();
		String sala = "SALA " + spet.getSala().getNome();
		//JLabel infoLbl = new JLabel(orario + " • " + sala);
		JLabel infoLbl = new JLabel(orario + " - " + sala);
		TextStyler.setInfoStyle(infoLbl);
		infoLbl.setBounds(32, 390, INFO_WIDTH, INFO_HEIGHT);
		//Tasto prenota
		JButton prenotaBtn = new JButton("PRENOTA");
		//JButton prenotaBtn = new JButton("PRENOTA", new ImageIcon("image/buttonIcon/prenotaBtn.png"));
		//prenotaBtn.setPressedIcon(new ImageIcon("image/buttonIcon/prenotaBtnPressed.png"));
		prenotaBtn.setBounds(PANEL_WIDTH - PRENOTABTN_WIDTH - 25, PANEL_HEIGHT - PRENOTABTN_HEIGHT - 25, PRENOTABTN_WIDTH, PRENOTABTN_HEIGHT);
		ButtonStyler.setCallToActionButtonStyle(prenotaBtn, Tema.ENTRY_BACKGROUND_COLOR);
		RettangoloArrotondato formaTastoPrenota = new RettangoloArrotondato(0,0, PRENOTABTN_WIDTH,PRENOTABTN_HEIGHT, PRENOTABTN_HEIGHT, false, Tema.CALL_TO_ACTION_BLUE_COLOR);
		formaTastoPrenota.setBounds(prenotaBtn.getBounds());
		MouseListener prenotaListener = new PrenotaListener(formaTastoPrenota);
		prenotaBtn.addMouseListener(prenotaListener);
		
		//Cover prova
		ImageIcon copertina = spet.getOpera().getCopertina();
		if (copertina != null) {
			JLabel cover = new JLabel(new ImageIcon(copertina.getImage().getScaledInstance(-1, COVER_HEIGHT, Image.SCALE_SMOOTH)));
			cover.setBounds(32, 90, COVER_WIDTH, COVER_HEIGHT);
			cover.setHorizontalAlignment(SwingConstants.LEFT);
			add(cover, 9);
		}
		
		//Aggiunge i components al panel dell'entry
		add(prenotaBtn,1);
		add(formaTastoPrenota,2);
		add(titolo, 3);
		add(desc, 4);
		add(durata, 5);
		add(meseLbl, 6);
		add(giornoLbl,7);
		add(infoLbl, 8);
		
		add(rettangoloDecorativo, 10);
	}

}
