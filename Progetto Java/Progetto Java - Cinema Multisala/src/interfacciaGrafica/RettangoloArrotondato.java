package interfacciaGrafica;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.RoundRectangle2D;

import javax.swing.JComponent;

public class RettangoloArrotondato extends JComponent {
	
	public void paintComponent(Graphics g) {

        Graphics2D g2 = (Graphics2D) g;

        g2.setPaint(new Color(230, 230, 230));
        g2.setStroke(new BasicStroke(1.2f));

        RoundRectangle2D decorazioneRettangolo = new RoundRectangle2D.Float(8, 8, ListEntry.PANEL_WIDTH - 16, ListEntry.PANEL_HEIGHT - 16, 50, 50);
		
        g2.draw(decorazioneRettangolo);
    }
	
	//la gesubambino di ombra
	/*
	public Rectangle creaOmbraRettangolo(int larghezza, int altezza, double larghezzaOmbra, double altezzaOmbra, double diffusione) {
		    Rectangle r = new Rectangle(larghezza, altezza);
		    r.setFill(Color.lightGray);
		    r.setStroke(Color.BLACK);
		    r.setStrokeWidth(2);
		    DropShadow e = new DropShadow();
		    e.setWidth(shadowWidth);
		    e.setHeight(shadowHeight);
		    e.setOffsetX(offsetX);
		    e.setOffsetY(offsetY);
		    e.setRadius(radius);
		    r.setEffect(e);
		    return r;
		}
	*/
}