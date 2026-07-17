package hw4;

import java.util.Scanner;

public class Hw4_2 {
	public static void main(String[] args) {
		final String EXIT_TEXT = "我是反話機器人，跟我說說什麼吧！";
		System.out.println("\n\t• 請建立一個字串，經過程式執行後，輸入結果是反過來的\r\n"
				+ "\t  例如String s = “Hello World”，執行結果即為dlroW olleH");
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("\n\t　　🤖：「我是反話機器人，跟我說說什麼吧！」 (但別學我說話。)");
			System.out.print("\t　　(你想說的是)>>");
			String s  = sc.nextLine();
			if (EXIT_TEXT.equals(s)) {
				System.out.print("\t　　🤖：「rats live on no evil star」");
				break;
			}else {
			
				System.out.print("\t　　🤖：「");
				for (int i = s.length()-1 ; i >= 0; i--) {
				System.out.print(s.charAt(i));
				}
				System.out.print("！」\n");
			}
			
		}
		
		sc.close();
		
	}
}
