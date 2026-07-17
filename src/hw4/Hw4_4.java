package hw4;

import java.util.Arrays;
import java.util.Scanner;

public class Hw4_4 {
	public static void main(String[] args) {
		
		final int EMP_ID = 0, CASH = 1 , EXIT_CODE = 0;
		
		int[][] iAmBroke = { 
				{ 25, 32, 8, 19, 27 },
				{ 2500, 800, 500, 1000, 1200 }
		};

		System.out.println("\n　• 阿文上班時忘了帶錢包,想要向同事借錢,\n" + "　　和他交情比較好的同事共有5個,其員工編號與身上現金列表如下：\n\n" + "　　員工編號： "
				+ Arrays.toString(iAmBroke[0]) + "\n" + "　　身上現金：" + Arrays.toString(iAmBroke[1]) + "\n\n"
				+ "　　請設計一個程式,可以讓小華(你怎麼改名了?)輸入欲借的金額後,\n" + "　　便會顯示哪些員工編號的同事有錢可借他;並且統計有錢可借的總人數:\n"
				+ "　　例如輸入1000 就顯示「有錢可借的員工編號: 25 19 27 共 3 人");

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("\n　　機掰阿文：「拎北可以跟誰借錢哩！」");
			System.out.print("　　請輸入要借多少錢　>>>>　");
			int borrow = sc.nextInt();

			if (borrow == EXIT_CODE) {
				System.out.print("　　機掰阿文：「不借了，回家吃泡麵！」\n");
				break;

			}
			if (borrow < 0) {
				System.out.println("　　「你知道負數是你要借錢給別人嗎？」\n");
				continue;			
			}
			
			int count = 0 ;
			
			for (int i = 0; i < iAmBroke[CASH].length; i++) {
				if (iAmBroke[CASH][i] >= borrow) {

					if(count ==0 ) {
						System.out.print("　　有錢可借的員工編號: ");
					}else {
						System.out.print(", ");
					}
					System.out.print(iAmBroke[EMP_ID][i]);
					count++;					
				}
			}

			if (count == 0 ) {
				System.out.println("沒有人，大家都沒錢啦！");
			} else {
				
				System.out.println(" , 共 " + count + " 人");
			}

//			} else {
//				System.out.print("　　「醒醒吧阿文！你根本沒有交情好的同事！」");
//			}	//如果輸入後來改String時考慮

		}
		sc.close();
	}
}
