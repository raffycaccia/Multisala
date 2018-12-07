package controller;

import java.util.ArrayList;

import javax.swing.JFrame;

import model.Data;
import model.Film;
import model.Sala;
import model.Spettacolo;
import view.MainFrame;

public class MainViewController {

	public static void main(String[] args) {
		

		ArrayList<Spettacolo> arrSpettacoli = new ArrayList<Spettacolo>();
		Spettacolo spett1 = new Spettacolo(new Data(2018, 12, 05, 20, 55), (float) 10.0, new Sala("A",10, 20, 30), new Film("Patate a mensaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa","Horrorgjhjhkgjhjkjhjgkjgjhjkhjjhhjgghhghgghgjhjghkghgjghghjhghgggjhghghjgjhg jhgjhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",10));
		Spettacolo spett2 = new Spettacolo(new Data(2018, 12, 05, 21, 50), (float) 10.0, new Sala("B",20, 20, 40), new Film("Polpette a mensa","Horror",10));
		arrSpettacoli.add(spett1);
		arrSpettacoli.add(spett2);
		
		JFrame frame = new MainFrame(arrSpettacoli);
	}

}
