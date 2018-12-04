package progetto;

//TODO riscrivere commenti (questi sono autogenerati)

public class Orario {
	
	private int anno;
	private int mese;
	private int giorno;
	private int ora;
	private int minuto;
	
	public Orario(int anno, int mese, int giorno, int ora, int minuto) {
		//TODO gestire eccezioni
		this.setAnno(anno);
		this.setMese(mese);
		this.setGiorno(giorno);
		this.setOra(ora);
		this.setMinuto(minuto);
	}

	/**
	 * @return l'anno
	 */
	public int getAnno() {
		return anno;
	}

	/**
	 * @param anno un nuovo anno
	 */
	public void setAnno(int anno) {
		this.anno = anno;
	}

	/**
	 * @return the mese
	 */
	public int getMese() {
		return mese;
	}

	/**
	 * @param mese the mese to set
	 */
	public void setMese(int mese) {
		this.mese = mese;
	}

	/**
	 * @return the giorno
	 */
	public int getGiorno() {
		return giorno;
	}

	/**
	 * @param giorno the giorno to set
	 */
	public void setGiorno(int giorno) {
		this.giorno = giorno;
	}

	/**
	 * @return the ora
	 */
	public int getOra() {
		return ora;
	}

	/**
	 * @param ora the ora to set
	 */
	public void setOra(int ora) {
		this.ora = ora;
	}

	/**
	 * @return the minuto
	 */
	public int getMinuto() {
		return minuto;
	}

	/**
	 * @param minuto the minuto to set
	 */
	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}

}
