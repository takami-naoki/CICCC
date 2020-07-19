
public class Product {

	private String description;
	private double price;
	
	public Product(String description, double price) {
		this.setDescription(description);
		this.setPrice(price);
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
}
