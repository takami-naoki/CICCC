
public class LineItem {

	private Product product;
	private int quantity;
	
	public LineItem(Product product, int quantity) {
		super();
		this.product = product;
		this.quantity = quantity;
	}
	
	public double getTotalPrice() {
		return quantity * product.getPrice();
	}

	public String format() {
		return String.format("%-30s%8.2f%5d%8.2f", product.getDescription(), product.getPrice(), quantity, getTotalPrice());
	}
}
