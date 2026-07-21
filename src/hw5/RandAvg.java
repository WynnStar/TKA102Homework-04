package hw5;

public class RandAvg {
	private int amount;
	private int min;
	private int max;
	private int randomNumber() {
	    return (int)(Math.random() * (max - min + 1)) + min;
	}

	public RandAvg() {
	}

	public RandAvg(int amount, int min, int max) throws RandAvgException {
		setRandAvg(amount, min, max);
	}

	public void setRandAvg(int amount, int min, int max) throws RandAvgException {

		if (max < min) {
			throw new RandAvgException("\t最大值請不要小於最小值喔！\n");
		}

		if (amount <= 0) {
			throw new RandAvgException("\t隨機數數量必須大於0！\n");
		}

		if (amount > max - min + 1) {
			throw new RandAvgException("\t要求的數量超過可產生的不重複數字！\n");
		}

		this.amount = amount;
		this.max = max;
		this.min = min;
	}

	public void randAvg() {

		int[] randomNum = new int[amount];
		int idx = 0;

		while (idx < amount) {
			int num = randomNumber();
			boolean repeat = false;

			for (int i = 0; i < idx; i++) {
				if (randomNum[i] == num) {
					repeat = true;
					break;
				}

			}

			if (!repeat) {
				randomNum[idx] = num;
				idx++;
			}
		}

		long sum = 0;
		System.out.println("  本次亂數的結果：");
		for (long num : randomNum) {
			System.out.print(num + " ");
			sum += num;
		}
		System.out.println();

		double avg = (double) sum / amount;

		System.out.println("  亂數加總的平均值是：" + avg + "\n");

	}
}