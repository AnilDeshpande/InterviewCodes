package observer.design.pattern.library;

public abstract class BookNotifyer {
	protected Library library;
	public abstract void updateBookArrived(String bookName);
}
