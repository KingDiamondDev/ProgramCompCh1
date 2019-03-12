package NonGUI;
import java.util.*;

public class NewCalc {
    public static void main(String[] args) {
        /*
         * Preset values only
         * for this practice*/

        HashMap hm = new HashMap();
        hm.put("Hotdog", new Double(2.50));
        hm.put("Brat", new Double(3.50));
        hm.put("Hamburger", new Double(5.00));
        hm.put("Fries", new Double(2.00));
        hm.put("Soda", new Double(2.00));

        var States = "NJ, NC";
        double price;
        double quantity;
        double tax;
        double total;

        Scanner scanner = new Scanner(System.in); // Start
        System.out.println("Choose an item: Hotdog, Brat, Hamburger, Fries, Soda"); // Message for input

    }
}