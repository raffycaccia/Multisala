package view;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;

import javax.swing.JPanel;

import model.Data;
import model.Spettacolo;

@SuppressWarnings("serial")
public class OperaListPanel extends JPanel {


	public OperaListPanel (ArrayList<Spettacolo> arrSpettacoli) {

		setOpaque(false);

		//setLayout(new GridLayout(0,2,16,20));

		setLayout(new FlowLayout(FlowLayout.LEFT, 16, 20));
		Dimension maxWidth = new Dimension();
		maxWidth.width = 200;
		maxWidth.height = arrSpettacoli.size() * (ListEntry.PANEL_HEIGHT + 20);
		setPreferredSize(maxWidth);
		

		//crea un pannello per ogni giorno
		JPanel[] dayPanels = new JPanel[7];
		for(int i=0; i<7; i++)
		{
			dayPanels[i] = new JPanel();
		    add(dayPanels[i]);
		}

		for (Spettacolo spet : arrSpettacoli) {
			//System.out.println(LocalDateTime.now().getDayOfWeek());
			//controlla giorno attuale
			//int today = LocalDateTime.now().getDayOfWeek().getValue();
			LocalDate today = LocalDate.now();
			//if (today != 1) {
				//ottieni il lunedi di questa settimana
				LocalDate previousMonday = today.with( TemporalAdjusters.previousOrSame( DayOfWeek.MONDAY ));
				//System.out.println(previousMonday);
				LocalDate nextSunday = previousMonday.plusDays(6);
				System.out.println(nextSunday);
				System.out.println(spet.getData().getAnno() + ", mese:" + spet.getData().getMese() + ", giorno:" + spet.getData().getGiorno() + ", ora:" + spet.getData().getOra() + ", minuto:" + spet.getData().getMinuto());
			//}
			//se lo spettacolo rientra in questa settimana caricalo nella lista del giorno
				if (spet.getData().getDataFormattata().compareTo(previousMonday.toString()) >= 0  &&
						spet.getData().getDataFormattata().compareTo(nextSunday.toString()) <= 0) {
					add(new ListEntry(spet));
				}
		}

	}

}
