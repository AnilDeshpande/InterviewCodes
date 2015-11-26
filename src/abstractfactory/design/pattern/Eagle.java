package abstractfactory.design.pattern;

public class Eagle implements Bird{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Eagle: Soar in the sky");
	}
	
	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("Eagle: Eaow... Eaow....");
	}
}
