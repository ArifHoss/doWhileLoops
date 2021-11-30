import java.util.Scanner;

public class BankSecuritySystem {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int password;

        do {
            System.out.print("Write password: ");
            password = read.nextInt();
        } while (password != 8819);

    }
}
/*
creating a bank security system. The user must insert the correct password in order to access payments.
The password is 8819.

Task
Write a program that will continuously take a password as input and output Write password, until the client inserts the correct password.
*/