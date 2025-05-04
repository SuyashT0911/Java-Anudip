import java.util.Scanner;

public class calc {
    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter 1st Number:");
            int n1 = sc.nextInt();

            System.out.println("Enter 2nd Number:");
            int n2 = sc.nextInt();

            System.out.println("Enter Operator:");
            int operator = sc.next().charAt(0);

            double addition = n1 + n2;
            double subtraction = n1 - n2;
            double multiplication = n1 * n2;
            double division = n1 / n2;

            switch (operator) {
                case '+': {
                    System.out.println("Total after Addition is : " + addition);
                    break;
                }
                case '-': {
                    System.out.println("Total after Subtraction is : " + subtraction);
                    break;
                }
                case '*': {
                    System.out.println("Total after Multiplication is : " + multiplication);
                    break;
                }
                case '/': {
                    System.out.println("Total after Division is : " + division);
                    break;
                }
                default: {
                    System.out.println("Please select proper operator");
                    return;
                }
            }

        } catch (ArithmeticException e) {
            System.out.println("Devide by zero is not allowed");
        } finally {
            System.out.println("Execution done");

        }
    }
}
