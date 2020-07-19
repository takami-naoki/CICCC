import java.util.ArrayList;

public class Invoice {
	
	private Address address;
	private ArrayList<LineItem> items;
	
	public Invoice(Address address) {
		this.address = address;
		this.items = new ArrayList<LineItem>();
	}
	
	public void add(Product product, int quantitiy) {
		this.items.add(new LineItem(product, quantitiy)); 
	}
	
	public double total() {
		double price = 0;
		for (LineItem item : items) {
			price += item.getTotalPrice();
		}
		return price;
	}
	
	public String format() {
		
		String s = this.address.format()
				+ String.format("\n\n%-30s%8s%5s%8s\n", "Description", "Price", "Qty", "Total");

		for (LineItem item : items) {
			s += item.format() + "\n";
		}
		
		s += String.format("\nAMOUNT DUE: $%8.2f", total());
		return s;
	}
}
