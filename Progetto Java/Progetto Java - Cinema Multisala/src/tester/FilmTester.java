package tester;
import obj.Film;


public class FilmTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Film film = new Film("Tre uomini e una gamba", "Stupendo", 110);
		
		System.out.println(film);
		
		Film cloned = film.clone();
		System.out.println(cloned);
		System.out.println(cloned.equals(film));
		
		
		

	}

}
