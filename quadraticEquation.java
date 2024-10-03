import java.util.Scanner;

public class quadraticEquation {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter a: ");
        double a=sc.nextDouble();
        System.out.print("Enter b: ");
        double b=sc.nextDouble();
        System.out.print("Enter c: ");
        double c =sc.nextDouble();

        double discriminant= b*b-4*a*c;


        if (discriminant > 0){
            double root1 = (-b + Math.sqrt(discriminant))/(2 * a);
            double root2 = (-b - Math.sqrt(discriminant))/(2 * a);

            System.out.println("roots:"+ root1 + "and"+ root2);
        }

        else if(discriminant == 0){
            double root = -b/(2 * a);
            System.out.println("root:"+root);
        }

        else{
            System.out.println("the equation has comples root ");
        }

    sc.close();

    }
}
