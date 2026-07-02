package hw3;

import java.util.Scanner;

public class guessTheNumber {
	public static void main(String[] args) {

		final int MAX = 9;
		final int EXIT_CODE = 8964;
		System.out.println("\n• 請設計一隻程式,會亂數產生一個0~" + MAX + "的數字,然後可以玩猜數字遊戲:\n");
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int answer = (int) (Math.random() * (MAX + 1));
		while (true) {
			System.out.print("  請輸入一個0~" + MAX + "的數字，猜對了電腦會爆炸!(不想猜可以輸入8964離開):");
			int guess = sc.nextInt();
			if (guess == EXIT_CODE) {
				System.out.println("　 橘貓、橘貓、橘貓，橘貓好～大一隻，跟坦克車一樣，我怕被撞，被壓到就完蛋了!\n　 坦克出發！坦克出發！這次的答案是" + answer + "！\n");
				break;
			}

			if (guess > MAX || guess < 0) {
				System.out.println("　 看不懂0~9逆!!!!\n");
				continue;
			}

			if (guess != answer) {
				count++;
				System.out.println("　 哈哈!第" + count + "次猜錯囉！\n");
			} else {
				System.out.println("　 答對了!答案就是" + answer + "！要爆炸了！！！！\n");
				break;
			}

		}
		sc.close();
	}
}
