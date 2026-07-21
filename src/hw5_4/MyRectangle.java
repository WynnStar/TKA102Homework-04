package hw5_4;

public class MyRectangle {

	private double width;
	private double depth;
	
	public MyRectangle() {
	}
	
	public MyRectangle(double width, double depth) throws MyRectangleException {
		if (width > 0 && depth > 0) {
			this.width = width;
			this.depth = depth;
		}else
			throw new MyRectangleException("\t長和寬請輸入正數\n");
	}

	public void setWidth(double width) throws MyRectangleException {
		if(width > 0) {
			this.width = width;
		} else
		throw new MyRectangleException("\t長請輸入正數\n");
	}

	public void setDepth(double depth) throws MyRectangleException {
		if(depth > 0) {
			this.depth = depth;
		} else
		throw new MyRectangleException("\t寬請輸入正數\n");
	}

	public double getArea() {
		return width * depth;
	}
}
