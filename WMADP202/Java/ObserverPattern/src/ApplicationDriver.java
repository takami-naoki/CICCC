
public class ApplicationDriver {

	public static void main(String[] args) {
		TVShow tvShow = new TVShow();
		News news = new News("Covid is here");
		RadioStation rs = new RadioStation();
		news.addObserver(rs);
		
		Weather w = new Weather(10, false);
		w.addObserver(tvShow);
		w.addObserver(rs);
		
		w.setTemperature(25);
		news.setDescription("Trump is gone!");
	}

}
