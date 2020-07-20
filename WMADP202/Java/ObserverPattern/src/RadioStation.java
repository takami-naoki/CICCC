import java.util.Observable;
import java.util.Observer;

public class RadioStation implements Observer{

	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof News) {
			System.out.println("Here is the radio Station. The new news is:"+ ((News)o).getDescription());
		} else if (o instanceof Weather) {
			System.out.println("Here is the radio Station. The temprature is "+((Weather)o).getTemperature());
		}
	}

}
