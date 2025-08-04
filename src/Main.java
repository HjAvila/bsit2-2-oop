public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("The Alchemist", "Paulo Coelho", 208);
        Book book2 = new Book("1984", "George Orwell", 328);
        Book book3 = new Book("To Kill a Mockingbird", "Harper Lee", 281);

        book1.displayInfo();
        book2.displayInfo();
        book3.displayInfo();

        book1.borrowBook();
        book1.displayInfo();

        book1.returnBook();
        book1.displayInfo();
    }
}
