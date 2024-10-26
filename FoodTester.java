/* Alessia Brinzarea
 * 10/23/24
 * Period 5
 * FoodTester.java
 * This program works with Food, Pizza, and DeepDishPizza.
 * Working on: Instantiating and overloading constructors.
 */

import java.util.Scanner;
public class FoodTester
{
	// default constructor
	public FoodTester()
	{
		
	}
	
	/* instantiates & overloads Food3 constructor with parameters used to initialize str field var
	* instantiates & overloads Pizza3 constructor with parameters used to call Food3 constructor and initialize str field var
	*/
	public static void main(String[] args)
	{
		System.out.println("\n\n\n"); // formatting
		Food food1 = new Food ("baked", "banana", "muffins"); // instantiates overloaded Food3 constructor in Food3 class and gets str
		food1.printForSale(); // prints str
		Food food2 = new Food ("fried", "yam", "fritters"); 
		food2.printForSale(); 
		Pizza pizza = new Pizza ("pepperoni"); 
		pizza.printForSale();
		DeepDishPizza ddp = new DeepDishPizza("anchovies"); 
		ddp.printForSale();
		System.out.println("\n\n\n");
	}
}
