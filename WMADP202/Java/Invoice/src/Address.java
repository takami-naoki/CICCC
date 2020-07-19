
public class Address {

	private String name;
	private String street;
	private String city;
	private String state;
	private String zip;
	
	public Address(String name, String street, String city, String state, String zip) {
		super();
		this.name = name;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
	};
	
	public String format() {
		return this.name + "\n" + street + "\n"
			 + city + ", " + state + " " + zip;
	}
	
}
