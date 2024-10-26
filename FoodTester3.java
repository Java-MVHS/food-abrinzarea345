/* Alessia Brinzarea
 * 10/23/24
 * Period 5
 * FoodTester3.java
 * This program works with Food and Pizza.
 * Working on: Instantiating and overloading constructors.
 */

public class FoodTester3
{
    // default constructor
    public FoodTester3()
    {
    }
    
    /* instantiates & overloads Food3 constructor with parameters used to initialize str field var
     * instantiates & overloads Pizza3 constructor with parameters used to call Food3 constructor and initialize str field var
     */
    public static void main(String[] args)
    {
        System.out.println("\n\n\n"); // formatting
        Food3 food1 = new Food3 ("baked", "banana", "muffins", 50, 12); // instantiates overloaded Food3 constructor in Food3 class and gets str
        food1.printForSale(); // prints str
        Food3 food2 = new Food3 ("fried", "yam", "fritters", 100, 3);
        food2.printForSale();
        Pizza3 pizza3 = new Pizza3 ("pepperoni", 250, 8);
        pizza3.printForSale();
        System.out.println("\n\n\n");
    }
}
