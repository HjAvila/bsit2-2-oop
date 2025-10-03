public class Faculty extends User {
    private String department;
    private String position;

    public Faculty(String userId, String name, String email, String department, String position) {
        super(userId, name, email);
        this.department = department;
        this.position = position;
    }

    public String getDepartment() { return department; }
    public String getPosition() { return position; }

    @Override
    public int getMaxBorrowLimit() { return 10; }

    public void borrowMedia(LibraryItem media) {
        if (media instanceof Borrowable) {
            Borrowable b = (Borrowable) media;
            if (b.isAvailable() && getBorrowedItemsCount() < getMaxBorrowLimit()) {
                b.borrowItem(getName());
                addBorrowedItem(media);
                System.out.println(getName() + " (Faculty) borrowed: " + media.getTitle());
            } else {
                System.out.println("Sorry, " + media.getTitle() + " is not available");
            }
        }
    }

    public void returnMedia(LibraryItem media) {
        if (media instanceof Borrowable) {
            Borrowable b = (Borrowable) media;
            b.returnItem();
            removeBorrowedItem(media);
        }
    }
}
