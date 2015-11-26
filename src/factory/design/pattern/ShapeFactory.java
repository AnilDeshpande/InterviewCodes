package factory.design.pattern;

public class ShapeFactory {

	public Shape getShape(String shapeType){
		
		if(shapeType.equalsIgnoreCase("CIRCLE")){
			return new Circle();
		}else if(shapeType.equalsIgnoreCase("SQUARE")){
			return new Squar();
		}else if(shapeType.equalsIgnoreCase("RECTANGLE")){
			return new Rectangle();
		}
		return null;
	}
}
