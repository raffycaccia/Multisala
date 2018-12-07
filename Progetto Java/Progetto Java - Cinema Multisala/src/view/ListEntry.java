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

	public static final int DATA_WIDTH = 100;
	public static final int DATA_HEIGHT = 30;

	public static final int GIORNO_WIDTH = 100;
	public static final int GIORNO_HEIGHT = 30;

	public static final int ORARIO_WIDTH = 200;
	public static final int ORARIO_HEIGHT = 30;

	public static final int SALA_WIDTH = 200;
	public static final int SALA_HEIGHT = 30;
	
	public ListEntry(Spettacolo spet) {
		
		
		setPreferredSize(new Dimension(PANEL_WIDTH,PANEL_HEIGHT));
	
		//setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
	
		JLabel titolo = new JLabel(spet.getOpera().getTitolo());
		LabelStyler.setHeaderStyle(titolo);
		titolo.setBounds(30, 30, TITLE_WIDTH, TITLE_HEIGHT);
		
		JTextArea desc = new JTextArea(spet.getOpera().getDescrizione());
		LabelStyler.setDescriptionStyle(desc);
		desc.setBounds(30, 70, DESC_WIDTH, DESC_HEIGHT);
		
		RettangoloArrotondato rettangoloDecorativo = new RettangoloArrotondato();
		rettangoloDecorativo.setBounds(0,0,PANEL_WIDTH,PANEL_HEIGHT + 200);
		
		JLabel durata = new JLabel(spet.getOpera().getDurata() + " MINUTI");
		durata.setFont(ResourceLoader.DescFont);
		durata.setForeground(Color.GRAY);
		durata.setOpaque(false);
		durata.setBounds(30, 250, DURATA_WIDTH, DURATA_HEIGHT);
		
		String data = (spet.getData().getGiorno() + "/" + spet.getData().getMese());
		JLabel dataLbl = new JLabel(data);
		dataLbl.setFont(ResourceLoader.DescFont);
		dataLbl.setForeground(Color.GRAY);
		dataLbl.setOpaque(false);
		dataLbl.setBounds(50, 300, GIORNO_WIDTH, GIORNO_HEIGHT);
		
		JLabel orario = new JLabel("INIZIA ALLE: " + spet.getData().getOra() + ":" + spet.getData().getMinuto());
		orario.setFont(ResourceLoader.DescFont);
		orario.setForeground(Color.GRAY);
		orario.setOpaque(false);
		orario.setBounds(50, 400, ORARIO_WIDTH, ORARIO_HEIGHT);
		
		JLabel sala = new JLabel("SALA " + spet.getSala().getNome());
		sala.setFont(ResourceLoader.DescFont);
		sala.setForeground(Color.GRAY);
		sala.setOpaque(false);
		sala.setBounds(50, 450, SALA_WIDTH, SALA_HEIGHT);
	
		
		add(titolo, 1);
		add(desc,1);
		add(durata, 1);
		add(dataLbl, 1);
		add(orario, 1);
		add(sala, 1);
		add(rettangoloDecorativo, 2);
	}

}
