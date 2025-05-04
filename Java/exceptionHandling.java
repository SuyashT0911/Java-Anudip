import java.util.Scanner;

public class exceptionHandling {
    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter numerator:");
            int numerator = sc.nextInt();
            // System.out.println(numerator);

            System.out.println("Enter Denomenator:");
            int Denomenator = sc.nextInt();
            // System.out.println(Denomenator);

            int result = numerator / Denomenator;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Devide by zero is not allowed");
        } finally {
            System.out.println("Execution done");
        }
    }
}
