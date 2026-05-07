import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int balance = 1000;

        try {

            System.out.println("Balance = " + balance);

            System.out.print("Enter deposit amount: ");
            int deposit = sc.nextInt();

            if (deposit < 0) {
                throw new IllegalArgumentException("Invalid deposit amount");
            }

            balance = balance + deposit;

            System.out.print("Enter withdraw amount: ");
            int withdraw = sc.nextInt();

            if (withdraw > balance) {
                throw new ArithmeticException("Insufficient funds");
            }

            balance = balance - withdraw;

            System.out.println("Final Balance = " + balance);

        }

        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        finally {
            System.out.println("Thank You");
        }

        sc.close();
    }
}
