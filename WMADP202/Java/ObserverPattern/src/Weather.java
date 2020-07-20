import java.util.Observable;

public class Weather extends Observable {

	private int temperature;
	private boolean isRainy;

	public Weather(int temparature, boolean isRainy) {
		this.temperature = temparature;
		this.isRainy = isRainy;
	}

	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
		this.setChanged();
		this.notifyObservers();
	}

	public boolean isRainy() {
		return isRainy;
	}

	public void setRainy(boolean isRainy) {
		this.isRainy = isRainy;
		this.setChanged();
		this.notifyObservers();
	}
	
	
}
