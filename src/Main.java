public class Main {
    public static void main(String[] args) {
        LibraryManager manager = new LibraryManager();

        Book book1 = new Book("B001", "Java Programming", "James Gosling", "ISBN-001", 450, "Programming");
        Book book2 = new Book("B002", "Design Patterns", "Erich Gamma", "ISBN-002", 395, "Software");
        Magazine mag1 = new Magazine("M001", "Tech Today", "Editor Smith", 10, "September", false);
        Magazine mag2 = new Magazine("M002", "Coding Monthly", "Editor Jane", 22, "October", true);
        DVD dvd1 = new DVD("D001", "The Matrix", "Wachowski Sisters", 136, "R", "Sci-Fi");
        DVD dvd2 = new DVD("D002", "Inception", "Christopher Nolan", 148, "PG-13", "Sci-Fi");

        manager.addItem(book1);
        manager.addItem(book2);
        manager.addItem(mag1);
        manager.addItem(mag2);
        manager.addItem(dvd1);
        manager.addItem(dvd2);

        System.out.println();
        manager.displayAllItems();

        System.out.println("\n=== Creating Users ===");
        Student student = new Student("U001", "Alice Johnson", "alice@example.com", "S100", "CS");
        Faculty faculty = new Faculty("U002", "Dr. Smith", "smith@example.com", "Engineering", "Professor");

        System.out.println("\n=== Borrowing Operations ===");
        manager.borrowItem("B001", student);
        manager.borrowItem("D001", faculty);
        manager.borrowItem("B001", student);

        System.out.println("\n=== Available Items After Borrowing ===");
        manager.displayAvailableItems();

        System.out.println("\n=== Late Fees Example ===");
        System.out.printf("%s - %d days late: $%.2f%n", book1.getTitle(), 5, book1.calculateLateFee(5));
        System.out.printf("%s - %d days late: $%.2f%n", dvd1.getTitle(), 3, dvd1.calculateLateFee(3));

        System.out.println("\n=== Returning Operations ===");
        student.returnMedia(book1);
        manager.displayAvailableItems();

        System.out.println("\n=== User Borrowed Items ===");
        student.displayBorrowedItems();
        faculty.displayBorrowedItems();

        System.out.println("\n=== Total late fees across all items (2 days) ===");
        System.out.printf("Total: $%.2f%n", manager.calculateTotalLateFees(2));
    }
}
