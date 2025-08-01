import java.util.Scanner;

public class Main  {
    public static void main(String[] args ) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;

        System.out.println("INPUT A 5 NUMBER");
        for (int i = 1; i <= 5; i++) {

            System.out.print("Enter number " + i + ": ");
            int number = scanner.nextInt();
            total += number;
        }

        System.out.println();
        System.out.println("Total Number: " + total);

        scanner.close();
    }
}




