package hw4;

public class Hw4_3 {
	public static void main(String[] args) {
		System.out.println("\n　• 有個字串陣列如下 (八大行星)：\r\n"
				+ "　　{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}\r\n"
				+ "　　請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)");

		String[] planet = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };

		int count = 0;

//		for (int i = 0; i < planet.length; i++) {
//			for (int j = 0; j < planet[i].length(); j++) {
//
//				char vowel = planet[i].charAt(j);
//
//				if (vowel == 'a' || vowel == 'e' || vowel == 'i' || vowel == 'o' || vowel == 'u') {
//					count++;
//				}
//			}
//		}
		
		for (String p : planet) {
		    for (int i = 0; i < p.length(); i++) {
		        switch (p.charAt(i)) {
		            case 'a':
		            case 'e':
		            case 'i':
		            case 'o':
		            case 'u':
		                count++;
		                break;
		        }
		    }
		}
		System.out.println("   母音共有：" + count + "個");
	}
}
