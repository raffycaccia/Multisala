package controller;

import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.SwingUtilities;

import model.Spettacolo;
import view.MainFrame;
import view.RettangoloArrotondato;
import view.Tema;

public class PrenotaListener implements MouseListener {
	
	private RettangoloArrotondato btnShape;
	private Spettacolo spet;
	
	public PrenotaListener(RettangoloArrotondato btnShape, Spettacolo spet) {
		this.btnShape = btnShape;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		Component c = (Component) e.getSource();
		MainFrame topFrame = (MainFrame) SwingUtilities.getRoot(c);
		topFrame.setSelezionePostoPanel(spet);
		//topFrame.add(new SelezionePostoPanel(spet));
		/*
		JFrame f = new JFrame();
		f.add(new SelezionePostoPanel(spet));
		f.setSize(1400, 1000);
		f.setVisible(true);
		*/
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		btnShape.setFillColor(Tema.CALL_TO_ACTION_PRESSED_BLUE_COLOR);

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		btnShape.setFillColor(Tema.CALL_TO_ACTION_BLUE_COLOR);

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
