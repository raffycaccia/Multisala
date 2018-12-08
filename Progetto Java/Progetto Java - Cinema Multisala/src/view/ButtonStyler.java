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
		btn.setForeground(Color.WHITE);
		btn.setBorderPainted(false);
		btn.setOpaque(false);
		btn.setFont(ResourceLoader.BtnSelFont);
		btn.setMaximumSize(new Dimension(221, 45));
		btn.setHorizontalAlignment(SwingConstants.LEADING);
		btn.setIconTextGap(12);
		btn.setBorder(BorderFactory.createEmptyBorder(0,22,0,0));
	}

	public static void setNavButtonSelectedStyle(JButton btn) {
		btn.setForeground(Color.WHITE);
		btn.setBorderPainted(false);
		btn.setBackground(new Color(77,155,247));
		btn.setOpaque(true);
		btn.setFont(ResourceLoader.BtnSelFont);
		btn.setMaximumSize(new Dimension(221, 45));
		btn.setHorizontalAlignment(SwingConstants.LEADING);
		btn.setIconTextGap(12);
		btn.setBorder(BorderFactory.createEmptyBorder(0,22,0,0));
	}
	
	public static void setSwitchButtonStyle(JRadioButton btn) {
		btn.setForeground(Color.white);
		btn.setFont(ResourceLoader.TitleFont.deriveFont(18f));
		
	}
}
