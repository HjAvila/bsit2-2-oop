public class Manager extends Employee {
    double bonus;
    int teamSize;

    Manager(String name, int id, double baseSalary, String department, double bonus, int teamSize) {
        super(name, id, baseSalary, department);
        this.bonus = bonus;
        this.teamSize = teamSize;
        System.out.println(name + " has been promoted to Manager");
    }

    void manageTeam() {
        System.out.println(name + " is managing a team of " + teamSize + " employees");
    }

    double calculateSalary() {
        return baseSalary + bonus;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Bonus: $" + bonus);
        System.out.println("Team Size: " + teamSize + " employees");
    }
}
