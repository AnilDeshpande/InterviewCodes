package observer.design.pattern.library;

public class Borrower extends BookNotifyer{

	private String name;
	
	
	public Borrower(String name, Library library){
		this.name=name;
		this.library=library;
		this.library.registerBorrower(this);
	}
	
	@Override
	public void updateBookArrived(String bookName) {
		// TODO Auto-generated method stub
		System.out.println("Hi "+this.name+",  "+bookName+" is available in library");
	}
	
}
