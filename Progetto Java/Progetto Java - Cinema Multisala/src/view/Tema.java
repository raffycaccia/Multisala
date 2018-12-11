package view;

import java.awt.Color;

public class Tema {
	
	
	public Tema(int idTema) {
		
		switch(idTema) {
		case 0:
			NAVIGATION_BUTTON_SELECTED_COLOR = new Color(75,75,75);
			CALL_TO_ACTION_BLUE_COLOR = new Color(8,132,255);
			CALL_TO_ACTION_PRESSED_BLUE_COLOR = new Color(6,112,218);
			SWITCHER_BUTTON_COLOR = new Color(100,101,102);
			SWITCHER_BUTTON_SELECTED_COLOR = new Color(205,206,208);
			MENU_COLOR = new Color(45,46,48);
			ENTRY_BACKGROUND_COLOR = new Color(250,250,250);
		}
	}

	private int temaId = 0;
	
	public static Color NAVIGATION_BUTTON_SELECTED_COLOR;
	public static Color CALL_TO_ACTION_BLUE_COLOR;
	public static Color CALL_TO_ACTION_PRESSED_BLUE_COLOR;
	public static Color SWITCHER_BUTTON_COLOR;
	public static Color SWITCHER_BUTTON_SELECTED_COLOR;
	public static Color MENU_COLOR;
	public static Color ENTRY_BACKGROUND_COLOR;
}
