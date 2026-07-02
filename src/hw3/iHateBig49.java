package hw3;

import java.util.Scanner;

public class iHateBig49 {
	public static void main(String[] args) {

		final int LOTTOSTART = 1, LOTTOEND = 49 , EXIT_CODE=78;
		System.out.println(
				"\n\n• 阿文很喜歡簽大樂透 (" + LOTTOSTART + " ~ " + LOTTOEND + "),但他是個善變的人,\n" + "　上次討厭數字是4,但這次他想要依心情決定討厭哪個數字。\n"
						+ "　這邊剛好有一個跟阿文一樣討厭的程式,\n" + "　可以輸入他不想要的數字(0~9),\n" + "　畫面會顯示他可以選擇的號碼與總數。\n\n");
		Scanner sc = new Scanner(System.in);

		while (true) {
			int count = 0;
			System.out.print("　　機掰阿文．．．．．．請輸入你今天討厭0~9哪一個數字：(輸入78可以離開)");
			int hate = sc.nextInt();
			if (hate == EXIT_CODE) {
				System.out.print("　　對！阿文你真的很78！");
				break;
			}

			if (hate > 9 || hate < 0) {
				System.out.println("　　阿文你真的很機掰！\n");
				continue;
			}

			for (int big49 = LOTTOSTART; big49 <= LOTTOEND; big49++) {
				int tens = big49 / 10;
				int ones = big49 % 10;
				if (tens == hate && big49 >= 10 || ones == hate) {
					continue;
				}
				System.out.print("　"+big49);
				count++;
			}
			System.out.println("\n 　總共有" + count + "個。\n");

		}

		sc.close();
	}

}
