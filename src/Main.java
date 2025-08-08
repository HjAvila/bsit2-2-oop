public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Alice", 20, "Computer Science", 95, 89, 92);
        Student s2 = new Student("Bob", 21, "Information Tech", 78, 85, 80);
        Student s3 = new Student("Charlie", 19, "Engineering", 65, 60, 70);

        Student[] students = {s1, s2, s3};
        int passingCount = 0;

        for (Student s : students) {
            s.displayInfo();
            double avg = s.calculateAverage();
            System.out.printf("Average Grade: %.2f\n", avg);
            System.out.println("Letter Grade: " + s.getLetterGrade());
            System.out.println("Status: " + (s.isPassing() ? "PASSING" : "FAILING"));
            System.out.println("--------------------------");

            if (s.isPassing()) {
                passingCount++;
            }
        }

        System.out.println("Total number of students PASSING: " + passingCount);
    }
}