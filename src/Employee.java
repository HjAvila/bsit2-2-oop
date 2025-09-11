public class Employee {
    String name;
    int id;
    double baseSalary;
    String department;

    Employee(String name, int id, double baseSalary, String department) {
        this.name = name;
        this.id = id;
        this.baseSalary = baseSalary;
        this.department = department;
        System.out.println("Employee " + name + " has been hired in " + department + " department");
    }

    void work() {
        System.out.println(name + " is working on general tasks");
    }

    double calculateSalary() {
        return baseSalary;
    }

    void displayDetails() {
        System.out.println("\n--- Employee Details ---");
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Base Salary: $" + baseSalary);
        System.out.println("Department: " + department);
    }
}
