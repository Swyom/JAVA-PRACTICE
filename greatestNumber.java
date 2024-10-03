import java.util.Scanner;

public class greatestNumber {
    
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.print("enter the number from 1 to 10 : ");
        double number = scanner.nextDouble();

        if (number > 5 ) {
            System.out.print("number is greater ");
            
        }

        else if (number == 5 ) {
            System.out.print("number is equal ");
            
        }

        else {
            System.out.print("number is smaller");
        }

        scanner.close();
    }
}
