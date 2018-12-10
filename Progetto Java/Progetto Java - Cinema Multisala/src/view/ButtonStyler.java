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
		btn.setOpaque(true);
		btn.setBackground(MenuPanel.MENU_COLOR);
		btn.setFont(ResourceLoader.BtnSelFont);
		btn.setMaximumSize(new Dimension(MenuPanel.MENU_WIDTH, MenuPanel.BUTTON_HEIGHT));
		btn.setHorizontalAlignment(SwingConstants.LEADING);
		btn.setIconTextGap(12);
		btn.setBorder(BorderFactory.createEmptyBorder(0,22,0,0));
	}

	public static void setNavButtonSelectedStyle(JButton btn) {
		btn.setOpaque(true);
		//btn.setBackground(new Color(77,155,247));
		btn.setBackground(new Color(75,75,75));
		btn.repaint();
	}

	public static void setNavButtonUnselectedStyle(JButton btn) {
		btn.setOpaque(false);
		btn.repaint();
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
	public static void setCallToActionButtonStyle(JButton btn, Color bgColor) {
		btn.setForeground(Color.white);
		btn.setFont(ResourceLoader.TitleFont.deriveFont(13f));
		btn.setBorderPainted(false);
		btn.setBackground(bgColor);
		//btn.setOpaque(false);
		btn.setIconTextGap(0);
		btn.setHorizontalAlignment(SwingConstants.LEFT);
		btn.setHorizontalTextPosition(JButton.CENTER);
		btn.setVerticalTextPosition(JButton.CENTER);
		btn.setBorder(BorderFactory.createEmptyBorder());
	}
}
