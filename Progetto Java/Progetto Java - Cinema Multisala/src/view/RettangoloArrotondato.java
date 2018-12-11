package view;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.geom.RoundRectangle2D;

import javax.swing.JComponent;

@SuppressWarnings("serial")
public class RettangoloArrotondato extends JComponent {
	
	private int x;
	private int y;
	private int width;
	private int height;
	private int radius;
	private boolean soloBordo;
	private Color color;
	
	
	public RettangoloArrotondato(int x, int y, int width, int height, int radius, boolean soloBordo, Color color) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.radius = radius;
		this.soloBordo = soloBordo;
		this.color = color;
	}
	
	public RettangoloArrotondato(Rectangle r, int radius, boolean soloBordo, Color color) {
		this.x = r.x;
		this.y = r.y;
		this.width = r.width;
		this.height = r.height;
		this.radius = radius;
		this.soloBordo = soloBordo;
		this.color = color;
	}
	
	public void paintComponent(Graphics g) {

        Graphics2D g2 = (Graphics2D) g;

        
        g2.setColor(color);
        RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        //rh.add(new RenderingHints(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_LCD_HRGB));
        //rh.add(new RenderingHints(RenderingHints.KEY_RESOLUTION_VARIANT, RenderingHints.VALUE_RESOLUTION_VARIANT_DPI_FIT));
        g2.setRenderingHints(rh);
        
        if (soloBordo) {
        	g2.drawRoundRect(x, y, width, height, radius, radius);
        } else {
            g2.fillRoundRect(x, y, width, height, radius, radius);
        }

    }
	
	public void setFillColor(Color bgColor){
		this.color = bgColor;
		repaint();
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