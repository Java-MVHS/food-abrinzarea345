/* Alessia Brinzarea
 * 10/23/24
 * Period 5
 * Pizza3.java
 * This program is the subclass of Food.
 * Working on: Using super(), deriving and extending superclass, and overloading constructors.
 */

public class Pizza3 extends Food3
{
    // default constructor
    public Pizza3()
    {
    }
    
    // overloads Food3 constructor to print
    public Pizza3(String ingredientln, int priceln, int piecesln)
    {
        super("baked", ingredientln, "pizza", princeln, piecesln);
    }
}
