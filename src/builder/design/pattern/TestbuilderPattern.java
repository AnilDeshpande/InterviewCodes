package builder.design.pattern;

import java.util.ArrayList;

public class TestbuilderPattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MealBuilder builder=new MealBuilder();
		
		Meal meal=builder.prePareMeal(new Item[]{new VegBurger(), new ChickenBurger(), new Pepsi(), new Coke()});
		meal.showMealOrderContents();
		
	}

}
