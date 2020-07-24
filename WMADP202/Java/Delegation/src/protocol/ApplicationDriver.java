package protocol;

public class ApplicationDriver {

	public static void main(String[] args) {
		Customer c = new Customer();
		Bakery b = new Bakery(c);
		b.prepareCake();
	}

}
