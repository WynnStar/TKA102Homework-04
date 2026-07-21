package hw5;

public class TestSetGetStarSquare {
	public static void main(String[] args) {
		try {
			StarSquare s2 = new StarSquare(3, 3);
			s2.getWidth();
			s2.getHeight();
			s2.printStarSquare();
		} catch (StarSquareException e) {
			System.out.println(e.getMessage());
		}
	}

}
