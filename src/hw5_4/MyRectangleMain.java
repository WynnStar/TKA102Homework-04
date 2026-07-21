package hw5_4;

public class MyRectangleMain {
	public static void main(String[] args) {
		try {
			MyRectangle r1 = new MyRectangle();
			r1.setWidth(10);
			r1.setDepth(20);
			System.out.println("(1)" + r1.getArea());

			MyRectangle r2 = new MyRectangle(10, 20);
			System.out.println("(2)" + r2.getArea());
		} catch (MyRectangleException e) {

			System.out.println(e.getMessage());
		}
	}
}
