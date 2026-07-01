package hw2;

public class homeworkW2 {
	public static void main(String[]args) {

		int a = 1 , b = 1000 ;
		System.out.println("\n• 請設計一隻Java程式，計算"+a+"~"+b+"的偶數和。");

		int sum = 0 ;
			for (int t=a;t<=b;t++) {
				if (t % 2==0) {
				sum += t;
				}
			}
		System.out.println("    "+a+"~"+b+"的偶數和為"+sum);
//      --------------------------------------------------------------------------
		int a2 = 1 , b2 = 10 , product2 = 1;
		System.out.println("\n• 請設計一隻Java程式，計算"+a2+"~"+b2+"的連乘積。(用for迴圈)");
			for (int x=a2;x<=b2;x++) {
			product2 *= x;
			}	
		System.out.println("    "+a2 + "~" + b2 + " 的連乘積為：" + product2);
//      --------------------------------------------------------------------------
		int a3 = 1 , b3 = 10 , product3 = 1;
		System.out.println("\n• 請設計一隻Java程式，計算"+a3+"~"+b3+"的連乘積。(用while迴圈)");
			int y=a3;
			while(y<=b3) {	
			product3 *= y;
			y++;
			}	
		System.out.println("    "+a3 + "~" + b3 + " 的連乘積為：" + product3);
//      --------------------------------------------------------------------------
		System.out.println("\n• 請設計一隻Java程式，輸出結果為以下：");
			for (int z=1;z<=10;z++) {
				System.out.print("  " + (z * z) );
			}
//      --------------------------------------------------------------------------
		System.out.println("\n\n• 阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。\n  請設計一隻程式,輸出結果為阿文可以選擇的數字有哪些?總共有幾個?");
		System.out.print("　　可以選擇的數字有：");
			int count = 0 ;
			for (int big49 = 1; big49 <= 49; big49++) {
				if ( big49 / 10 !=  4 && big49 % 10 != 4) {
					System.out.print(big49+"　");
					count ++ ;
					}
			}
			System.out.println("\n 　總共有"+count+"個。");
//      --------------------------------------------------------------------------		
		System.out.println("\n• 請設計一隻Java程式，輸出結果為以下：");
			for(int e = 10; e>=1 ; e--) {
				for(int g= 1; g <= e ; g ++) {
					System.out.print(" "+g);
				}
				System.out.println();
		}
//      --------------------------------------------------------------------------
		System.out.println("\n\n• 請設計一隻Java程式，輸出結果為以下：");
			for(int e = 1; e<=5 ; e++) {
				for(int g= 1; g <=e ; g ++) {
					System.out.print(" "+(char)('A'+e-1));
				}
				System.out.println();
			}
		}
}