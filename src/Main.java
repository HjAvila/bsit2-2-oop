public class Main {
    public static void main(String[] args) {
        System.out.println("═══ EMPLOYEE MANAGEMENT SYSTEM ═══");

        System.out.println();
        Manager manager = new Manager("Alice Smith", 2001, 80000, "Engineering", 15000, 8);
        Developer developer = new Developer("Bob Johnson", 2002, 70000, "Engineering", "Java", 5);
        Intern intern = new Intern("Charlie Brown", 2003, 30000, "Engineering", "Tech University", true);

        System.out.println();

        manager.displayDetails();
        manager.work();
        manager.manageTeam();
        System.out.println("Monthly Salary: $" + manager.calculateSalary());

        System.out.println();

        developer.displayDetails();
        developer.work();
        developer.code();
        System.out.println("Monthly Salary: $" + developer.calculateSalary());

        System.out.println();

        intern.displayDetails();
        intern.work();
        intern.assist();
        System.out.println("Monthly Salary: $" + intern.calculateSalary());
    }
}
