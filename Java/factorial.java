public class factorial {
    public static void main(String[] args) {
        int num = 5;
        System.out.println("Factorial is " + factorial1(num));
    }

    public static int factorial1(int n) {
        int fact = 1;
        // int fact = 1, i;
        // for (i = 2; i <= n; i++)
        // fact *= i;
        // return fact;
        for (int i = 5; i >= 1; i--) {
            fact = fact * i;
        }
        return fact;
    }
}
