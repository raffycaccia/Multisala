package model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

//TODO riscrivere commenti (questi sono autogenerati)

public class Data {

	private GregorianCalendar data;
	
	public Data(int anno, int mese, int giorno, int ora, int minuto) {
		data = new GregorianCalendar();
		
		//TODO gestire eccezioni
		setAnno(anno);
		setMese(mese);
		setGiorno(giorno);
		setOra(ora);
		setMinuto(minuto);
		
	}

	/**
	 * @param anno un nuovo anno
	 */
	public void setAnno(int anno) {
		data.set(Calendar.YEAR, anno);
	}
	
	/**
	 * @param giorno il giorno da settare
	 */
	public void setGiorno(int giorno) {
		data.set(Calendar.DAY_OF_MONTH, giorno);
	}

	/**
	 * @param mese il mese to set
	 */
	public void setMese(int mese) {
		data.set(Calendar.MONTH, mese - 1);
	}
	
	/**
	 * @param minuto i minuti da settare
	 */
	public void setMinuto(int minuto) {
		data.set(Calendar.MINUTE, minuto);
	}

	/**
	 * @param ora l'ora da settare
	 */
	public void setOra(int ora) {
		data.set(Calendar.HOUR_OF_DAY, ora);
	}

	//TODO
	public String getDataFormattata() {
		return getAnno() + "-" + getMese() + "-" + getGiorno();
	}
	
	/**
	 * @return l'anno
	 */
	public int getAnno() {
		return data.get(Calendar.YEAR);
	}
	
	/**
	 * @return il giorno
	 */
	public int getGiorno() {
		return data.get(Calendar.DAY_OF_MONTH);
	}


	/**
	 * @return l'ora
	 */
	public int getOra() {
		return data.get(Calendar.HOUR_OF_DAY);
	}

	/**
	 * @return il mese
	 */
	public int getMese() {
		return data.get(Calendar.MONTH) + 1;
	}
	
	/**
	 * @return i minuti
	 */
	public int getMinuto() {
		return data.get(Calendar.MINUTE);
	}

	/**
	 * @return l'ora
	 */
	public String getOraString() {
		int ora = getOra();
		String s = Integer.toString(ora);
		if (ora < 10) {
			s = ("0" + ora);
		}
		return s;
	}

	/**
	 * @return il mese
	 */
	public String getMeseString() {
		int mese = getMese();
		String s = Integer.toString(mese);
		if (mese < 10) {
			s = ("0" + mese);
		}
		return s;
	}
	
	/**
	 * @return i minuti
	 */
	public String getMinutoString() {
		int minuto = getMinuto();
		String s = Integer.toString(minuto);
		if (minuto < 10) {
			s = ("0" + minuto);
		}
		return s;
	}
	
	public static String getDay(String day, String month, String year) {
	    int y = Integer.parseInt(year), m = Integer.parseInt(month), d = Integer.parseInt(day);
	    return java.time.format.DateTimeFormatter.ofPattern("EEEE").format(LocalDate.of(y, m, d));
	}

	

}
