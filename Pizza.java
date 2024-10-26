/* Alessia Brinzarea
 * 10/23/24
 * Period 5
 * Pizza.java
 * This program is the subclass of Food.
 * Working on: Using super(), deriving and extending superclass, and overloading constructors.
 */

import java.util.Scanner;
public class Pizza extends Food 
{
	// default constructor
	public Pizza()
	{
		
	}
	
	// overloads Food3 constructor to print
	public Pizza(String ingredientln)
	{
		super("baked",ingredientln,"pizza");
			
	}
	public Pizza(String ingredientln, String nameln)
	{
		super("baked", ingredientln, nameln);	
	}
}
