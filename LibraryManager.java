import java.util.ArrayList;

public class LibraryManager {
    private ArrayList<Borrowable> items;

    public LibraryManager() {
        items = new ArrayList<>();
    }

    public void addItem(Borrowable item) {
        items.add(item);
        if (item instanceof LibraryItem) {
            LibraryItem li = (LibraryItem) item;
            System.out.println("Added: " + li.getItemInfo());
        }
    }

    public void displayAllItems() {
        System.out.println("=== Displaying All Items ===");
        for (Borrowable b : items) {
            if (b instanceof LibraryItem) {
                LibraryItem li = (LibraryItem) b;
                System.out.println(li.getItemType() + ": " + li.getTitle() + " (" + b.getBorrowingStatus() + ")");
            }
        }
    }

    public LibraryItem findItemById(String itemId) {
        for (Borrowable b : items) {
            if (b instanceof LibraryItem) {
                LibraryItem li = (LibraryItem) b;
                if (li.getItemId().equals(itemId)) return li;
            }
        }
        return null;
    }

    public void borrowItem(String itemId, String borrowerName) {
        LibraryItem li = findItemById(itemId);
        if (li == null) {
            System.out.println("Item not found: " + itemId);
            return;
        }
        if (li instanceof Borrowable) {
            Borrowable b = (Borrowable) li;
            if (b.isAvailable()) {
                b.borrowItem(borrowerName);
                System.out.println(borrowerName + " borrowed: " + li.getTitle());
            } else {
                System.out.println("Sorry, " + li.getTitle() + " is not available");
            }
        }
    }

    public void returnItem(String itemId) {
        LibraryItem li = findItemById(itemId);
        if (li == null) {
            System.out.println("Item not found: " + itemId);
            return;
        }
        if (li instanceof Borrowable) {
            Borrowable b = (Borrowable) li;
            b.returnItem();
        }
    }

    public void displayAvailableItems() {
        System.out.println("=== Displaying Available Items ===");
        for (Borrowable b : items) {
            if (b instanceof LibraryItem) {
                LibraryItem li = (LibraryItem) b;
                if (b.isAvailable()) {
                    System.out.println(li.getItemType() + ": " + li.getTitle() + " (" + b.getBorrowingStatus() + ")");
                }
            }
        }
    }

    public double calculateTotalLateFees(int daysLate) {
        double total = 0;
        for (Borrowable b : items) {
            if (b instanceof LibraryItem) {
                LibraryItem li = (LibraryItem) b;
                total += li.calculateLateFee(daysLate);
            }
        }
        return total;
    }
}
