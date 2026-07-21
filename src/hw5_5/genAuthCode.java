package hw5_5;

public class genAuthCode {
	public static void main(String[] args) {
		int[] authCode = new int[8];
		for (int i = 0; i < authCode.length; i++) {

			while (true) {
				int code = (int) (Math.random() * 75) + 48;

				if ((code >= 48 && code <= 57) ||
					(code >= 65 && code <= 90) ||
					(code >= 97 && code <= 122)) {

					authCode[i] = code;
					break;
				}
			}
		}

		System.out.println("本次隨機產生驗證碼為");
		for (int code : authCode) {
			System.out.print((char)code);
		}
	}

}
