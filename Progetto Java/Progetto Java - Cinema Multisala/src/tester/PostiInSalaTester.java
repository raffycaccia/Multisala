package tester;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import interfacciaGrafica.SelezionePostoPanel;
import progetto.Data;
import progetto.Film;
import progetto.Posto;
import progetto.Sala;
import progetto.Spettacolo;

public class PostiInSalaTester {

	public static void main(String[] args) {

		JFrame frame = new JFrame();
		frame.setSize(500,500);
		
		JPanel pannello = new SelezionePostoPanel(new Spettacolo(new Data(2018, 12, 17, 18, 10), 12, new Sala(1, 5, 5), new Film("Ciao", "testaaa", 120)));
		
		/*
		c.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, "Sono una poltrona fighissima");
				
			}
		});
		
		d.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, "Sono una poltrona fighissima e ora sono indisponibile");
				d.setIndisponibile(true);
				d.setIcon(new ImageIcon("image/sala/seat_indisponibile.png"));
			}
		});
		
		
		
		pannello.add(c);
		pannello.add(d);
		*/
		//
		
		pannello.setVisible(true);
		frame.add(pannello);
		frame.setVisible(true);
	}

}
