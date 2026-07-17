package hw4;

import java.util.Arrays;

public class Hw4_1 {
	public static void main(String[] args) {
		int[] numbers = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };

		System.out.println("\n\t• 有個一維陣列 " + Arrays.toString(numbers) + "\n" + "\t　 請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素：\n");

		int sum = 0;

		for (int num : numbers) {
			sum += num;
		}

		double avg = (double) sum / numbers.length;

		System.out.printf("\t　 所有元素的平均值：　%.2f%n", avg);
		System.out.print("\t　 大於平均值的元素:　");

		boolean first = true;
		for (int num : numbers) {
			if (num > avg) {
				if (!first) {
					System.out.print(", ");
				}
				System.out.print(num);
				first = false;
			}
		}
	}
}