package view;

import java.awt.Color;

public class Tema {
	
	public enum Stile {Chiaro, Scuro, Combinato};
	
	public Tema(Stile tema) {
		
		switch(tema) {
		case Combinato:
			NAVIGATION_BUTTON_SELECTED_COLOR = new Color(75,75,75);
			CALL_TO_ACTION_BLUE_COLOR = new Color(8,132,255);
			CALL_TO_ACTION_PRESSED_BLUE_COLOR = new Color(6,112,218);
			SWITCHER_BUTTON_COLOR = new Color(100,101,102);
			SWITCHER_BUTTON_SELECTED_COLOR = new Color(205,206,208);
			MENU_COLOR = new Color(45,46,48);
			ENTRY_BACKGROUND_COLOR = new Color(250,250,250);
			TITLE_COLOR = new Color(39, 39, 39);
			DESCRIPTION_COLOR = new Color(124,124,125);
			INFO_COLOR = new Color(48,48,48);
			DATA_COLOR = new Color(124,124,125);
			NAVIGATION_HEADER_COLOR = new Color(17, 17, 17);
			FILTER_TYPE_BUTTON_COLOR = new Color(124,124,125);
			CHECKBOX_COLOR = new Color(39, 39, 39);
			RIGHT_PANEL_BACKGROUND_COLOR = Color.white;
			break;
		case Chiaro:
			NAVIGATION_BUTTON_SELECTED_COLOR = new Color(75,75,75);
			CALL_TO_ACTION_BLUE_COLOR = new Color(8,132,255);
			CALL_TO_ACTION_PRESSED_BLUE_COLOR = new Color(6,112,218);
			SWITCHER_BUTTON_COLOR = new Color(100,101,102);
			SWITCHER_BUTTON_SELECTED_COLOR = new Color(205,206,208);
			MENU_COLOR = new Color(45,46,48);
			ENTRY_BACKGROUND_COLOR = new Color(0,0,0);
			TITLE_COLOR = new Color(39, 39, 39);
			DESCRIPTION_COLOR = new Color(124,124,125);
			INFO_COLOR = new Color(48,48,48);
			DATA_COLOR = new Color(124,124,125);
			NAVIGATION_HEADER_COLOR = new Color(17, 17, 17);
			FILTER_TYPE_BUTTON_COLOR = new Color(124,124,125);
			CHECKBOX_COLOR = new Color(39, 39, 39);
			RIGHT_PANEL_BACKGROUND_COLOR = Color.white;
			break;
		case Scuro:
			NAVIGATION_BUTTON_SELECTED_COLOR = new Color(75,75,75);
			CALL_TO_ACTION_BLUE_COLOR = new Color(8,132,255);
			CALL_TO_ACTION_PRESSED_BLUE_COLOR = new Color(6,112,218);
			SWITCHER_BUTTON_COLOR = new Color(100,101,102);
			SWITCHER_BUTTON_SELECTED_COLOR = new Color(205,206,208);
			MENU_COLOR = new Color(45,46,48);
			ENTRY_BACKGROUND_COLOR = new Color(0,0,0);
			TITLE_COLOR = new Color(39, 39, 39);
			DESCRIPTION_COLOR = new Color(124,124,125);
			INFO_COLOR = new Color(48,48,48);
			DATA_COLOR = new Color(124,124,125);
			NAVIGATION_HEADER_COLOR = new Color(17, 17, 17);
			FILTER_TYPE_BUTTON_COLOR = new Color(124,124,125);
			CHECKBOX_COLOR = new Color(39, 39, 39);
			RIGHT_PANEL_BACKGROUND_COLOR = Color.white;
			break;
		}
	}
	
	public static Color NAVIGATION_BUTTON_SELECTED_COLOR;
	public static Color CALL_TO_ACTION_BLUE_COLOR;
	public static Color CALL_TO_ACTION_PRESSED_BLUE_COLOR;
	public static Color SWITCHER_BUTTON_COLOR;
	public static Color SWITCHER_BUTTON_SELECTED_COLOR;
	public static Color MENU_COLOR;
	public static Color ENTRY_BACKGROUND_COLOR;
	public static Color TITLE_COLOR;
	public static Color DESCRIPTION_COLOR;
	public static Color INFO_COLOR;
	public static Color DATA_COLOR;
	public static Color NAVIGATION_HEADER_COLOR;
	public static Color FILTER_TYPE_BUTTON_COLOR;
	public static Color CHECKBOX_COLOR;
	public static Color RIGHT_PANEL_BACKGROUND_COLOR;
}
