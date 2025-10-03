public class Main {
    public static void main(String[] args) {
        LibraryManager manager = new LibraryManager();

        Book book1 = new Book("B001", "Java Programming", "James Gosling", "ISBN-123", 400, "Programming");
        Magazine mag1 = new Magazine("M001", "Tech Today", "Editor Smith", 10, "September", false);
        DVD dvd1 = new DVD("D001", "The Matrix", "Wachowski Sisters", 136, "R", "Sci-Fi");

        manager.addItem(book1);
        manager.addItem(mag1);
        manager.addItem(dvd1);

        System.out.println();
        manager.displayAllItems();

        System.out.println("\n=== Testing Borrowing ===");
        Student student = new Student("U001", "John", "john@example.com", "S100", "CS");
        Faculty faculty = new Faculty("U002", "Dr. Smith", "smith@example.com", "Engineering", "Professor");

        student.borrowMedia(book1);
        faculty.borrowMedia(dvd1);
        student.borrowMedia(book1);

        System.out.println("\n=== Displaying Available Items ===");
        manager.displayAvailableItems();

        System.out.println("\n=== Testing Late Fees ===");
        int bookDaysLate = 5;
        int dvdDaysLate = 3;
        System.out.printf("%s - %d days late: $%.2f%n", book1.getTitle(), bookDaysLate, book1.calculateLateFee(bookDaysLate));
        System.out.printf("%s - %d days late: $%.2f%n", dvd1.getTitle(), dvdDaysLate, dvd1.calculateLateFee(dvdDaysLate));

        System.out.println("\n=== Returning Test ===");
        student.returnMedia(book1);
        manager.displayAvailableItems();
    }
}
