package NonGUI;
import java.util.Scanner;

public class NewCalc {
    public static void main(String[] args)
    {
        var Items = "Hotdog, Brat, Hamburger, Fries, Soda";
        var Prices = "2.50, 3.50, 5.00, 2.00, 2.00";
        var States = "NJ, NC";
        double price;
        double quantity;
        double tax;
        double total;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Hotdog, Brat, Hamburger, Fries, Soda");
        System.out.print("What would you like? ");
        Items = keyboard.nextLine();
        if ( Items == "Hotdog, Brat, Hamburger, Fries, Soda") {
            System.out.println("How many?");
            quantity = keyboard.nextDouble();
            if (quantity > 0) {
                System.out.println("That is too less. Please enter a number larger than 0");
            }else {
                System.out.println("Successfully added to cart!");
            }
            System.out.println("What state do you live in?");
            States = keyboard.nextLine();
            if (States == "NJ, NC") {
                System.out.println("Successfully applied tax.");
            }else {
                System.out.println("Invalid State. Quitting...");
            }
        }else {
            System.out.println("That is not a valid option. Quitting...");
        }
    }
}
