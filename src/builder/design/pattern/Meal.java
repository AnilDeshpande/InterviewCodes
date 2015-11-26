package builder.design.pattern;

import java.util.ArrayList;
import java.util.List;

public class Meal {

	private List<Item> mealItems;
	
	public Meal() {
		// TODO Auto-generated constructor stub
		mealItems=new ArrayList<Item>();
	}
	
	public void addItemsToMeal(Item item){
		mealItems.add(item);
	}
	
	
	public float getMealCost() {
		float cost=0.0f;
		
		for(Item item: mealItems){
			cost+=item.price();
		}
		
		return cost;
	}
	
	public void showMealOrderContents(){
		for(Item item: mealItems){
			System.out.println("Name: "+item.name());
			System.out.println("Packing: "+item.packing().pack());
			System.out.println("Cost: Rs "+item.price()+" /- only");
		}
		System.out.println("Total: "+getMealCost());
	}
}
