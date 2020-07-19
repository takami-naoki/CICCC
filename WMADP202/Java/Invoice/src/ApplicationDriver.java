
public class ApplicationDriver {

	public static void main(String[] args) {
		
		Invoice invoice = new Invoice(new Address("Sam's Small Appliances", "100 Main Street", "AnyTown", "CA", "98765"));
		invoice.add(new Product("Toaster", 29.95), 3);
		invoice.add(new Product("Hair dryer", 24.95), 1);
		invoice.add(new Product("Car vacuum", 19.99), 2);
		System.out.println(invoice.format());
	}

}
