import java.util.Scanner;

public class Main  {
    public static void main(String[] args ) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("INPUT STUDENT INFORMATION");

        System.out.print("Student Id: ");
        String id = scanner.nextLine();

        System.out.print("First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Last Name: ");
        String lastName = scanner.nextLine();

        System.out.print("Course: ");
        String course = scanner.nextLine();

        System.out.print("Section: ");
        String section = scanner.nextLine();

        System.out.println();
        System.out.println("STUDENT INFORMATION");
        System.out.println("Student Id: " + id);
        System.out.println("Student Name: " + firstName + " " + lastName);
        System.out.println("Course: " + course);
        System.out.println("Section: " + section);
        System.out.println();

        System.out.println("INPUT STUDENT SCORE");

        System.out.print("Midterm Exam Score: ");
        int midTerm = scanner.nextInt();

        System.out.print("Final Exam Score: ");
        int finalExam = scanner.nextInt();

        System.out.print("Project Score: ");
        int project = scanner.nextInt();

        System.out.print("Attendance Percentage: ");
        int attendance = scanner.nextInt();

        int total = midTerm + finalExam + project + attendance;
        double average = total / 400.0;

        System.out.println();
        System.out.println("STUDENT SCORE");
        System.out.println("Midterm Exam Score: " + midTerm);
        System.out.println("Final Exam Score: " + finalExam);
        System.out.println("Project Score: " + project);
        System.out.println("Attendance Score: " + attendance);
        System.out.println();
        System.out.println("Average Score: " + average * 100);

        if (average < 0.75) {
            System.out.println("Remarks: FAILED");
        } else {
            System.out.println("Remarks: PASSED");
        }


    }
}