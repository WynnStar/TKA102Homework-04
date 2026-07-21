package hw5_3;

import java.util.Arrays;

public class Work03 {
	static int[][] intArray = {
			{1,6,3},
			{9,5,2}
	};
	
	static double[][] doubleArray = {
			{1.2,3.5,2.2},
			{7.4,2.1,8.2}
	};
	
	
	public static void main(String[] args){
		System.out.println("• 利用Overloading,\n"
				+"設計兩個方法int maxElement(int x[][])\n"
				+"與double maxElement(double x[][]),\n"
				+"可以找出二維陣列的最大值並回傳,如圖:");
		System.out.println("  int[][] intArray = {\n\t  " 
				+ Arrays.toString(intArray[0]) + ",\n\t  " 
				+ Arrays.toString(intArray[1]) + "\n\t};\n");
		System.out.println("  double[][] doubleArray = {\n\t  " 
				+ Arrays.toString(doubleArray[0]) + ",\n\t  " 
				+ Arrays.toString(doubleArray[1]) + "\n\t};\n");		
		
		
		System.out.println("==============================\n");
		Work03 w = new Work03();
		System.out.println("　　　intArray的最大值："+w.maxElement(intArray));
		System.out.println("　doubleArray的最大值："+w.maxElement(doubleArray));
	}

	
	public int maxElement(int x[][]) {
		int max = x[0][0];
		for(int i=0; i < x.length;i++) {
			for(int j=0; j < x[i].length;j++) {
				if(x[i][j]>max) {
				max = x[i][j];
				}
			}
		}
	return max;
	}
	
	public double maxElement(double y[][]) {
		double max = y[0][0];
		
		for(int i=0; i < y.length;i++) {
			for(int j=0; j < y[i].length;j++) {
				if(y[i][j]>max) {
				max = y[i][j];
				}
			}
		}
	return max;
	}
	

}
