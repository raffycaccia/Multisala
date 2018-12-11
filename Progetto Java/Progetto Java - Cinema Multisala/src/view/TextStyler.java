package view;

import javax.swing.JLabel;
import javax.swing.JTextArea;

import model.ResourceLoader;

public class TextStyler {
	
	
	public static void setTitleStyle(JLabel lbl) {
		lbl.setFont(ResourceLoader.TitleFont);
		lbl.setForeground(Tema.TITLE_COLOR);
		lbl.setOpaque(false);
	}
	
	public static void setDescriptionStyle(JLabel lbl) {
		lbl.setFont(ResourceLoader.DescFont);
		lbl.setForeground(Tema.DESCRIPTION_COLOR);
		lbl.setOpaque(false);
	}
	
	public static void setDescriptionStyle(JTextArea txtArea) {
		txtArea.setFont(ResourceLoader.DescFont);
		txtArea.setForeground(Tema.DESCRIPTION_COLOR);
		txtArea.setOpaque(false);
		txtArea.setLineWrap(true);
		txtArea.setWrapStyleWord(true);
		txtArea.setEditable(false);
		txtArea.setFocusable(false);
	}
	
	public static void setInfoStyle(JLabel lbl) {
		lbl.setFont(ResourceLoader.TitleFont.deriveFont(18f));
		lbl.setForeground(Tema.INFO_COLOR);
		lbl.setOpaque(false);
	}
	
	public static void setDataStyle(JLabel lbl) {
		lbl.setFont(ResourceLoader.TitleFont.deriveFont(18f));
		lbl.setForeground(Tema.DATA_COLOR);
		lbl.setOpaque(false);
	}
	
	public static void setNavHeaderStyle(JLabel lbl) {
		lbl.setFont(ResourceLoader.TitleFont.deriveFont(45f));
		lbl.setForeground(Tema.NAVIGATION_HEADER_COLOR);
		lbl.setOpaque(false);
	}
	
	public static void setFilterTypeStyle(JLabel lbl) {
		lbl.setFont(ResourceLoader.TitleFont.deriveFont(11f));
		lbl.setForeground(Tema.FILTER_TYPE_BUTTON_COLOR);
		lbl.setOpaque(false);
	}

}
