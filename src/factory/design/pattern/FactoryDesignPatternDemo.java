package factory.design.pattern;

public class FactoryDesignPatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeFactory factory=new ShapeFactory();
		Shape shape1=factory.getShape("CIRCLE");
		Shape shape2=factory.getShape("SQUARE");
		Shape shape3=factory.getShape("RECTANGLE");
		shape1.draw();
		shape2.draw();
		shape3.draw();
		
	}

}
