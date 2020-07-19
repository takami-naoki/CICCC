package iteration;

import java.util.Iterator;

public class BookIterator implements Iterator<Page> {

	private int index;
	private Book book;
	
	public BookIterator(Book book) {
		this.index = 0;
		this.book = book;
	}

	@Override
	public boolean hasNext() {
		if (this.book.getPages().size() > this.index) {
			return true;
		}
		return false;
	}

	@Override
	public Page next() {
		if (this.hasNext()) {
			Page page = this.book.getPages().get(index);
			this.index++;
			return page;
		}
		return null;
	}
	
}
