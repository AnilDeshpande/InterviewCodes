package observer.design.pattern.library;

import java.util.ArrayList;
import java.util.List;

import observer.design.pattern.Observer;

public class Library {

	List<String> books=new ArrayList<>();
	List<BookNotifyer> borrowers=new ArrayList<BookNotifyer>();
	
	public List<String> getBooks() {
		return books;
	}
	
	public void setBooks(List<String> books) {
		this.books = books;
	}
	
	public void addBook(String book){
		if(books!=null){
			books.add(book);
			//nottify All
			if(borrowers!=null){
				for(BookNotifyer borrower:borrowers){
					borrower.updateBookArrived(book);
				}
			}
		}
	}
	
	public void registerBorrower(BookNotifyer borrower){
		borrowers.add(borrower);
	}
}
