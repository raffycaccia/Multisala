package model;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.IOException;

public class ResourceLoader {
	

	public static Font TitleFont;
	public static Font DescFont;
	public static Font HeaderFont;
	public static Font InfoFont;
	public static Font DataFont;
	public static Font BtnFont;
	public static Font BtnSelFont;
	
	/* Momentaneamente opzionale
	public ResourceLoader() {
		loadFonts();
	}
	*/
	
	public static void loadFonts() {
		try {
			DescFont = (Font.createFont(Font.TRUETYPE_FONT, new File("./Fonts/Avenir-BookOblique.ttf")).deriveFont(16f));
			TitleFont = (Font.createFont(Font.TRUETYPE_FONT, new File("./Fonts/Avenir-Heavy.ttf")).deriveFont(28f));
			HeaderFont = (Font.createFont(Font.TRUETYPE_FONT, new File("./Fonts/Avenir-Black.ttf")).deriveFont(45f));
			InfoFont = (Font.createFont(Font.TRUETYPE_FONT, new File("./Fonts/Avenir-Heavy.ttf")).deriveFont(18f));
			DataFont = (Font.createFont(Font.TRUETYPE_FONT, new File("./Fonts/Avenir-Heavy.ttf")).deriveFont(18f));
			BtnFont = (Font.createFont(Font.TRUETYPE_FONT, new File("./Fonts/Avenir-Book.ttf")).deriveFont(19f));
			BtnSelFont = (Font.createFont(Font.TRUETYPE_FONT, new File("./Fonts/Avenir-Medium.ttf")).deriveFont(19f));
		} catch (FontFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}