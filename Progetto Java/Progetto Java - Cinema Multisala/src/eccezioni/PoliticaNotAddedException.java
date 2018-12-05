package eccezioni;

public class PoliticaNotAddedException extends RuntimeException {
	
	public PoliticaNotAddedException() {
		super("Politica non inserita!");
	}
	
	public PoliticaNotAddedException(String msg) {
		super(msg);
	}
}
