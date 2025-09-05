import java.util.ArrayList;

public class Order {
    private String customerName;
    private ArrayList<String> items;
    private ArrayList<Double> prices;
    private static int totalOrders = 0;

    public Order(String customerName) {
        this.customerName = customerName;
        this.items = new ArrayList<>();
        this.prices = new ArrayList<>();
        totalOrders++;
    }

    public void addItem(String item, double price) throws IllegalArgumentException {
        if (item == null || item.trim().isEmpty()) {
            throw new IllegalArgumentException("Invalid item: cannot be empty");
        }
        if (price <= 0) {
            throw new IllegalArgumentException("Invalid price: must be greater than 0");
        }
        items.add(item);
        prices.add(price);
        System.out.println("Item '" + item + "' added successfully");
    }

    public double getTotalAmount() {
        if (prices.isEmpty()) return 0.0;
        double total = 0;
        for (double price : prices) {
            total += price;
        }
        return total;
    }

    public String getOrderSize() {
        int count = items.size();
        if (count == 0) return "Empty order";
        if (count <= 3) return "Small";
        if (count <= 6) return "Medium";
        return "Large";
    }

    public void addMultipleItems(String[] items, double... prices) {
        try {
            if (items.length != prices.length) {
                throw new IllegalArgumentException("Items and prices count mismatch");
            }
            System.out.print("Items added: ");
            for (int i = 0; i < items.length; i++) {
                addItem(items[i], prices[i]);
                if (i < items.length - 1) System.out.print(items[i] + ", ");
            }
            System.out.println();
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static int getTotalOrders() {
        return totalOrders;
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getItemCount() {
        return items.size();
    }

    @Override
    public String toString() {
        return "Order for " + customerName + ": " + getItemCount() + " items, Total: $" +
               String.format("%.2f", getTotalAmount()) + ", Size: " + getOrderSize();
    }
}
