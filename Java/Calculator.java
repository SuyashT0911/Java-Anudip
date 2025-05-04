
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        try {
            int result;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter num1:");
            int num1 = sc.nextInt();

            System.out.println("Enter num2:");
            int num2 = sc.nextInt();

            System.out.println("Enter the operator:");
            String op = sc.next();
            // System.out.println("enter the choice");
            // String ch = sc.next();
            switch (op) {
                case "+":
                    result = num1 + num2;
                    System.out.println(result);
                    break;

                case "-":
                    result = num1 - num2;
                    System.out.println(result);
                    break;

                case "*":
                    result = num1 * num2;
                    System.out.println(result);
                    break;
                case "/":
                    result = num1 / num2;
                    System.out.println(result);
                    break;

                default:
                    // System.out.println("Invalid Operator Input");
                    throw new IllegalArgumentException("Invalid Operator Input");
            }
        } catch (ArithmeticException e) {
            System.out.println("Devide by zero is not allowed");
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }

    }
}
