package view;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.RenderingHints;

import javax.swing.border.Border;

public class BordoArrotondato implements Border {

	private int radius;
	private Color color;


	BordoArrotondato(int radius, Color color) {
		this.radius = radius;
		this.color = color;
	}

	
    public Insets getBorderInsets(Component c) {
        return new Insets(this.radius+1, this.radius+1, this.radius+2, this.radius);
    }
	

	public boolean isBorderOpaque() {
		return true;
	}


	public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
		Graphics2D g2 = (Graphics2D) g;
		g2.setStroke(new BasicStroke(1.0f));
		g2.setColor(color);
		RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setRenderingHints(rh);
		g2.drawRoundRect(x, y, width-1, height-1, radius, radius);
	}
	
	public void setColor(Color color) {
		this.color = color;
	}
}