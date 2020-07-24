package protocol;

import java.util.concurrent.TimeUnit;

public class Bakery {

	private BakeryInterface client;
	
	public Bakery(BakeryInterface client) {
		this.client = client;
	}
	
	public void prepareCake() {
		String type = client.getType();
		String size = client.getSize();
		String text = client.getText();
		
		System.out.println("Cake is preparing");
		
		String message = type + "" + size + "" + text;
		int price = 100;
		
		try {
			TimeUnit.SECONDS.sleep(5);;
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		client.cakeIsReady(message, price);
	}
}
