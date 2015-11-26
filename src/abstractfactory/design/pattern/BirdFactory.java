package abstractfactory.design.pattern;

public class BirdFactory extends AnimalFactory{
	
	private static final String SPARROW="Sparrow";
	private static final String EAGLE="Eagle";
	
	@Override
	public Bird getBird(String string) {
		// TODO Auto-generated method stub
		Bird bird=null;
		
		if(string.equalsIgnoreCase(SPARROW)){
			bird=new Sparrow();
		}else if(string.equalsIgnoreCase(EAGLE)){
			bird=new Eagle();
		}
		
		return bird;
	}
	
	@Override
	public Mammal getMammal(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}
