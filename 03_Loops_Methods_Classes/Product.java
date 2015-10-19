public class Product implements Comparable<Product> {
	private String name;
	private double price;

	public Product(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int compareTo(Product compareProduct) {

		if (this.getPrice() > compareProduct.getPrice()) {
			return 1;
		} else if (this.getPrice() == compareProduct.getPrice()) {
			return 0;
		} else {
			return -1;
		}
	}

}
