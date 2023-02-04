import java.util.Scanner;

public class Account {

    static void debit(double debit, double balance) {
        if (debit > balance) {
            System.out.println("Debit amount exceeded account balance");
        }
        else {
            System.out.println("Remaining Balance : " + (balance - debit));
        }


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER ACCOUNT BALANCE");
        double balance = scanner.nextDouble();
        System.out.println("ENTER DEBIT AMOUNT");
        double debit = scanner.nextDouble();
        debit(debit,balance);
        }
    }



