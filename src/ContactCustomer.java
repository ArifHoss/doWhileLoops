import java.util.Scanner;

public class ContactCustomer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            //take input and output corresponding message
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
        /*
       1 => Language selection
       2 => Customer support
       3 => Check the balance
       4 => Check loan balance
       0 => Exit
       */

        }
        while(number != 0);
        System.out.println("Exit");
    }
}
