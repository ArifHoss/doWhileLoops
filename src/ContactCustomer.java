import java.util.Scanner;

public class ContactCustomer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.print("Enter number: ");
            number = scanner.nextInt();
            if(number == 1){
                System.out.println("Language selection");
            }else if(number == 2){
                System.out.println("Customer support");
            }else if(number == 3){
                System.out.println("Check the balance");
            }else if(number == 4){
                System.out.println("Check loan balance");
            }

        }
        while(number != 0);
        System.out.println("Exit");
    }
}
/*
You are creating an automated phone system for bank clients.
Number selections should activate the actions noted below as follows:
1 => Language selection
2 => Customer support
3 => Check account balance
4 => Check loan balance
0 => Exit

You can use the first 4 commands in a random sequence without interrupting the phone call - only the number 0 does.
Write a program that will continuously take a number as input and output the corresponding message, until the client enters 0.
 */