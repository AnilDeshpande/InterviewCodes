package abstractfactory.design.pattern;

public class Dog implements Mammal{

	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("Dog: Bow Bow");
	}
	 
	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Dog: Run behind the cars");
	}
}
