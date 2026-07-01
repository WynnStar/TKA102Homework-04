package hw1;

public class homeworkW1 {

	public static void main(String[] args) {

		int a = 12, b = 6, sum = a + b, product = a * b;

		System.out.println("\n• 請設計一隻Java程式，計算" + a + "、" + b + "這兩個數值的和與積。");
		System.out.println("　　" + a + " + " + b + " = " + sum + "");
		System.out.println("　　" + a + " x " + b + " = " + product + "\n");

		final int PER_DOZEN = 12;
		int eggs = 200, dozen = eggs / PER_DOZEN, remainingEggs = eggs % PER_DOZEN;

		System.out.println("• 請設計一隻Java程式，計算" + eggs + "顆蛋共是幾打幾顆? (一打為12顆)。");
		System.out.println("　　" + eggs + "顆蛋共是" + dozen + "打" + remainingEggs + "顆。\n");

		int seconds = 256559, day = seconds / (60 * 60 * 24), hr = seconds / (60 * 60) % 24, min = seconds / 60 % 60,
				sec = seconds % 60;

		System.out.println("• 請由程式算出" + seconds + "秒為多少天、多少小時、多少分與多少秒。");
		System.out.println("　　" + day + "天" + hr + "小時" + min + "分" + sec + "秒\n");

		final double PI = 3.1415;
		double r = 5, area = r * r * PI, c = r * 2 * PI;

		System.out.println("• 請定義一個常數為3.1415(圓周率)，並計算半徑為" + (int) r + "的圓面積與圓周長。");
		System.out.println("　　半徑為" + (int) r + "的圓，圓面積是" + (float) area + "，圓周長是" + (float) c + "。\n");

		int price = 150, year = 10;
		double rate = 0.02, totalMoney = price * 10000 * Math.pow(1 + rate, year);
		System.out.println(
				"• 某人在銀行存入" + price + "萬,銀行利率為" + rate * 100 + "%,如果每年利息都繼續存入銀行,請用程式計算" + year + "年後,本金加利息共有多少錢。");
		System.out.println("　　" + year + "年後,本金加利息共有" + (float) totalMoney + "元。\n");

		System.out.println("• 請寫一隻程式,利用System.out.println()印出以下三個運算式結果:\n　　5  +  5  => " + (5 + 5)); // 整數相加
		System.out.println("　　5  + '5' => " + (5 + '5')); // 因為'5'的 Unicode 值為53，所以相加結果為58
		System.out.println("　　5  + \"5\" => " + (5 + "5")); // 因為"5"為字串，所以字串串接，結果為55。

	}
}