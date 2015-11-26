package abstractfactory.design.pattern;

public abstract class AnimalFactory {
	public abstract Mammal getMammal( String mammal);
	public abstract Bird getBird(String bird);
}
