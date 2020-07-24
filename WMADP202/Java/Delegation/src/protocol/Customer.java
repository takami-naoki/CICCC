package protocol;

public class Customer implements BakeryInterface {

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public String getSize() {
		return "S";
	}

	@Override
	public String getText() {
		return "";
	}

	@Override
	public void cakeIsReady(String message, int price) {
		System.out.printf("Hey the cake is ready for %d dollar\n", price);
	}

}
