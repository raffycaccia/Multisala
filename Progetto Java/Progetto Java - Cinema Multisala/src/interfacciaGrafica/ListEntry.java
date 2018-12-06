package interfacciaGrafica;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import progetto.Spettacolo;

public class ListEntry extends JLayeredPane {
	
	public static final int PANEL_WIDTH = 400;
	public static final int PANEL_HEIGHT = (int) ((PANEL_WIDTH) * 1.6f);
	
	public ListEntry(Spettacolo spet) {
		
		
		setPreferredSize(new Dimension(PANEL_WIDTH,PANEL_HEIGHT));
		//setBackground(Color.white);
		//setBackground(Color.red);
		//setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		JLabel titolo = new JLabel(spet.getOpera().getTitolo());
		titolo.setFont(ResourceLoader.TitleFont);
		titolo.setForeground(new Color(60, 60, 60));
		titolo.setOpaque(false);
		titolo.setBounds(30, 30, PANEL_WIDTH - 60, 30);
		
		JLabel descrizione = new JLabel(spet.getOpera().getDescrizione());
		descrizione.setFont(ResourceLoader.DescFont);
		descrizione.setForeground(Color.GRAY);
		descrizione.setOpaque(false);
		descrizione.setBounds(30, 70, PANEL_WIDTH - 80, 18);
		
		
		RettangoloArrotondato rettangoloDecorativo = new RettangoloArrotondato();
		rettangoloDecorativo.setBounds(0,0,PANEL_WIDTH,PANEL_HEIGHT + 200);
		
		//JLabel durata = new JLabel(spet.getOpera().getDurata());
		
		//JLabel giorno = new JLabel(spet.getData().getGiorno());
		
		//JLabel orario = new JLabel(spet.getData().getOra() + spet.getData().getMinuto());
		
		
		//setLayout(JLayeredPane);
		add(titolo, 1);
		add(descrizione, 1);
		add(rettangoloDecorativo, 2);
	}

}
