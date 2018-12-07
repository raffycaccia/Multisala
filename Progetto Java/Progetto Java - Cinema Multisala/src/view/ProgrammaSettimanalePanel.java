package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;

import model.ResourceLoader;
import model.Sala;
import model.Spettacolo;

public class ProgrammaSettimanalePanel extends JPanel {

	//private static final int PANEL_SIZE = 400;

	public ProgrammaSettimanalePanel(ArrayList<Spettacolo> arrSpettacoli, ArrayList<Sala> arrSale) {

		setBackground(Color.white);
		//setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		setLayout(new BorderLayout());
		setBorder(new EmptyBorder(32, 32, 32, 32));

		createHeader(arrSale);
		createListPanel(arrSpettacoli, arrSale);



	}

	private void createHeader(ArrayList<Sala> arrSale) {

		JPanel header = new JPanel();
		header.setOpaque(false);
		header.setLayout(new BorderLayout());

		JLabel headerLbl = new JLabel("Programma Settimanale");
		TextStyler.setNavHeaderStyle(headerLbl);
		header.add(headerLbl, BorderLayout.WEST);
		header.add(Box.createVerticalStrut(40), BorderLayout.SOUTH);
		add(header, BorderLayout.NORTH);

		if ((arrSale != null) && arrSale.size() > 0) {
			JComboBox selectSala = new JComboBox();
			selectSala.addItem("Tutte le sale");
			for (Sala s : arrSale) {
				selectSala.addItem(s.getNome());
			}
			selectSala.setMaximumSize(new Dimension(10,30));
			header.add(selectSala, BorderLayout.EAST);
		}
	}

	private void createListPanel(ArrayList<Spettacolo> arrSpettacoli, ArrayList<Sala> arrSale) {
		if ((arrSpettacoli != null) && arrSpettacoli.size() > 0) {
			add(new OperaListPanel(arrSpettacoli), BorderLayout.CENTER);
		} else {
			JLabel noSpettacoliLbl = new JLabel("Non ci sono spettacoli per questa settimana.");
			add(noSpettacoliLbl, BorderLayout.CENTER);
		}
	}

}

