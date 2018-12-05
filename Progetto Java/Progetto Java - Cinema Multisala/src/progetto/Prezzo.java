package progetto;

//TODO commenti

public class Prezzo {
	
	private final float prezzo;
	
	public Prezzo(float prezzo) throws IllegalArgumentException {
		if (prezzo < 0) {
			throw new IllegalArgumentException("Il prezzo non puó essere negativo");
		} else {
			this.prezzo = prezzo;
		}
	}
	
	public float getPrezzo() {
		return prezzo;
	}

}
