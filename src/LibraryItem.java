public abstract class LibraryItem {
    protected String itemId;
    protected String title;
    protected String author;
    protected boolean isCheckedOut;
    protected String borrowerName;

    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
        this.isCheckedOut = false;
        this.borrowerName = null;
    }

    public String getItemInfo() {
        return String.format("%s - %s (ID: %s)", title, getItemType(), itemId);
    }

    public String getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public void checkOut(String borrowerName) {
        this.isCheckedOut = true;
        this.borrowerName = borrowerName;
        System.out.println(title + " has been borrowed");
    }

    public void checkIn() {
        this.isCheckedOut = false;
        this.borrowerName = null;
        System.out.println(title + " has been returned");
    }

    public abstract String getItemType();
    public abstract double calculateLateFee(int daysLate);
    public abstract void displayInfo();
}
