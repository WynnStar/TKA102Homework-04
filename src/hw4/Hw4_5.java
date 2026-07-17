package hw4;

import java.util.Scanner;

public class Hw4_5 {
	public static void main(String[] args) {
		final int EXIT_CODE = 0;
		
		System.out.println(
				"\n　• 請設計由鍵盤輸入三個整數，分別代表西元yyyy年，mm月，dd日，執行後會顯示是該年的第幾天。\n" + 
				"　　　例：輸入 1984 9 8 三個號碼後，程式會顯示「輸入的日期為該年第252天」\n");

		Scanner sc = new Scanner(System.in);
		while (true) {

			int year = inputInt(sc,"    (可以輸入0離開)\n    請輸入西元年:");
			if (year == EXIT_CODE) {
				break;
			}

			int month = inputInt(sc,"    月份:");
			int day = inputInt(sc,"    日期:");
			
			if (!isValidDate(year, month, day)) {
				System.out.println("\n    日期不存在喔！可以再確認一下！\n");
				continue;
			}

			int date = getDayOfYear(year,month,day);
			
			System.out.println("\n　• 「輸入的日期為該年第" + date + "天」\n");
		}
		sc.close();
	}
	
	public static boolean isLeapYear(int year){

		if(year < 1582) {
			return year % 4 == 0 ;
		}
		
	    return (year%400==0 || (year%4==0 && year%100!=0));
	}
	
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
	
	public static int getDayOfYear(int year,int month,int day){

		int[] days = getMonthDays(year);
		
	    int total=day;

	    for(int i=0;i<month-1;i++){

	        total+=days[i];
	    }
	    
		if(year==1582&& (month>10 || (month==10&& day>=15))){ total-=10;}
		// 1582年10月是歷史上唯一只有21天的月份。
		// 當時教宗格列高利十三世為修正「儒略曆」累積的誤差，
		// 宣布自該年10月4日（星期四）起改行「格列高利曆」（即現行公曆），
		// 直接將隔天訂為10月15日（星期五），使得中間10天憑空消失。
	    
	    return total;
	}
	
	public static int[] getMonthDays(int year){

	    int[] days={31,28,31,30,31,30,31,31,30,31,30,31};

	    if(isLeapYear(year)){
	        days[1]=29;
	    }

	    return days;
	}
	
	public static boolean isValidDate(int year, int month, int day) {
		if(year <= 0) {
			return false;
		}
		
	    if (month < 1 || month > 12) {
	        return false;
	    }
	    
	    int[] days = getMonthDays(year);
	    
	    if (day < 1 || day > days[month - 1]) {
	        return false;
	    }
	    
	    if(year==1582 && month==10 && day>=5 && day<=14){
	    	return false;
	   	}
	    
	    return true;
	}
}
