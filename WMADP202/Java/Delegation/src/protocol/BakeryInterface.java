package protocol;

public interface BakeryInterface {

	public String getType();
	public String getSize();
	public String getText();
	public void cakeIsReady(String message, int price);
}
