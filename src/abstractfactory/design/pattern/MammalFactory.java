package abstractfactory.design.pattern;

public class MammalFactory extends AnimalFactory{

	private static final String MAMMAL="Mammal";
	private static final String DOG="Dog";
	private static final String CAT="Cat";
	
	
	@Override
	public Bird getBird(String birdTypeType) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Mammal getMammal(String string ) {
		// TODO Auto-generated method stub
		Mammal mammal=null;
		if(string.equalsIgnoreCase(CAT)){
			mammal=new Cat();
		}else if(string.equalsIgnoreCase(DOG)){
			mammal=new Dog();
		}
		
		return mammal;
	}
}
