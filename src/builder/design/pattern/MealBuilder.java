package builder.design.pattern;

import java.util.List;

public class MealBuilder {

	public Meal prePareVegMeal() {
		Meal meal=new Meal();
		meal.addItemsToMeal(new VegBurger());
		return meal;
	}
	
	public Meal prePareVegMeal(Item drink) {
		Meal meal=new Meal();
		meal.addItemsToMeal(new VegBurger());
		meal.addItemsToMeal(drink);
		return meal;
	}
	
	public Meal prePareNonVegMeal() {
		Meal meal=new Meal();
		meal.addItemsToMeal(new ChickenBurger());
		return meal;
	}
	
	public Meal prePareNonVegMeal(Item drink) {
		Meal meal=new Meal();
		meal.addItemsToMeal(new ChickenBurger());
		meal.addItemsToMeal(drink);
		return meal;
	}
	
	public Meal prePareMeal(Item[] items){
		Meal meal=new Meal();
		for(Item item: items){
			meal.addItemsToMeal(item);
		}
		return meal;
	}
}
