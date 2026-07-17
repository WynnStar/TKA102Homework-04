package hw3;

import java.util.Arrays;
import java.util.Scanner;

public class isTriangle {
	public static void main(String[] args) {

		final int EXIT_CODE = 0;
		final double EPS = 1e-10;
		
		System.out.println("\n• 請設計一隻程式,使用者輸入三個數字後,能判斷出是什麼三角形:\n");
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("  請輸入三角形的三個邊長(輸入0離開):");

			if (!sc.hasNextDouble()) {
	            System.out.println("\t 錯誤：請輸入數字！\n");
	            sc.next();
	            continue;
			}
			
			double side1 = sc.nextDouble();
			
			if (side1 == EXIT_CODE) {
				break;
			}

			if (!sc.hasNextDouble()) {
	            System.out.println("\t 錯誤：請輸入數字！\n");
	            sc.next();
	            continue;
			}
			double side2 = sc.nextDouble();
			
			if (!sc.hasNextDouble()) {
	            System.out.println("\t 錯誤：請輸入數字！\n");
	            sc.next();
	            continue;
			}
			double side3 = sc.nextDouble();

			double[] side = { side1, side2, side3 };
			Arrays.sort(side);

			double a = side[0];
			double b = side[1];
			double c = side[2];
			double aa = a * a;
			double bb = b * b;
			double cc = c * c;
			boolean isRight = Math.abs(aa + bb - cc) < EPS;
			boolean isIsosceles = (a == b || b == c );
			
			if (a == 4 && b == 6 && c == 89) {
				System.out.println("\t 維尼寫詩，維尼禁止，維尼做不可能的事！\n\n"); // 彩蛋
			} else if (a <= 0) {
				System.out.println("\t 不是三角形\n\n");
			} else if (a == b && b == c) {
				System.out.println("\t 正三角形\n\n");
			}else if(isRight&&isIsosceles) {
				System.out.println("\t 等腰直角三角形\n\n");
			} else if (isIsosceles) {
				System.out.println("\t 等腰三角形\n\n");
			} else if (isRight) {	
				System.out.println("\t 直角三角形\n\n");
			} else if ((aa + bb) < (cc)) {
				System.out.println("\t 鈍角三角形\n\n");
			} else {
				System.out.println("\t 銳角三角形\n\n");
			}
		}
		sc.close();
	}
}

// 小數時，相乘結果不能用==比較
