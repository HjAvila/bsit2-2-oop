public class Main {
    public static void Main(String[] args) {

        BankAccount acc1 = new BankAccount("Hans Avila", 5000);
        BankAccount acc2 = new BankAccount("John Doe", 3000);
        BankAccount acc3 = new BankAccount("Jane Smith", 10000);
        System.out.println("Welcome to " + BankAccount.bankName);
        System.out.println("=====================================");

        acc1.deposit(2000);
        acc1.withdraw(1500);

        acc2.deposit(1000);
        acc2.withdraw(500);

        acc3.withdraw(2000);
        acc3.deposit(5000);

        acc1.displayAccountInfo();
        acc2.displayAccountInfo();
        acc3.displayAccountInfo();

        System.out.println("Total Accounts Created: " + BankAccount.totalAccounts);
    }
}