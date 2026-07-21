package hw5;

import java.util.Scanner;

public class InputInt {
	
	public static int inputInt(Scanner sc, String message) {

	    while (true) {

	        System.out.print(message);
	        
	        if (sc.hasNextInt()) {
	            return sc.nextInt();
	        }
	        

	        System.out.println("\t錯誤：請輸入整數！\n");
	        sc.next(); 
	    }
	}
}
