public class Main {
    public static void main(String[] args) {
        System.out.println("=== Food Ordering System ===\n");

        System.out.println("Creating orders and adding items...");

        Order order1 = new Order("Alice Johnson");
        Order order2 = new Order("Bob Smith");
        Order order3 = new Order("Charlie Brown");

        try {
            order1.addItem("Pizza", 12.99);
            order1.addItem("Pasta", 8.50);
            order1.addItem("", 5.00);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        order2.addMultipleItems(new String[]{"Burger", "Fries"}, 8.50, 3.25);
        try {
            order2.addItem("Soda", -2.00);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        order3.addMultipleItems(new String[]{"Salad", "Juice"}, 4.50, 11.00);

        System.out.println("\nOrder Results:");
        System.out.println(order1);
        System.out.println(order2);
        System.out.println(order3);

        System.out.println("\nTotal orders created: " + Order.getTotalOrders());

        Order largest = order1;
        if (order2.getTotalAmount() > largest.getTotalAmount()) largest = order2;
        if (order3.getTotalAmount() > largest.getTotalAmount()) largest = order3;

        System.out.println("Largest order: " + largest.getCustomerName() +
                           " ($" + String.format("%.2f", largest.getTotalAmount()) + ")");
    }
}
