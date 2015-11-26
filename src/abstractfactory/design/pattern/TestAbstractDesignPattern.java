package abstractfactory.design.pattern;

public class TestAbstractDesignPattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnimalFactory mammAnimalFactory=AnimalFactoryProducer.getFactory("Mammal");
		AnimalFactory birdFactory=AnimalFactoryProducer.getFactory("Bird");
		
		mammAnimalFactory.getMammal("Cat").move();
		birdFactory.getBird("eagle").makeSound();
	}
}
