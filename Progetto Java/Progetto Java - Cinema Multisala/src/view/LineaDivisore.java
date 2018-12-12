package view;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;

import javax.swing.JComponent;

@SuppressWarnings("serial")
public class LineaDivisore extends JComponent {
	
	
	public LineaDivisore(int lunghezza) {
		this.lunghezza = lunghezza;
	}
	
	public void paintComponent(Graphics g) {

        Graphics2D g2 = (Graphics2D) g;

        
        g2.setColor(Tema.DIVISORE_COLOR);
        RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        //rh.add(new RenderingHints(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_LCD_HRGB));
        //rh.add(new RenderingHints(RenderingHints.KEY_RESOLUTION_VARIANT, RenderingHints.VALUE_RESOLUTION_VARIANT_DPI_FIT));
        g2.setRenderingHints(rh);
		g2.setStroke(new BasicStroke(2.0f));
        g2.drawLine(0, 0, lunghezza, 0);

    }
	
	private final int lunghezza;
	
}
