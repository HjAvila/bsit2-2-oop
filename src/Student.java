public class Student extends User {
    private String studentId;
    private String major;

    public Student(String userId, String name, String email, String studentId, String major) {
        super(userId, name, email);
        this.studentId = studentId;
        this.major = major;
    }

    public String getStudentId() { return studentId; }
    public String getMajor() { return major; }

    @Override
    public int getMaxBorrowLimit() { return 5; }

    public void borrowMedia(LibraryItem media) {
        if (!(media instanceof Borrowable)) return;
        Borrowable b = (Borrowable) media;
        if (b.isAvailable() && getBorrowedItemsCount() < getMaxBorrowLimit()) {
            b.borrowItem(getName());
            addBorrowedItem(media);
            System.out.println(getName() + " (Student) borrowed: " + media.getTitle());
        } else {
            System.out.println("Sorry, " + media.getTitle() + " is not available");
        }
    }

    public void returnMedia(LibraryItem media) {
        if (!(media instanceof Borrowable)) return;
        Borrowable b = (Borrowable) media;
        b.returnItem();
        removeBorrowedItem(media);
    }
}
