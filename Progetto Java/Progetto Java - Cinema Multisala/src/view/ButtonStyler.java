package view;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

import model.ResourceLoader;

public class ButtonStyler {
	
	public static void setNavButtonStyle(JButton btn) {
		btn.setForeground(Color.white);
		btn.setBorderPainted(false);
		btn.setOpaque(false);
		btn.setFont(ResourceLoader.BtnSelFont);
		btn.setMaximumSize(new Dimension(221, 45));
		btn.setHorizontalAlignment(SwingConstants.LEADING);
		btn.setIconTextGap(12);
		btn.setBorder(BorderFactory.createEmptyBorder(0,22,0,0));
	}

	public static void setNavButtonSelectedStyle(JButton btn) {
		btn.setOpaque(true);
		//btn.setBackground(new Color(77,155,247));
		btn.setBackground(new Color(75,75,75));
	}
	
	public static void setSwitchButtonStyle(JRadioButton btn) {
		//btn.setForeground(Color.white);
		//btn.setFont(ResourceLoader.TitleFont.deriveFont(13f));
		btn.setIconTextGap(0);
		btn.setHorizontalAlignment(SwingConstants.LEFT);
		
	}
	/*
	public static void setPrenotaButtonStyle(JButton btn) {
		btn.setForeground(Color.white);
		btn.setFont(ResourceLoader.TitleFont.deriveFont(13f));
		btn.setBackground(new Color(77,155,247));
		
	}
	*/
	public static void setIconButtonStyle(JButton btn) {
		btn.setBorderPainted(false);
		btn.setOpaque(false);
		btn.setIconTextGap(0);
		btn.setHorizontalAlignment(SwingConstants.LEFT);
		btn.setBorder(BorderFactory.createEmptyBorder());
	}
}
