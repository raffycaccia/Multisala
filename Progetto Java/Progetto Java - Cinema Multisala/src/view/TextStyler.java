package view;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JTextArea;

import model.ResourceLoader;

public class TextStyler {
	
	public static final Color TITLE_COLOR = new Color(39, 39, 39);
	
	public static void setTitleStyle(JLabel lbl) {
		lbl.setFont(ResourceLoader.TitleFont);
		lbl.setForeground(TITLE_COLOR);
		lbl.setOpaque(false);
	}
	
	public static void setDescriptionStyle(JLabel lbl) {
		lbl.setFont(ResourceLoader.DescFont);
		lbl.setForeground(new Color(124,124,125));
		lbl.setOpaque(false);
	}
	
	public static void setDescriptionStyle(JTextArea txtArea) {
		txtArea.setFont(ResourceLoader.DescFont);
		txtArea.setForeground(new Color(124,124,125));
		txtArea.setOpaque(false);
		txtArea.setLineWrap(true);
		txtArea.setWrapStyleWord(true);
		txtArea.setEditable(false);
		txtArea.setFocusable(false);
	}
	
	public static void setInfoStyle(JLabel lbl) {
		lbl.setFont(ResourceLoader.TitleFont.deriveFont(18f));
		lbl.setForeground(new Color(48,48,48));
		lbl.setOpaque(false);
	}
	
	public static void setDataStyle(JLabel lbl) {
		lbl.setFont(ResourceLoader.TitleFont.deriveFont(18f));
		lbl.setForeground(new Color(124,124,125));
		lbl.setOpaque(false);
	}
	
	public static void setNavHeaderStyle(JLabel lbl) {
		lbl.setFont(ResourceLoader.TitleFont.deriveFont(45f));
		lbl.setForeground(new Color(17, 17, 17));
		lbl.setOpaque(false);
	}

}
