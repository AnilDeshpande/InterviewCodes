package abstractfactory.design.pattern;

public class Sparrow implements Bird{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Sparrow: Flu near home");
	}
	
	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("Sparrow: Chew chew");
	}
}
