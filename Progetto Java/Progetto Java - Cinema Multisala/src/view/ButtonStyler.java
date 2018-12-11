package view;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

import model.ResourceLoader;

public class ButtonStyler {
	
	private static final Color NAVBTNSELCOL = new Color(75,75,75);
	public static final Color CTABLUECOL = new Color(8,132,255);
	public static final Color CTABLUECOLPRESSED = new Color(6,112,218);
	public static final Color SWITCHERBTNCOL = new Color(100,101,102);
	public static final Color SWITCHERBTNSELCOL = new Color(205,206,208);

	public static void setNavButtonStyle(JButton btn) {
		btn.setForeground(Color.white);
		btn.setBorderPainted(false);
		btn.setFocusPainted(false);
		btn.setFocusable(false);
		btn.setContentAreaFilled(false);
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
		btn.setBackground(NAVBTNSELCOL);
		btn.repaint();
	}

	public static void setNavButtonUnselectedStyle(JButton btn) {
		btn.setOpaque(false);
		btn.repaint();
	}

	public static void setSwitchButtonStyle(JRadioButton btn) {
		btn.setIcon(new ImageIcon(""));
		btn.setForeground(SWITCHERBTNSELCOL);
		btn.setFont(ResourceLoader.TitleFont.deriveFont(13f));
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
		btn.setBorder(new BordoArrotondato(17, SWITCHERBTNSELCOL));
	}

	public static void setSwitchButtonSelectedStyle(JRadioButton btn) {
		btn.setForeground(SWITCHERBTNSELCOL);
		BordoArrotondato a = (BordoArrotondato) btn.getBorder();
		a.setColor(SWITCHERBTNSELCOL);
	}
	
	public static void setSwitchButtonUnselectedStyle(JRadioButton btn) {
		btn.setForeground(SWITCHERBTNCOL);
		BordoArrotondato a = (BordoArrotondato) btn.getBorder();
		a.setColor(SWITCHERBTNCOL);
	}
	
	public static void setCallToActionButtonStyle(JButton btn, Color bgColor) {
		btn.setForeground(Color.white);
		btn.setFont(ResourceLoader.TitleFont.deriveFont(13f));
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
	}
}
