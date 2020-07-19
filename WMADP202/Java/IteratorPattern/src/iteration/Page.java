package iteration;

public class Page {
	
	private int number;
	
	public Page(int number) {
		this.number = number;
	}
	
	@Override
	public String toString() {
		return "The page number is " + this.number;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
}
