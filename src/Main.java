public class Main {
    public static void main(String[] args) {
        LibraryManager manager = new LibraryManager();

        System.out.println("Library Management System");
        manager.showBooks();

        manager.addBook();  
        manager.addBook();  
        manager.addBook();  

        manager.removeBook();
        manager.removeBook();
        manager.removeBook(); 

        System.out.println("\nProgram completed successfully.");
    }
}
