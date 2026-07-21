package hw5;

import java.util.Scanner;

public class TestStarSquare {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			int width = InputInt.inputInt(sc, " (可輸入0離開) 請輸入寬：");
			int height = InputInt.inputInt(sc, " (可輸入0離開) 請輸入高：");

			if(width == 0 || height == 0) {
				System.out.println("\t程式結束，感謝您的使用！");
				sc.close();
			    return;
			}
			
			try {
				StarSquare s1 = new StarSquare(width, height);
				s1.printStarSquare();
			} catch (StarSquareException e) {
				System.out.println(e.getMessage());
			}

		}

	}
}
