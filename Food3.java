/* Alessia Brinzarea
 * 10/23/24
 * Period 5
 * Food3.java
 * This program works with FoodTester and is the superclass of Pizza.
 * Working on: Using String.format and protected field variables.
 */

public class Food3
{
    // declares protected str field var for other subclasses to also access
    protected String str;
    
    // initializes str field var
    public Food3()
    {
        str = new String("");
    }
    
    // initializes str field var using String.format
    public Food3 (String prepMethod, String ingredient, String name, int costPerPiece, int pieceNum)
    {
        final int num = 100; // used for calculating total cost
        double totalCost = 0.0;
        totalCost = costPerPiece*pieceNum/num;
        
        str = String.format("At the sale: %s %s with %s will be sold " + "for %d cents each. With %d %s(s), $%.2f can be made.", name, prepMethod, ingredient, costPerPiece, pieceNum, name, totalCost);
    }
    
    // prints str field var
    public void printForSale()
    {
        System.out.println(str);
    }
}
