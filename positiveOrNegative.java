// write a java program for print a number is positive or negative and 
// also print the number is even or odd by using switch case 

import java.util.Scanner;

public class positiveOrNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number: ");
        double number = scanner.nextDouble();

//  for knowing positive or negative number

        if (number > 0) {
            System.out.println("Number is positive");
            
        }
        else if (number < 0){
            System.out.println("Number is negative ");
        }

        else{
            System.out.println(" give the valide nuimber ");

        }

// for knowing even or odd number

        if (number % 2 == 0) {
            System.out.println("Number is even");
            
        }
        else if (number % 2 != 0){
            System.out.println("Number is odd");
        }

        else{
            System.out.println(" give the valide nuimber ");

        }
       
        scanner.close();
 
    }
    
}
