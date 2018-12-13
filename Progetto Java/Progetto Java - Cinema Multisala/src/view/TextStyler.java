package view;

import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

import model.ResourceLoader;

public class TextStyler {
	
	
	public static void setTitleStyle(JLabel lbl) {
		lbl.setFont(ResourceLoader.HeavyFont.deriveFont(28f));
		lbl.setForeground(Tema.TITLE_COLOR);
		lbl.setOpaque(false);
		lbl.setHorizontalAlignment(SwingConstants.LEFT);
	}
	
	public static void setDescriptionStyle(JLabel lbl) {
		lbl.setFont(ResourceLoader.BookObliqueFont.deriveFont(16f));
		lbl.setForeground(Tema.DESCRIPTION_COLOR);
		lbl.setOpaque(false);
		lbl.setHorizontalAlignment(SwingConstants.LEFT);
	}
	
	public static void setDescriptionStyle(JTextArea txtArea) {
		txtArea.setFont(ResourceLoader.BookObliqueFont.deriveFont(16f));
		txtArea.setForeground(Tema.DESCRIPTION_COLOR);
		txtArea.setOpaque(false);
		txtArea.setLineWrap(true);
		txtArea.setWrapStyleWord(true);
		txtArea.setEditable(false);
		txtArea.setFocusable(false);
	}
	
	public static void setInfoStyle(JLabel lbl) {
		lbl.setFont(ResourceLoader.HeavyFont.deriveFont(18f));
		lbl.setForeground(Tema.INFO_COLOR);
		lbl.setOpaque(false);
		lbl.setHorizontalAlignment(SwingConstants.LEFT);
	}
	
	public static void setDataStyle(JLabel lbl) {
		lbl.setFont(ResourceLoader.HeavyFont.deriveFont(11f));
		lbl.setForeground(Tema.DATA_COLOR);
		lbl.setOpaque(false);
		lbl.setHorizontalAlignment(SwingConstants.LEFT);
	}
	
	public static void setNavHeaderStyle(JLabel lbl) {
		lbl.setFont(ResourceLoader.HeavyFont.deriveFont(38f));
		lbl.setForeground(Tema.NAVIGATION_HEADER_COLOR);
		lbl.setOpaque(false);
		lbl.setHorizontalAlignment(SwingConstants.LEFT);
	}
	
	public static void setFilterTypeStyle(JLabel lbl) {
		lbl.setFont(ResourceLoader.HeavyFont.deriveFont(11f));
		lbl.setForeground(Tema.FILTER_TYPE_BUTTON_COLOR);
		lbl.setOpaque(false);
		lbl.setHorizontalAlignment(SwingConstants.LEFT);
	}

}
