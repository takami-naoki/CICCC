import java.util.Observable;
import java.util.Observer;

public class TVShow implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("New temparature is : " + ((Weather)o).getTemperature());
	}

}
