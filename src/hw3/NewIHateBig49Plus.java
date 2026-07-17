package hw3;

import java.util.Arrays;
import java.util.Scanner;

public class NewIHateBig49Plus {

	public static void main(String[] args) {

		final int LOTTOSTART = 1, LOTTOEND = 49, EXIT_CODE = 78;
		System.out.println(
				"\n• 阿文很喜歡簽大樂透 (" + LOTTOSTART + " ~ " + LOTTOEND + "),但他是個善變的人,\n" + "　上次討厭數字是4,但這次他想要依心情決定討厭哪個數字。\n"
						+ "　這邊剛好有一個跟阿文一樣討厭的程式,\n" + "　可以輸入他不想要的數字(0~9),畫面會顯示他可以選擇的號碼與總數。\n");
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("　　機掰阿文．．．．．．請輸入你今天討厭0~9哪一個數字：");
			int hate = sc.nextInt();
			if (hate == EXIT_CODE) {
				System.out.print("　　對！阿文你真的很78！");
				break;
			}

			if (hate > 9 || hate < 0) {
				System.out.println("　　就說是0~9了！阿文你真的很機掰！\n");
				continue;
			}

			int choose[] = new int[LOTTOEND];
			int count = 0;

			for (int big49 = LOTTOSTART; big49 <= LOTTOEND; big49++) {
				int tens = big49 / 10;
				int ones = big49 % 10;
				if (tens == hate && big49 >= 10 || ones == hate) {
					continue;
				}
				choose[count] = big49;
				count++;
			}

			int[] lotto = new int[6];
			int idx = 0;

			while (idx < 6) {
				int num = choose[(int) (Math.random() * count)];

				boolean repeat = false;

				for (int i = 0; i < idx; i++) {
					if (lotto[i] == num) {
						repeat = true;
						break;
					}

				}

				if (!repeat) {
					lotto[idx] = num;
					idx++;
				}
			}

			Arrays.sort(lotto);

			System.out.print("　　機掰郎甭選啦！這六個數字：");
			for (int num : lotto) {
				System.out.print(num + " ");
			}
			System.out.println("簽一簽啦！信我是秦始皇！\n\n");

		}
		sc.close();
	}

}
