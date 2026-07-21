package hw5;

import java.util.Scanner;

public class TestRandAvg {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			int amount = InputInt.inputInt(sc, " (可輸入0離開) 請輸入想要的隨機亂數個數：");
			int min = InputInt.inputInt(sc, " (可輸入0離開) 請輸入亂數的最小值：");
			int max = InputInt.inputInt(sc, " (可輸入0離開) 請輸入亂數的最大值：");
			
			if(amount == 0 || min == 0 || max == 0) {
				System.out.println("\t程式結束，感謝您的使用！");
				sc.close();
			    return;
			}
			
			try {
				RandAvg r1 = new RandAvg(amount, min, max);
				r1.randAvg();
			} catch (RandAvgException e) {
				System.out.println(e.getMessage());
			}

		}

	}
}
