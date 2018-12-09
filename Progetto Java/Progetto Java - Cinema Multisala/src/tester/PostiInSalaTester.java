package tester;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

import model.Data;
import model.Film;
import model.Sala;
import model.Spettacolo;
import view.SelezionePostoPanel;

public class PostiInSalaTester {

	public static void main(String[] args) {

		JFrame frame = new JFrame();
		frame.setSize(1190,500);
		
		
		Dimension screenSize = Toolkit.getDefaultToolkit ().getScreenSize ();
		Dimension frameSize = frame.getSize ();

		frame.setLocation ((screenSize.width - frameSize.width) / 2,
		(screenSize.height - frameSize.height) / 2);
		
		JPanel pannello = new SelezionePostoPanel(new Spettacolo(new Data(2018, 12, 17, 18, 10), 12, new Sala("A",1, 10, 12), new Film("Ciao", "testaaa", 120)));
		
		
		
		pannello.setVisible(true);
		frame.add(pannello);
		frame.setVisible(true);
	}

}
