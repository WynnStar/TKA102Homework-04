package hw3;

import java.util.Scanner;

public class iHateBig49Plus {
	public static void main(String[] args) {

		final int LOTTOSTART = 1, LOTTOEND = 49, EXIT_CODE = 78;
		System.out.println(
				"\n\n• 阿文很喜歡簽大樂透 (" + LOTTOSTART + " ~ " + LOTTOEND + "),但他是個善變的人,\n" + "　上次討厭數字是4,但這次他想要依心情決定討厭哪個數字。\n"
						+ "　這邊剛好有一個跟阿文一樣討厭的程式,\n" + "　可以輸入他不想要的數字(0~9),\n" + "　畫面會顯示他可以選擇的號碼與總數。\n\n");
		Scanner sc = new Scanner(System.in);

		while (true) {
			int count = 0;
			System.out.print("　　機掰阿文．．．．．．請輸入你今天討厭0~9哪一個數字：");
			int hate = sc.nextInt();
			if (hate == EXIT_CODE) {
				System.out.print("　　對！阿文你真的很78！");
				break;
			}

			if (hate > 9 || hate < 0) {
				System.out.println("　　阿文你真的很機掰！\n");
				continue;
			}

			int choose[] = new int[LOTTOEND];

			for (int big49 = LOTTOSTART; big49 <= LOTTOEND; big49++) {
				int tens = big49 / 10;
				int ones = big49 % 10;
				if (tens == hate && big49 >= 10 || ones == hate) {
					continue;
				}
				choose[count] = big49;
				count++;
			}

			while (true) {
				int a = (int) (Math.random() * count);
				int b = (int) (Math.random() * count);
				int c = (int) (Math.random() * count);
				int d = (int) (Math.random() * count);
				int e = (int) (Math.random() * count);
				int f = (int) (Math.random() * count);

				if (a != b && a != c && a != d && a != e && a != f && b != c && b != d && b != e && b != f && c != d
						&& c != e && c != f && d != e && d != f && e != f) {

					System.out.println("　　機掰郎甭選啦！這六個" + choose[a] + "、" + choose[b] + "、" + choose[c] + "、" + choose[d]
							+ "、" + choose[e] + "、" + choose[f] + "簽一簽啦！信我是秦始皇！\n");
					break;
				}
			}
		}
		sc.close();
	}
}
