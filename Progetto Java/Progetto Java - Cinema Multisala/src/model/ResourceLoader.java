package model;

import java.awt.Font;
import java.awt.FontFormatException;

import java.io.File;
import java.io.IOException;

public class ResourceLoader {
	

	public static Font HeavyFont;
	public static Font BookObliqueFont;
	public static Font BlackFont;
	public static Font BookFont;
	public static Font MediumFont;
	//public static MultiResolutionImage clienteBtnIcon;
	
	/* Momentaneamente opzionale
	public ResourceLoader() {
		loadFonts();
	}
	*/
	
	public static void loadFonts() {
		try {
			BookObliqueFont = (Font.createFont(Font.TRUETYPE_FONT, new File("./Fonts/Avenir-BookOblique.ttf")));
			HeavyFont = (Font.createFont(Font.TRUETYPE_FONT, new File("./Fonts/Avenir-Heavy.ttf")));
			BlackFont = (Font.createFont(Font.TRUETYPE_FONT, new File("./Fonts/Avenir-Black.ttf")));
			BookFont = (Font.createFont(Font.TRUETYPE_FONT, new File("./Fonts/Avenir-Book.ttf")));
			MediumFont = (Font.createFont(Font.TRUETYPE_FONT, new File("./Fonts/Avenir-Medium.ttf")));
		} catch (FontFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/*
	public static void loadButtonsIcon() throws IOException {
		ArrayList<Image> imgList = new ArrayList<Image>();
		imgList.add(ImageIO.read(new File("Cliente.png")));
		imgList.add(ImageIO.read(new File("Cliente@2x.png")));
		imgList.add(ImageIO.read(new File("Cliente@3x.png")));
		clienteBtnIcon = new BaseMultiResolutionImage(imgList.toArray(new Image[0]));
	}
	*/
}
