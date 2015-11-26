package abstractfactory.design.pattern;

public class AnimalFactoryProducer {
	
	private static final String MAMMAL="Mammal";
	private static final String BIRD="Bird";
	
	public static AnimalFactory getFactory(String choice) {
		AnimalFactory animalFactory=null;
		if(choice.equalsIgnoreCase(MAMMAL)){
			animalFactory=new MammalFactory();
		}else if(choice.equalsIgnoreCase(BIRD)){
			animalFactory=new BirdFactory();
		}
		return animalFactory;
	}
}
