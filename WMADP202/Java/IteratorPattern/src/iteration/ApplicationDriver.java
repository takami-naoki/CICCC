package iteration;

import java.util.ArrayList;

public class ApplicationDriver {

	
	public static void main(String[] args) {
		Page p1 = new Page(1);
		Page p2 = new Page(2);
		Page p3 = new Page(3);
		Page p4 = new Page(4);
		Page p5 = new Page(5);
		ArrayList<Page> pages = new ArrayList<Page>();
		pages.add(p1);
		pages.add(p2);
		pages.add(p3);
		pages.add(p4);
		pages.add(p5);
		
		Book book = new Book(pages);
		
		for (Page p : book) {
			System.out.println(p);
		}
	}
}
