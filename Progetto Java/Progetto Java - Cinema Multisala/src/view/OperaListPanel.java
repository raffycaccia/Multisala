package view;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.JPanel;

import model.Spettacolo;

@SuppressWarnings("serial")
public class OperaListPanel extends JPanel {
	

	public OperaListPanel (ArrayList<Spettacolo> arrSpettacoli) {
		
		setOpaque(false);
		
		//setLayout(new WrapLayout(WrapLayout.LEFT, 16, 20));
		
		//setLayout(new GridLayout(0,2,16,20));
		setLayout(new FlowLayout(FlowLayout.LEFT, 16, 20));
		Dimension maxWidth = new Dimension();
		maxWidth.width = 200;
		maxWidth.height = arrSpettacoli.size() * (ListEntry.PANEL_HEIGHT + 20);
		setPreferredSize(maxWidth);
		
		for (Spettacolo spet : arrSpettacoli) {
			add(new ListEntry(spet));
		}
		
	}

}
