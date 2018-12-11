package controller;

import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import model.Data;
import model.Film;
import model.Sala;
import model.Spettacolo;
import view.MainFrame;
import view.Tema;
import view.Tema.Stile;

public class MainFrameController {

	public static void main(String[] args) {
		

		ArrayList<Spettacolo> arrSpettacoli = new ArrayList<Spettacolo>();
		Spettacolo spett1 = new Spettacolo(new Data(2018, 12, 05, 20, 55), (float) 10.0, new Sala("A",10, 20, 30), new Film("Patate a mensaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa","Horrorgjhjhkgjhjkjhjgkjgjhjkhjjhhjgghhghgghgjhjghkghgjghghjhghgggjhghghjgjhg jhgjhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",10));
		Spettacolo spett2 = new Spettacolo(new Data(2018, 12, 05, 21, 50), (float) 10.0, new Sala("B",20, 20, 40), new Film("Polpette a mensa","Horror",10));
		Spettacolo spett3 = new Spettacolo(
				new Data(2018, 12, 11, 00, 04),
				(float) 10.0, new Sala("B",20, 20, 40),
				new Film("Harry potter e la pietra filosofale",
				"Un ragazzo che dovendo seguire MMI e Analisi impara incantesimi sulle patate e su come farcire i panini della mensa",
				120, new ImageIcon("database/OperaCovers/hp1.jpg")));
		Spettacolo spett4 = new Spettacolo(new Data(2018, 12, 20, 21, 50), (float) 10.0, new Sala("B",20, 20, 40), new Film("Polpette a mensa","Horror",10));
		arrSpettacoli.add(spett1);
		arrSpettacoli.add(spett2);
		arrSpettacoli.add(spett3);
		arrSpettacoli.add(spett4);
		
		ArrayList<Sala> arrSale = new ArrayList<Sala>();
		Sala salaA = new Sala("A",10,10, null);
		Sala salaB = new Sala("B",10,10, null);
		arrSale.add(salaA);
		arrSale.add(salaB);
		
		setup();
		
		JFrame frame = new MainFrame(arrSpettacoli, arrSale);
		//JFrame frame = new MainFrame(null, null);
		frame.setVisible(true);
	}
	
	private static void setup() {
		new Tema(Stile.Combinato);
	}
	
	

}
