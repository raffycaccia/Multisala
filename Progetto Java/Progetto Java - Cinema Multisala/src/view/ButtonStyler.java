package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Cursor;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

import model.ResourceLoader;

public class ButtonStyler {
	

	public static void setNavButtonStyle(JButton btn) {
		btn.setForeground(Color.white);
		btn.setBorderPainted(false);
		btn.setFocusPainted(false);
		btn.setFocusable(false);
		btn.setContentAreaFilled(false);
		btn.setOpaque(true);
		btn.setBackground(Tema.MENU_COLOR);
		btn.setFont(ResourceLoader.MediumFont.deriveFont(19f));
		btn.setMaximumSize(new Dimension(TabBarPanel.MENU_WIDTH, TabBarPanel.BUTTON_HEIGHT));
		btn.setHorizontalAlignment(SwingConstants.LEADING);
		btn.setIconTextGap(12);
		btn.setBorder(BorderFactory.createEmptyBorder(0,22,0,0));
	}

	public static void setNavButtonSelectedStyle(JButton btn) {
		btn.setOpaque(true);
		//btn.setBackground(new Color(77,155,247));
		btn.setBackground(Tema.NAVIGATION_BUTTON_SELECTED_COLOR);
		btn.repaint();
	}

	public static void setNavButtonUnselectedStyle(JButton btn) {
		btn.setOpaque(false);
		btn.repaint();
	}

	public static void setSwitchButtonStyle(JRadioButton btn) {
		btn.setIcon(new ImageIcon(""));
		btn.setForeground(Tema.SWITCHER_BUTTON_SELECTED_COLOR);
		btn.setFont(ResourceLoader.HeavyFont.deriveFont(13f));
		btn.setIconTextGap(0);
		btn.setBorderPainted(true);
		btn.setFocusPainted(false);
		btn.setContentAreaFilled(false);
		btn.setFocusable(false);
		//btn.setBackground(bgColor);
		btn.setOpaque(false);
		btn.setIconTextGap(0);
		btn.setHorizontalAlignment(SwingConstants.CENTER);
		btn.setHorizontalTextPosition(JButton.CENTER);
		btn.setVerticalTextPosition(JButton.CENTER);
		btn.setBorder(new BordoArrotondato(17, Tema.SWITCHER_BUTTON_SELECTED_COLOR));
		btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
	}

	public static void setSwitchButtonSelectedStyle(JRadioButton btn) {
		btn.setForeground(Tema.SWITCHER_BUTTON_SELECTED_COLOR);
		BordoArrotondato a = (BordoArrotondato) btn.getBorder();
		a.setColor(Tema.SWITCHER_BUTTON_SELECTED_COLOR);
	}
	
	public static void setSwitchButtonUnselectedStyle(JRadioButton btn) {
		btn.setForeground(Tema.SWITCHER_BUTTON_COLOR);
		BordoArrotondato a = (BordoArrotondato) btn.getBorder();
		a.setColor(Tema.SWITCHER_BUTTON_COLOR);
	}
	
	public static void setCallToActionButtonStyle(JButton btn, Color bgColor) {
		btn.setForeground(Color.white);
		btn.setFont(ResourceLoader.HeavyFont.deriveFont(13f));
		btn.setBorderPainted(false);
		btn.setFocusPainted(false);
		btn.setContentAreaFilled(false);
		btn.setFocusable(false);
		btn.setBackground(bgColor);
		btn.setOpaque(false);
		btn.setIconTextGap(0);
		btn.setHorizontalTextPosition(JButton.CENTER);
		btn.setVerticalTextPosition(JButton.CENTER);
		btn.setBorder(BorderFactory.createEmptyBorder());
		btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
	}
	
	public static void setPostoStyle(JButton btn) {
		btn.setBorderPainted(false);
		btn.setFocusPainted(false);
		btn.setContentAreaFilled(false);
		btn.setFocusable(false);
		btn.setBackground(Tema.MENU_COLOR);
		btn.setOpaque(false);
		btn.setIconTextGap(0);
		btn.setOpaque(false);
	}
	
}
