package progetto;

//TODO riscrivere commenti (questi sono autogenerati)

public class Data {
	
	private int anno;
	private int mese;
	private int giorno;
	private int ora;
	private int minuto;
	
	public Data(int anno, int mese, int giorno, int ora, int minuto) {
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
		this.anno = anno;
	}
	
	/**
	 * @param giorno il giorno da settare
	 */
	public void setGiorno(int giorno) {
		this.giorno = giorno;
	}

	/**
	 * @param mese il mese to set
	 */
	public void setMese(int mese) {
		this.mese = mese;
	}
	
	/**
	 * @param minuto i minuti da settare
	 */
	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}

	/**
	 * @param ora l'ora da settare
	 */
	public void setOra(int ora) {
		this.ora = ora;
	}

	/**
	 * @return l'anno
	 */
	public int getAnno() {
		return anno;
	}
	
	/**
	 * @return il giorno
	 */
	public int getGiorno() {
		return giorno;
	}

	/**
	 * @return l'ora
	 */
	public int getOra() {
		return ora;
	}

	/**
	 * @return il mese
	 */
	public int getMese() {
		return mese;
	}
	
	/**
	 * @return i minuti
	 */
	public int getMinuto() {
		return minuto;
	}

	

}
