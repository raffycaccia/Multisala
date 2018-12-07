package model;

public class PoliticaAlreadyPresentException extends RuntimeException {

	public PoliticaAlreadyPresentException() {
		
	}
	
	public PoliticaAlreadyPresentException(String msg) {
		super(msg);
	}
}
