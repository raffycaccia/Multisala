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
			ENTRY_BACKGROUND_COLOR = new Color(247,247,248);
			TITLE_COLOR = new Color(39, 39, 39);
			DESCRIPTION_COLOR = new Color(124,124,125);
			INFO_COLOR = new Color(48,48,48);
			DATA_COLOR = new Color(142,142,147);
			NAVIGATION_HEADER_COLOR = new Color(39, 39, 39);
			FILTER_TYPE_BUTTON_COLOR = new Color(6,112,218);//new Color(124,124,125);
			CHECKBOX_COLOR = new Color(39, 39, 39);
			RIGHT_PANEL_BACKGROUND_COLOR = Color.white;
			DIVISORE_COLOR = new Color(230,230,230);
			LOGO_COLOR = Color.white;
			POSTO_DISPONIBILE_COLOR = new Color(82,183,72);
			POSTO_NON_DISPONIBILE_COLOR = new Color(150,150,150);
			POSTO_SELEZIONATO_COLOR = new Color(49,117,42);
			POSTO_PRENOTATO_COLOR = new Color(90,200,250);
			POSTO_VENDUTO_COLOR = new Color(255,67,49);
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
			DIVISORE_COLOR = new Color(230,230,230);
			LOGO_COLOR = Color.white;
			POSTO_DISPONIBILE_COLOR = new Color(82,183,72);
			POSTO_NON_DISPONIBILE_COLOR = new Color(150,150,150);
			POSTO_SELEZIONATO_COLOR = new Color(49,117,42);
			POSTO_PRENOTATO_COLOR = new Color(90,200,250);
			POSTO_VENDUTO_COLOR = new Color(255,67,49);
			break;
		case Scuro:
			NAVIGATION_BUTTON_SELECTED_COLOR = new Color(75,75,75);
			CALL_TO_ACTION_BLUE_COLOR = new Color(8,132,255);
			CALL_TO_ACTION_PRESSED_BLUE_COLOR = new Color(6,112,218);
			SWITCHER_BUTTON_COLOR = new Color(100,101,102);
			SWITCHER_BUTTON_SELECTED_COLOR = new Color(205,206,208);
			MENU_COLOR = new Color(45,46,48);
			ENTRY_BACKGROUND_COLOR = new Color(52,53,55);
			TITLE_COLOR = new Color(221, 221, 221);
			DESCRIPTION_COLOR = new Color(153,154,155);
			INFO_COLOR = new Color(153,154,155);
			DATA_COLOR = new Color(124,124,125);
			NAVIGATION_HEADER_COLOR = new Color(221, 221, 221);
			FILTER_TYPE_BUTTON_COLOR = new Color(124,124,125);
			CHECKBOX_COLOR = new Color(221, 221, 221);
			RIGHT_PANEL_BACKGROUND_COLOR = new Color(30,31,34);
			DIVISORE_COLOR = new Color(52,53,55);
			LOGO_COLOR = Color.white;
			POSTO_DISPONIBILE_COLOR = new Color(82,183,72);
			POSTO_NON_DISPONIBILE_COLOR = new Color(150,150,150);
			POSTO_SELEZIONATO_COLOR = new Color(49,117,42);
			POSTO_PRENOTATO_COLOR = new Color(90,200,250);
			POSTO_VENDUTO_COLOR = new Color(255,67,49);
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
	public static Color DIVISORE_COLOR;
	public static Color LOGO_COLOR;
	public static Color POSTO_DISPONIBILE_COLOR;
	public static Color POSTO_NON_DISPONIBILE_COLOR;
	public static Color POSTO_SELEZIONATO_COLOR;
	public static Color POSTO_PRENOTATO_COLOR;
	public static Color POSTO_VENDUTO_COLOR;
}
