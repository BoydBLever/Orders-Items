import java.util.ArrayList;

public class TestOrders {
    public static void main(String[] args) {

        // Menu items
        // Q: What is the purpose of the first line?
        // A: Instantiates an object instance.
        Item item1 = new Item();
        // Type is Item class that we made (remember Item.java)
        // new is a keyword. It is required to instantiate an object instance.
        item1.name = "mocha";
        // Assigning the particular item's name
        item1.price = 5.00;
        // Assigning the particular item's price

        Item item2 = new Item();
        item2.name = "latte";
        item2.price = 5.00;

        Item item3 = new Item();
        item3.name = "drip coffee";
        item3.price = 5.00;

        Item item4 = new Item();
        item4.name = "capuccino";
        item4.price = 5.00;

        // Orders
        // Instantiate an object instance.
        Order order1 = new Order();
        // Assign a name to the particular order
        order1.name = "Cindhuri";

        Order order2 = new Order();
        order2.name = "Jimmy";

        Order order3 = new Order();
        order3.name = "Noah";

        Order order4 = new Order();
        order4.name = "Sam";

        // Application Simulations
        // Add the item1 to order2's item list and increment the order's total
        order2.items.add(item1);
        order2.total += item1.price;

        // order3 ordered a cappuccino. Add the cappuccino to their order & their tab.
        order3.items.add(item4);
        order3.total += item4.price;

        // order4 ordered a latte. Update accordingly.
        order4.items.add(item2);
        order4.total += item2.price;

        // Cindhuri's order is now ready. Update her status.
        order1.ready = true;
        order2.ready = true;

        // Sam ordered more drinks - 2 lattes. Update their order as well.
        order4.items.add(item2);
        order4.items.add(item2);
        order4.total += item2.price * 2;
        // Use this example code to test various orders' updates
        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: %s\n", order1.total);
        System.out.printf("Ready: %s\n", order1.ready);

        System.out.printf("Name: %s\n", order2.name);
        System.out.printf("Total: %s\n", order2.total);
        System.out.printf("Ready: %s\n", order2.ready);

        System.out.printf("Name: %s\n", order3.name);
        System.out.printf("Total: %s\n", order3.total);
        System.out.printf("Ready: %s\n", order3.ready);

        System.out.printf("Name: %s\n", order4.name);
        System.out.printf("Total: %s\n", order4.total);
        System.out.printf("Ready: %s\n", order4.ready);
    }
}
