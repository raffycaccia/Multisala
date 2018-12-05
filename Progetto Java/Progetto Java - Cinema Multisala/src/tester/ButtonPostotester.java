package tester;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

import progetto.Posto;

public class ButtonPostotester {

	public static void main(String[] args) {

		JFrame frame = new JFrame();
		frame.setSize(500,500);
		
		JPanel pannello = new JPanel();
		pannello.add(new Posto(1,new ImageIcon("image/seat_disponibile.png")));
	
		pannello.setBackground(Color.BLUE);
		
		pannello.setVisible(true);
		frame.add(pannello);
		frame.setVisible(true);
	}


}
