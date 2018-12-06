package tester;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import interfacciaGrafica.MenuPanel;
import interfacciaGrafica.ProgrammaSettimanalePanel;
import interfacciaGrafica.ResourceLoader;
import progetto.Data;
import progetto.Film;
import progetto.Sala;
import progetto.Spettacolo;

public class GestoreTester {

	public static void main(String[] args) {
		
		ResourceLoader.loadFonts();
		
		JFrame frame = new JFrame();
		
		ArrayList<Spettacolo> arrSpettacoli = new ArrayList<Spettacolo>();
		Spettacolo spett1 = new Spettacolo(new Data(2018, 12, 05, 20, 55), (float) 10.0, new Sala(10, 20, 30), new Film("Patate a mensaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa","Horrorgjhjhkgjhjkjhjgkjgjhjkhjjhhjgghhghgghgjhjghkghgjghghjhghgggjhghghjgjhgjhgjh",10));
		Spettacolo spett2 = new Spettacolo(new Data(2018, 12, 05, 21, 50), (float) 10.0, new Sala(20, 20, 40), new Film("Polpette a mensa","Horror",10));
		arrSpettacoli.add(spett1);
		arrSpettacoli.add(spett2);
		
		JPanel progSet = new ProgrammaSettimanalePanel(arrSpettacoli);

		frame.setLayout(new BorderLayout());
		MenuPanel navMenu = new MenuPanel();
		frame.add(navMenu, BorderLayout.WEST);
		
		frame.add(progSet, BorderLayout.CENTER);
		
		if (arrSpettacoli.size() > 0) {
			JScrollPane scrollBar = new JScrollPane(progSet);
			scrollBar.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
			scrollBar.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
			frame.add(scrollBar);
		}
		
		frame.setSize(1400, 900);
		frame.setBackground(Color.white);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
