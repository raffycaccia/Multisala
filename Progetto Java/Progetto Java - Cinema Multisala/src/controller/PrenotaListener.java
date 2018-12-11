package controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import view.RettangoloArrotondato;
import view.Tema;

public class PrenotaListener implements MouseListener {
	
	private RettangoloArrotondato btnShape;
	
	public PrenotaListener(RettangoloArrotondato btnShape) {
		this.btnShape = btnShape;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
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
