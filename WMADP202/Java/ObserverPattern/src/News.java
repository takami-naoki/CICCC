import java.util.Observable;

public class News extends Observable {
	
	private String description;
	
	public News(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.setChanged();
		this.notifyObservers();
		this.description = description;
	}
	

}
