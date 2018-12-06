package interfacciaGrafica;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.IOException;

public class ResourceLoader {
	

	public static Font TitleFont;
	public static Font DescFont;
	public static Font HeaderFont;
	
	/* Momentaneamente opzionale
	public ResourceLoader() {
		loadFonts();
	}
	*/
	
	public static void loadFonts() {
		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		try {
			DescFont = (Font.createFont(Font.TRUETYPE_FONT, new File("./Fonts/Avenir-BookOblique.ttf")).deriveFont(16f));
			TitleFont = (Font.createFont(Font.TRUETYPE_FONT, new File("./Fonts/Avenir-Heavy.ttf")).deriveFont(28f));
			HeaderFont = (Font.createFont(Font.TRUETYPE_FONT, new File("./Fonts/Avenir-Black.ttf")).deriveFont(45f));
			ge.registerFont(DescFont);
		} catch (FontFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
