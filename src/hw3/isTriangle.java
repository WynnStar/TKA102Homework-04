package hw3;

import java.util.Arrays;
import java.util.Scanner;

public class isTriangle {
	public static void main(String[] args) {
		
		final int EXIT_CODE = 0;
		System.out.println("\n• 請設計一隻程式,使用者輸入三個數字後,能判斷出是什麼三角形:\n");
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("  請輸入三角形的三個邊長(輸入0離開):");
			int side1 = sc.nextInt();

			if (side1 == EXIT_CODE) {
				break;

			}

			int side2 = sc.nextInt();
			int side3 = sc.nextInt();

			int[] scArray = { side1, side2, side3 };
			Arrays.sort(scArray);

			int a = scArray[0];
			int b = scArray[1];
			int c = scArray[2];

			
			
			
			if (a == 4 && b == 6 && c==89) {
				System.out.println("\n　　　維尼寫詩，維尼禁止，維尼做不可能的事！\n");
			} else if (((a + b) <= c) || a <= 0 || b <= 0 || c <= 0) {
				System.out.println("\n　　　　　　不是三角形\n");
			} else if (a == b && b == c) {
				System.out.println("\n　　　　　　正三角形\n");
//		}else if(((a*a+b*b)==(c*c))&&(a==b||b==c||a==c)) {
//			System.out.println("\n　　　　　等腰直角三角形\n");
			} else if (a == b || b == c || a == c) {
				System.out.println("\n　　　　　　等腰三角形\n");
			} else if ((a * a + b * b) == (c * c)) {
				System.out.println("\n　　　　　　直角三角形\n");
			} else if ((a * a + b * b) < (c * c)) {
				System.out.println("\n　　　　　　鈍角三角形\n");
			} else {
				System.out.println("\n　　　　　　銳角三角形\n");
			}
		}
		sc.close(); // Java 建議關閉資源
	}
}

// 小數時，相乘結果不能用==比較
