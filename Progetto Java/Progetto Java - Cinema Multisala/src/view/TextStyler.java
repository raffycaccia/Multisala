package view;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JTextArea;

import model.ResourceLoader;

public class TextStyler {
	
	public static void setHeaderStyle(JLabel lbl) {
		lbl.setFont(ResourceLoader.TitleFont);
		lbl.setForeground(new Color(60, 60, 60));
		lbl.setOpaque(false);
	}
	
	public static void setDescriptionStyle(JLabel lbl) {
		lbl.setFont(ResourceLoader.DescFont);
		lbl.setForeground(Color.GRAY);
		lbl.setOpaque(false);
	}
	
	public static void setDescriptionStyle(JTextArea txtArea) {
		txtArea.setFont(ResourceLoader.DescFont);
		txtArea.setForeground(Color.GRAY);
		txtArea.setOpaque(false);
		txtArea.setLineWrap(true);
		txtArea.setWrapStyleWord(true);
		txtArea.setEditable(false);
		txtArea.setFocusable(false);
	}
	
	public static void setInfoStyle(JLabel lbl) {
		lbl.setFont(ResourceLoader.InfoFont);
		lbl.setForeground(Color.black);
		lbl.setOpaque(false);
	}
	
	public static void setDataStyle(JLabel lbl) {
		lbl.setFont(ResourceLoader.DataFont);
		lbl.setForeground(Color.black);
		lbl.setOpaque(false);
	}

}
