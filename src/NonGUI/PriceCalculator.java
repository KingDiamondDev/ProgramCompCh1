package NonGUI;
import java.util.Scanner;

public class PriceCalculator {
    public static void main(String[] args)
        {
            var hotdog="2.50";
            var brat="3.50";
            var hamburger="5.00";
            var fries="2.00";
            var soda="2.00";
            final double TAX_RATE=0.06625;
            double price;
            double quantity;
            double tax;
            double total;
            String item;
            Scanner keyboard = new Scanner(System.in);
            System.out.print("Item Description:   ");
            item = keyboard.nextLine();
            System.out.print("Item Price: $");
            price = keyboard.nextDouble();
            System.out.print("Quantity: ");
            quantity = keyboard.nextDouble();
            price = price * quantity;
            tax = price * TAX_RATE;
            total = price + tax;
            System.out.println("Item Purchased: " + item);
            System.out.println("Price:   $" + price);
            System.out.println("Tax:    $" + tax);
            System.out.println("Total:    $" + total);
        }
    }
