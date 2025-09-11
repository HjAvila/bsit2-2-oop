public class Intern extends Employee {
    String university;
    boolean fullTime;

    Intern(String name, int id, double baseSalary, String department, String university, boolean fullTime) {
        super(name, id, baseSalary, department);
        this.university = university;
        this.fullTime = fullTime;
        System.out.println("Intern " + name + " from " + university + " has started");
    }

    void assist() {
        System.out.println(name + " is learning and assisting with tasks");
    }

    double calculateSalary() {
        return baseSalary / 2;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("University: " + university);
        System.out.println("Full-time: " + fullTime);
    }
}
