/* Alessia Brinzarea
 * 10/23/24
 * Period 5
 * DeepDishPizza.java
 * This program works with FoodTester and is the superclass of Pizza and DeepDishPizza.
 * Working on: protected field variables.
 */

import java.util.Scanner;
public class Food //superclass
{
	// declares protected str field var for other subclasses to also access
	protected String str;
	
	// initializes str field var
	public Food()
	{
		str=new String("");
	}
	
	// initializes str field var
	public Food (String prepMethod, String ingredient, String name)
	{
		str = "At the sale: " + name + " " + prepMethod + " with " + ingredient;
	}
	
	// prints str field var
	public void printForSale()
	{
		System.out.println(str);
	}
}
