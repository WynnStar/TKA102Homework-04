package hw5_Pen;

abstract class Pen {
	private String brand;
	private double price;

	public Pen() {
	}

	public Pen(String brand, double price) {
		this.brand = brand;
		if (price <= 0)
			throw new IllegalArgumentException("價格必須大於0");
		else
			this.price = price;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setPrice(double price) {
		if (price <= 0)
			throw new IllegalArgumentException("價格必須大於0");
		else
			this.price = price;
	}
	
	public String getBrand() {
		return brand;
	}

	public double getPrice() {
		return price;
	}
	
	public abstract void write();
}
