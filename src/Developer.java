public class Developer extends Employee {
    String programmingLanguage;
    int projectsCompleted;

    Developer(String name, int id, double baseSalary, String department, String programmingLanguage, int projectsCompleted) {
        super(name, id, baseSalary, department);
        this.programmingLanguage = programmingLanguage;
        this.projectsCompleted = projectsCompleted;
        System.out.println(name + " joined as a " + programmingLanguage + " Developer");
    }

    void code() {
        System.out.println(name + " is coding in " + programmingLanguage);
    }

    double calculateSalary() {
        return baseSalary + (projectsCompleted * 1000);
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
        System.out.println("Projects Completed: " + projectsCompleted);
    }
}
