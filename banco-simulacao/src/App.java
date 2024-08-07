import java.util.Scanner;

public class App {
    private static int choice;
    public static void main(String[] args) throws Exception {

        var sc = new Scanner(System.in);

        System.out.println("Enter account holder's name: ");
        String name = sc.nextLine();

        System.out.println("Enter initial balance: ");
        double initialBalance = sc.nextDouble();

        var account = new Account(name, initialBalance);

        while (choice != 4) {
            System.out.println("""
                        1 - Check Balance
                        2 - Deposit Money
                        3 - Withdraw Money
                        4 - Exit
                    """);
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Current balance: " + account.getBalance());
                    break;
                case 2:
                    System.out.println("Enter deposit amount: ");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 3:
                    System.out.println("Enter withdrawal amount: ");
                    double withdrawalAmount = sc.nextDouble();
                    account.withdraw(withdrawalAmount);
                    break;
                case 4:
                    System.out.println("Thank you for using the bank. Goodbye!");
                    sc.close();
            }
        }

    }
}
