package hw4;

import java.util.Arrays;

public class Hw4_6 {

	public static void main(String[] args) {
		int[][] exam = { 
				{ 1, 2, 3, 4, 5, 6, 7, 8 },
				{ 10, 35, 40, 100, 90, 85, 75, 70 },
				{ 37, 75, 77, 89, 64, 75, 70, 95 },
				{ 100, 70, 79, 90, 75, 70, 79, 90 },
				{ 77, 95, 70, 89, 60, 75, 85, 89 },
				{ 98, 70, 89, 90, 75, 90, 89, 90 },
				{ 90, 80, 100, 75, 50, 20, 99, 75 }
				};

		System.out.println("\n　• 班上有8位同學，他們進行了6次考試結果如下：\n" 
				+ "　　學生號碼" + Arrays.toString(exam[0]) + "\n" 
				+ "　　一次考試"+ Arrays.toString(exam[1]) + "\n" 
				+ "　　二次考試" + Arrays.toString(exam[2]) + "\n" 
				+ "　　三次考試"+ Arrays.toString(exam[3]) + "\n" 
				+ "　　四次考試" + Arrays.toString(exam[4]) + "\n" 
				+ "　　五次考試"+ Arrays.toString(exam[5]) + "\n" 
				+ "　　六次考試" + Arrays.toString(exam[6]) + "\n" 
				+ "　　請算出每位同學考最高分的次數\n");

		int[] count = new int[8];

		for (int i = 1; i < exam.length; i++) {

			int max = exam[i][0];

			for (int j = 1; j < exam[i].length; j++) {
				if (exam[i][j] > max) {
					max = exam[i][j];
				}
			}
			for (int j = 0; j < exam[i].length; j++) {
				if (exam[i][j] == max) {
					count[j]++;
				}
			}
		}

		for (int i = 0; i < count.length; i++) {
			System.out.println("\t" + (i + 1) + "號同學考最高分 " + count[i] + "次");
		}
	}
}
