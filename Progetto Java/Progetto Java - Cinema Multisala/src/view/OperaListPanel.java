package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.TextStyle;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

import model.Data;
import model.Spettacolo;

@SuppressWarnings("serial")
public class OperaListPanel extends JPanel {

	private boolean spettacoliAggiunti = false;
	private JLabel[] dayLbl = new JLabel[7];
	private JLabel[] monthLbl = new JLabel[7];
	private JPanel[] dayPanels = new JPanel[7];
	private static LocalDate today = LocalDate.now();



	public OperaListPanel (ArrayList<Spettacolo> arrSpettacoli) {

		
		setOpaque(false);

		//Se ci sono spettacoli crea il pannello con la lista
		if ((arrSpettacoli != null) && arrSpettacoli.size() > 0) {

			/*
			setLayout(new FlowLayout(FlowLayout.LEFT, 16, 20));
			Dimension maxWidth = new Dimension();
			maxWidth.width = 200;
			maxWidth.height = arrSpettacoli.size() * (ListEntry.PANEL_HEIGHT + 20);
			setPreferredSize(maxWidth);
			 */

			setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
			//setAlignmentX(LEFT_ALIGNMENT);

			//crea un pannello per ogni giorno

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
				//System.out.println(nextSunday);
				System.out.println(spet.getData().getAnno() + ", mese:" + spet.getData().getMese() + ", giorno:" + spet.getData().getGiorno() + ", ora:" + spet.getData().getOra() + ", minuto:" + spet.getData().getMinuto());
				//}
				//se lo spettacolo rientra in questa settimana caricalo nella lista del giorno

				String dataSpettacolo = spet.getData().getDataFormattata();
				if (dataSpettacolo.compareTo(previousMonday.toString()) >= 0  &&
						dataSpettacolo.compareTo(nextSunday.toString()) <= 0) {
					int giorno = spet.getData().getGiornoDellaSettimana();
					spettacoliAggiunti = true;
					if (dayPanels[giorno - 1] == null) {
						createDayListPanel(giorno - 1, spet.getData().getGiorno());
					}
					dayPanels[giorno - 1].add(new ListEntry(spet));

				}

			}
			
			
			if (!spettacoliAggiunti) {
				addNoSpettacoli();
			}
			
			
			
		} else {
			addNoSpettacoli();
		}


	}

	private void addNoSpettacoli() {
		//System.out.println("no spet");
		JLabel noSpettacoliLbl = new JLabel("Non ci sono spettacoli per questa settimana.");
		add(noSpettacoliLbl);
	}

	private void addDayDivisor(int dayIndex, int dayNumber) {
		int indiceLabel = dayIndex - 1;
		if (dayIndex == 1) {
			dayIndex = 8;
		}
		String dayName = DayOfWeek.of(dayIndex - 1).getDisplayName(TextStyle.FULL, Locale.ITALY);
		//System.out.println("indice label: " + indiceLabel + ", indiceGiorno: " + dayIndex + " nome giorno: " + dayName);
		dayLbl[indiceLabel] = new JLabel(dayName.substring(0,1).toUpperCase() + dayName.substring(1).toLowerCase());
		TextStyler.setTitleStyle(dayLbl[indiceLabel]);
		

		String month = today.getMonth().getDisplayName(TextStyle.FULL, Locale.ITALY);
		monthLbl[indiceLabel] = new JLabel(dayNumber + " " + month.toUpperCase());
		TextStyler.setDataStyle(monthLbl[indiceLabel]);
		
		add(dayLbl[indiceLabel]);
		add(monthLbl[indiceLabel]);
	}
	
	public void createDayListPanel(int dayIndex, int dayNumber) {
		dayPanels[dayIndex] = new JPanel();
		dayPanels[dayIndex].setBackground(Tema.RIGHT_PANEL_BACKGROUND_COLOR);
		dayPanels[dayIndex].setAlignmentX(LEFT_ALIGNMENT);

		dayPanels[dayIndex].setLayout(new FlowLayout(FlowLayout.LEFT, 16, 20));

		//Dimension maxWidth = new Dimension();
		//maxWidth.width = 200;
		//maxWidth.height = arrSpettacoli.size() * (ListEntry.PANEL_HEIGHT + 20);
		//setPreferredSize(maxWidth);

		add(Box.createVerticalStrut(40));
		addDayDivisor(dayIndex + 1, dayNumber);
		add(dayPanels[dayIndex]);
	}

}
