package iteration;

import java.util.ArrayList;
import java.util.Iterator;

public class Book implements Iterable<Page> {

	private ArrayList<Page> pages;
	
	public Book(ArrayList<Page> pages) {
		this.pages = pages;
	}
	

	public ArrayList<Page> getPages() {
		return pages;
	}


	public void setPages(ArrayList<Page> pages) {
		this.pages = pages;
	}


	@Override
	public Iterator<Page> iterator() {
		return new BookIterator(this);
	}
	
}
