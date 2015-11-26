package abstractfactory.design.pattern;

public class Cat implements Mammal{

	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("Cat: Meow");
	}
	
	public void move() {
		System.out.println("Cat: Move Stealthily");
	};
}
