package tester;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import progetto.Posto;

public class ButtonPostotester {

	public static void main(String[] args) {

		JFrame frame = new JFrame();
		frame.setSize(500,500);
		
		JPanel pannello = new JPanel();
		Posto c = new Posto(1,new ImageIcon("image/seat_disponibile.png"));
		
		
		c.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, "Sono una poltrona fighissima");
				
			}
		});
		
		
		pannello.add(c);
	
		pannello.setBackground(Color.BLUE);
		
		pannello.setVisible(true);
		frame.add(pannello);
		frame.setVisible(true);
	}


}