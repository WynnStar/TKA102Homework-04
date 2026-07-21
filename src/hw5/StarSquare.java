package hw5;

public class StarSquare {
	private int width;
	private int height;

	public StarSquare() {
	}

	public StarSquare(int width, int height) throws StarSquareException {
		setSize(width, height);
	}

	public void setSize(int width, int height) throws StarSquareException {
		if (width > 0 && height > 0) {
			this.width = width;
			this.height = height;
		} else
			throw new StarSquareException("\t寬與高請輸入正整數\n");
	}

	public int getWidth() {
		System.out.println("\t輸入的寬是"+width);
		return width;
	}
	
	public int getHeight() {
		System.out.println("\t輸入的高是"+height);
		return height;
	}
	
	public void printStarSquare() {
		System.out.println();
		for (int i = 0; i < height; i++) {
			System.out.print("\t");
			for (int j = 0; j < width; j++) {
				System.out.print("*");
			}
			System.out.println();
		} 
		System.out.println();	
	}
}
